package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.BasicAccountInfo;
import us.co.douglas.assessor.model.NeighborhoodSale;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mdronamr on 2/18/16.
 */
public class AllSearchableStringsThread implements Runnable {
    private static Log log = LogFactory.getLog(AllSearchableStringsThread.class);
    private static AccountDAO accountDAO = new AccountDAOImpl();
    private static long threadSleepTime = ((1000 * 60) * 60) * 24; //((1000(milli seconds) * 60) * 60(minutes)) * 24(hours)
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    private static List<String> allSearchableStrings = null;
    private static List<BasicAccountInfo> allSearchableParcels = null;
    private static Integer maxAccountsPerThread = 25;

    public void run() {
        try {
            while(true) {
                synchronized(AllSearchableStringsThread.class) {
                    allSearchableStrings = accountDAO.getAllSearchableStrings();
                    InMemoryCache.getCacheMap().put("allSearchableStrings", allSearchableStrings);
                    SerializeDeserializeUtil.serialize(allSearchableStrings, "/Users/admin/development/jsonDocs/allSearchableStrings.ser");
                    InMemoryCache.getCacheMap().put("allSearchableStringsCached", true);

                    allSearchableParcels = accountDAO.getAllSearchableParcels();
                    InMemoryCache.getCacheMap().put("allSearchableParcels", allSearchableParcels);
                    SerializeDeserializeUtil.serialize(allSearchableParcels, "/Users/admin/development/jsonDocs/allSearchableParcels.ser");
                    InMemoryCache.getCacheMap().put("allSearchableParcelsCached", true);
                }

                List<List> accountNumListOfLists = new ArrayList<List>();
                List<String> accountNumList = new ArrayList<String>();
                for (String searchableString : allSearchableStrings) {
                    if (accountNumList.size() >= maxAccountsPerThread) {
                        //Reached maxAccountsPerThread so add this to main list and create a new list
                        accountNumListOfLists.add(accountNumList);
                        accountNumList = new ArrayList<String>();
                        accountNumList.add(searchableString);
                    } else {
                        accountNumList.add(searchableString);
                    }
                }
                log.info("Number of lists in main list: " + accountNumListOfLists.size());

                //for (List list : accountNumListOfLists) { //TODO remove the comments //
                    AllParcelsThread allParcelsThread = new AllParcelsThread(accountNumListOfLists.get(1));
                    Thread allParcelsT = new Thread(allParcelsThread);
                    allParcelsT.start();
                //}
                log.info("Updated the cache with allSearchableStrings at " + dateFormat.format(Calendar.getInstance().getTime()) + ". Sleeping for " + (threadSleepTime / 60000) / 60 + " hours");
                Thread.sleep(threadSleepTime);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}