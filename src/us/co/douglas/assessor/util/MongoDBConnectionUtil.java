package us.co.douglas.assessor.util;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.client.FindIterable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bson.Document;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import us.co.douglas.assessor.model.Employee;
import us.co.douglas.assessor.model.Parcel;

public class MongoDBConnectionUtil {

    private static Log log = LogFactory.getLog(MongoDBConnectionUtil.class);
    private static MongoDatabase mongoDatabase = getMongoDatabase();
    private static MongoCollection<Document> collection = mongoDatabase.getCollection("jsonDocs");

    public static MongoDatabase getMongoDatabase() {
        log.info("getMongoDBConnection()...");
        MongoClientURI uri = new MongoClientURI("mongodb://manudr:manudr@ds015508.mongolab.com:15508/manudr");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("manudr");
        return mongoDatabase;
    }

    public static void insertDocument(Map<String,Object> mapData) {
        log.info("insertDocument()...");
        collection.insertOne(new Document(mapData));
    }

    public static void insertParcel(Parcel parcel) {
        log.info("insertParcel()...");
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(parcel);
            Document doc = Document.parse(jsonString);
            collection.insertOne(doc);
            log.debug("Total number of docs: " + collection.count());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void showAllDocuments(MongoCollection<Document> collection) {
        log.info("showAllDocuments");
        for (Document doc: collection.find()) {
            log.debug(doc.toJson());
        }
    }

    public static String getParcelByAccountNo(String accountNo) {
        log.info("getParcelByAccountNo()...");
        log.debug("Total number of docs: " + collection.count());
        FindIterable<Document> iterable = collection.find(new Document("account.accountNo", accountNo)); //accountNo" : R0490386
        log.debug("iterable.first(): " + iterable.first());
        return iterable.first().toJson();
    }

    public static void deleteAllDocuments(MongoCollection<Document> collection) {
        log.info("deleteAllDocuments()...");
        for (Document doc: collection.find()) {
            collection.deleteOne(doc);
        }
    }

    public static void showAllDocs(DBCollection collection) {
        log.info("showAllDocs()...");
        DBCursor cursor = (DBCursor) collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                log.debug(cursor.next().toString());
            }
        } finally {
            cursor.close();
        }
    }


}