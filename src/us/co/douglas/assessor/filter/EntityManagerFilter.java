package us.co.douglas.assessor.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import java.io.IOException;

/**
 * Created by mdronamr on 2/16/16.
 */
public class EntityManagerFilter implements Filter {
    private static Log log = LogFactory.getLog(EntityManagerFilter.class);
    private static EntityManagerFactory theEntityManagerFactory = null;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("EntityManagerFilter - doFilter...");
        EntityManager entityManager = null;
        try {
            entityManager = theEntityManagerFactory.createEntityManager();
            log.info("entityManager: " + entityManager);
            EntityManagerUtil.ENTITY_MANAGERS.set(entityManager);
            log.info("EntityManagerFilter - setting entityManager...");
            chain.doFilter(request,response);
            EntityManagerUtil.ENTITY_MANAGERS.remove();
            log.info("EntityManagerFilter - removing entityManager...");
        } catch(Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (entityManager != null)
                    entityManager.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void init(FilterConfig config) {
        log.info("EntityManagerFilter - init...");
        destroy();
        theEntityManagerFactory = Persistence.createEntityManagerFactory("theAllNewAssessor");
        log.info("theEntityManagerFactory: " + theEntityManagerFactory);
    }

    public void destroy() {
        log.info("EntityManagerFilter - destroy...");
        if (theEntityManagerFactory != null) {
            log.info("Previous theEntityManagerFactory exists. Destroying it...");
            theEntityManagerFactory.close();
        }
    }
}