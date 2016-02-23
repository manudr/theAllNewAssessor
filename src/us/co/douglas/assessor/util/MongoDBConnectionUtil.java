package us.co.douglas.assessor.util;


import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MongoDBConnectionUtil {
    private static Log log = LogFactory.getLog(MongoDBConnectionUtil.class);
    public static MongoClient getConnection() {
        MongoClient mongoClient = null;
        try {
            //MongoClientURI uri = new MongoClientURI("mongodb://root:root123@db1.avaldes.com:27017/?authSource=admin");
            MongoClientURI uri = new MongoClientURI("mongodb://manudr:manudr@ds015508.mongolab.com:15508/manudr");
            mongoClient = new MongoClient(uri);
            //DB db = mongoClient.getDB("manudr");
            MongoDatabase db = mongoClient.getDatabase("manudr");

            MongoCollection collection = db.getCollection("employee");

            log.info("Inserting using BasicDBObjects...");
            BasicDBObject basic1 = new BasicDBObject();
            basic1.put("_id", "1");
            basic1.put("type", "basic");
            basic1.put("first-name", "Amaury");
            basic1.put("last-name", "Valdes");
            collection.insertOne(basic1);
            log.info("Employee 1: " + basic1.toJson());

            BasicDBObject basic2 = new BasicDBObject();
            basic2.put("_id", "2");
            basic2.put("type", "basic");
            basic2.put("first-name", "Jane");
            basic2.put("last-name", "Valdes");
            collection.insertOne(basic2);
            log.info("Employee 2: " + basic2.toJson());

            log.info("collection: " + collection);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return mongoClient;
    }
}