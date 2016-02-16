package us.co.douglas.assessor.util;

import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.NeighborhoodSale;
import us.co.douglas.assessor.model.Parcel;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by mdronamr on 2/2/16.
 */

public class CacheThreadListener implements Runnable, ServletContextListener {

    private static Log log = LogFactory.getLog(CacheThreadListener.class);
    private static AccountDAO accountDAO = new AccountDAOImpl();
    private static long threadSleepTime = ((1000 * 60) * 60) * 24; //((1000(milli seconds) * 60) * 60(minutes)) * 24(hours)
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    private static List<String> allSearchableStrings = null;
    private static List<NeighborhoodSale> allNeighborhoodSales = null;

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        log.info("ServletContextListener destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        log.info("ServletContextListener started");
        CacheThreadListener runnableExample = new CacheThreadListener();
        Thread myThread = new Thread(runnableExample);
        myThread.start();
    }

    public void run() {
        try {
            while(true) {
                synchronized(CacheThreadListener.class) {
                    allSearchableStrings = accountDAO.getAllSearchableStrings();
                    SerializeDeserializeUtil.serialize(allSearchableStrings, "allSearchableStrings.ser");
                    allSearchableStrings = (List<String>)SerializeDeserializeUtil.deserialize("allSearchableStrings.ser");
                    InMemoryCache.getCacheMap().put("allSearchableStrings", allSearchableStrings);

                    allNeighborhoodSales = accountDAO.getAllNeighborhoodSales();
                    SerializeDeserializeUtil.serialize(allNeighborhoodSales, "allNeighborhoodSales.ser");
                    allNeighborhoodSales = (List<NeighborhoodSale>)SerializeDeserializeUtil.deserialize("allNeighborhoodSales.ser");
                    InMemoryCache.getCacheMap().put("allNeighborhoodSales", allNeighborhoodSales);
                    int maxAccounts = 250;
                    int count = 0;
                    for (String searchableString : allSearchableStrings) {
                        String[] searchableStringTokens = searchableString.split(":");
                        String accountNo = searchableStringTokens[0];
                        Parcel parcel = accountDAO.getParcel(accountNo);
                        SerializeDeserializeUtil.serialize(parcel, accountNo + ".ser");
                        count++;
                        if (count >= maxAccounts) {
                            break;
                        }
                    }
                }
                log.info("Updated the cache with data at " + dateFormat.format(Calendar.getInstance().getTime()) + ". Sleeping for " + (threadSleepTime / 60000) / 60 + " hours");
                Thread.sleep(threadSleepTime);
            }

            /*
            log.info("!!!!!!!!!!!!!!!!!! THREAD HAS BEEN DISABLED !!!!!!!!!!!!!!!!!!");

            allSearchableStrings = (List<String>)SerializeDeserializeUtil.deserialize("allSearchableStrings.ser");
            InMemoryCache.getCacheMap().put("allSearchableStrings", allSearchableStrings);

            allNeighborhoodSales = (List<NeighborhoodSale>)SerializeDeserializeUtil.deserialize("allNeighborhoodSales.ser");
            InMemoryCache.getCacheMap().put("allNeighborhoodSales", allNeighborhoodSales);
            */

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}