package us.co.douglas.assessor.util;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;
import us.co.douglas.assessor.dao.AccountDAO;
import us.co.douglas.assessor.dao.AccountDAOImpl;
import us.co.douglas.assessor.model.NeighborhoodSale;
import us.co.douglas.assessor.model.Parcel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mdronamr on 2/18/16.
 */

public class AllParcelsThread implements Runnable {
    private static Log log = LogFactory.getLog(AllParcelsThread.class);
    private static AccountDAO accountDAO = new AccountDAOImpl();
    private static long threadSleepTime = ((1000 * 60) * 60) * 24; //((1000(milli seconds) * 60) * 60(minutes)) * 24(hours)
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    private List<String> accountNumList;

    public AllParcelsThread(List accountNumList) {
        this.accountNumList = accountNumList;
    }

    public void run() {
        try {
            while(true) {
                synchronized(AllParcelsThread.class) {
                    for (String searchableString : accountNumList) {
                        String[] searchableStringTokens = searchableString.split(":");
                        String accountNo = searchableStringTokens[0];
                        log.info("******* accountNo: " + accountNo);
                        Parcel parcel = accountDAO.getParcel(accountNo);
                        //SerializeDeserializeUtil.serialize(parcel, "/Users/admin/development/jsonDocs/" + accountNo + ".ser");
                        MongoDBConnectionUtil.insertParcel(parcel);
                    }
                }
                log.info("Updated the cache with parcels at " + dateFormat.format(Calendar.getInstance().getTime()) + ". Sleeping for " + (threadSleepTime / 60000) / 60 + " hours");
                Thread.sleep(threadSleepTime);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}