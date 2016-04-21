package us.co.douglas.assessor.util;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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
import us.co.douglas.assessor.model.NeighborhoodSale;
import us.co.douglas.assessor.model.Parcel;

public class MongoDBConnectionUtil {

    private static Log log = LogFactory.getLog(MongoDBConnectionUtil.class);
    private static MongoDatabase mongoDatabase = getMongoDatabase();
    private static MongoCollection<Document> allSearchableStringsCollection = mongoDatabase.getCollection("allSearchableStrings");
    private static MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("jsonDocs");
    private static DB db = getMongoDB();
    private static DBCollection dbCollection = db.getCollection("test-manu");

    public static MongoDatabase getMongoDatabase() {
        log.info("getMongoDBConnection()...");
        MongoClientURI uri = new MongoClientURI("mongodb://manudr:manudr@ds015508.mongolab.com:15508/manudr");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("manudr");
        return mongoDatabase;
    }

    public static DB getMongoDB() {
        log.info("getMongoDB()...");
        MongoClientURI uri = new MongoClientURI("mongodb://manudr:manudr@ds015508.mongolab.com:15508/manudr");
        MongoClient mongoClient = new MongoClient(uri);
        DB mongoDB = mongoClient.getDB("manudr");
        return mongoDB;
    }

    public static void insertDocumentToMongoCollection(Map<String,Object> mapData) {
        log.info("insertDocument()...");
        mongoCollection.insertOne(new Document(mapData));
    }

    public static void insertParcel(Parcel parcel) {
        log.info("insertParcel()...");
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(parcel);
            Document doc = Document.parse(jsonString);
            mongoCollection.insertOne(doc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void showAllDocumentsFromMongoCollection() {
        log.info("showAllDocuments()...");
        log.info("Total number of docs: " + mongoCollection.count());
        for (Document doc: mongoCollection.find()) {
            log.info(doc.toJson());
        }
    }

    public static String getParcelByAccountNo(String accountNo) {
        log.info("getParcelByAccountNo()...");
        FindIterable<Document> iterable = mongoCollection.find(new Document("account.accountNo", accountNo)); //accountNo" : R0490386
        log.info("iterable.first(): " + iterable.first());
        return iterable.first().toJson();
    }

    public static void dropAllSearchableStringsCollection() {
        log.info("dropAllSearchableStringsCollection()...");
        try {
            allSearchableStringsCollection.drop();
            log.info("allSearchableStringsCollection.count(): " + allSearchableStringsCollection.count());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void insertAllSearchableStrings(List list) {
        log.info("insertAllSearchableStrings()...");
        try {
            Map<String,Object> insertAllSearchableStrings = new HashMap<String, Object>();
            insertAllSearchableStrings.put("10001", list);
            allSearchableStringsCollection.insertOne(new Document(insertAllSearchableStrings));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getAllSearchableStringsList() {
        log.info("getAllSearchableStringsList()...");
        FindIterable<Document> iterable = allSearchableStringsCollection.find();
        String json = null;
        if (iterable != null && iterable.first() != null) {
            json = iterable.first().toJson();
        }
        return json;
    }

    public static void deleteAllDocuments(MongoCollection<Document> collection) {
        log.info("deleteAllDocuments()...");
        for (Document doc: collection.find()) {
            collection.deleteOne(doc);
        }
    }

    public static void showAllDocsFromDBCollection() {
        log.info("showAllDocsFromDBCollection()...");
        DBCursor cursor = (DBCursor) dbCollection.find().iterator();
        try {
            while (cursor.hasNext()) {
                log.info(cursor.next().toString());
            }
        } finally {
            cursor.close();
        }
    }

    public static Object getNextDocFromDBCollection() {
        log.info("getNextDocFromDBCollection()...");
        DBCursor cursor = (DBCursor) dbCollection.find().iterator();
        Object obj = cursor.next();
        cursor.close();
        return obj;
    }

    public static void insertDocsToDBCollection(BasicDBObject doc) {
        log.info("insertDocsToDBCollection()...");
        try {
            dbCollection.drop();
            dbCollection.insert(doc);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void insertDocsToMongoCollection(Document doc) {
        log.info("insertDocsToDBCollection()...");
        try {
            mongoCollection.insertOne(doc);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void dropDBCollection() {
        log.info("dropDBCollection()...");
        try {
            dbCollection.drop();
            log.info("dbCollection.count(): " + dbCollection.count());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}