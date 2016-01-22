package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.List;

/**
 * Created by mdronamr on 1/11/16.
 */
public class SerializeDeserializeUtil {

    private static Log log = LogFactory.getLog(SerializeDeserializeUtil.class);

    public static void serialize(Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream("serialized.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            log.info("Serialization Successful...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> deserialize() {
        List<String> allSearchableStrings = null;
        try {
            FileInputStream fileIn = new FileInputStream("serialized.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            log.info("Deserialize Successful: ");
            allSearchableStrings = (List<String>)in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return allSearchableStrings;
    }

}
