package us.co.douglas.assessor.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;

/**
 * Created by mdronamr on 2/16/16.
 */
public class EntityManagerUtil {
    private static Log log = LogFactory.getLog(EntityManagerUtil.class);
    public static final ThreadLocal<EntityManager>
    ENTITY_MANAGERS = new ThreadLocal<EntityManager>();

    /** Returns a fresh EntityManager */
    public static EntityManager getEntityManager() {
        log.info("ENTITY_MANAGERS: " + ENTITY_MANAGERS.get());
        return ENTITY_MANAGERS.get();
    }
}