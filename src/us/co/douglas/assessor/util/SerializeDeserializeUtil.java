package us.co.douglas.assessor.util;

import jcifs.smb.SmbFile;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

/**
 * Created by mdronamr on 1/11/16.
 */
public class SerializeDeserializeUtil {

    private static Log log = LogFactory.getLog(SerializeDeserializeUtil.class);

    public static void serialize(Object obj, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object deserialize(String fileName) {
        try {
            MongoDBConnectionUtil.main(null);
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            in.close();
            fileIn.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
