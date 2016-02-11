package us.co.douglas.assessor.util;

import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.NeighborhoodSale;

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
    private static long threadSleepTime = ((1000 * 60) * 60) * 24; //((1000(milli seconds) * 60) * 60(minutes)) * 5(hours)
    private  static SimpleDateFormat dateFormat = new SimpleDateFormat();

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
                    List<String> allSearchableStrings = accountDAO.getAllSearchableStrings();
                    //List<String> allSearchableStrings = SerializeDeserializeUtil.deserialize();
                    InMemoryCache.getCacheMap().put("allSearchableStrings", allSearchableStrings);

                    List<NeighborhoodSale> allNeighborhoodSales = accountDAO.getAllNeighborhoodSales();
                    //List<String> allSearchableStrings = SerializeDeserializeUtil.deserialize();
                    InMemoryCache.getCacheMap().put("allNeighborhoodSales", allNeighborhoodSales);

                    log.info("Updated the cache with data at " + dateFormat.format(Calendar.getInstance().getTime()) + ". Sleeping for " + (threadSleepTime / 60000) / 60 + " hours");
                    Thread.sleep(threadSleepTime);
                }
            }
        } catch (Exception e) {
            log.info("Interrupted.");
        }
    }
}