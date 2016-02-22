package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.NeighborhoodSale;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mdronamr on 2/18/16.
 */

public class AllNeighborhoodSalesThread implements Runnable {
    private static Log log = LogFactory.getLog(AllNeighborhoodSalesThread.class);
    private static AccountDAO accountDAO = new AccountDAOImpl();
    private static long threadSleepTime = ((1000 * 60) * 60) * 24; //((1000(milli seconds) * 60) * 60(minutes)) * 24(hours)
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    private static List<NeighborhoodSale> allNeighborhoodSales = null;

    public void run() {
        try {
            while(true) {
                synchronized(AllNeighborhoodSalesThread.class) {
                    allNeighborhoodSales = accountDAO.getAllNeighborhoodSales();
                    InMemoryCache.getCacheMap().put("allNeighborhoodSales", allNeighborhoodSales);
                    SerializeDeserializeUtil.serialize(allNeighborhoodSales, "/Users/admin/development/jsonDocs/allNeighborhoodSales.ser");
                    InMemoryCache.getCacheMap().put("allNeighborhoodSalesCached", true);
                }
                log.info("Updated the cache with allNeighborhoodSales at " + dateFormat.format(Calendar.getInstance().getTime()) + ". Sleeping for " + (threadSleepTime / 60000) / 60 + " hours");
                Thread.sleep(threadSleepTime);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}