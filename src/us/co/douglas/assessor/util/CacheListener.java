package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.NeighborhoodSale;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by mdronamr on 2/2/16.
 */

public class CacheListener implements ServletContextListener {

    private static Log log = LogFactory.getLog(CacheListener.class);
    private static Boolean startThreads = false;

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        log.info("ServletContextListener destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        log.info("ServletContextListener started");
        if (startThreads) {
            log.info("Starting all the threads!!!");
            AllSearchableStringsThread allSearchableStringsThread = new AllSearchableStringsThread();
            Thread allSearchableStringsT = new Thread(allSearchableStringsThread);
            allSearchableStringsT.start();

            AllNeighborhoodSalesThread allNeighborhoodSalesThread = new AllNeighborhoodSalesThread();
            Thread allNeighborhoodSalesT = new Thread(allNeighborhoodSalesThread);
            allNeighborhoodSalesT.start();

            AllParcelsThread allParcelsThread = new AllParcelsThread();
            Thread allParcelsT = new Thread(allParcelsThread);
            allParcelsT.start();
        } else {
            log.info("All the threads are disabled!!!");
        }
    }
}