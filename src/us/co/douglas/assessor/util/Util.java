package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by mdronamr on 1/27/16.
 */
public class Util {
    private static Log log = LogFactory.getLog(Util.class);
    private  static SimpleDateFormat yyyyFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);

    public static String getTaxYear() {
        log.debug("getTaxYear()");
        Calendar cal = Calendar.getInstance();
        return yyyyFormat.format(cal.getTime());
    }
}
