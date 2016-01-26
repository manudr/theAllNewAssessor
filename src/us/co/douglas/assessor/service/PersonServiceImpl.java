package us.co.douglas.assessor.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import us.co.douglas.assessor.model.Person;

import javax.ws.rs.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Path("/person")
@Consumes("application/json")
@Produces("application/json")
public class PersonServiceImpl implements PersonService {

    private static Log log = LogFactory.getLog(PersonServiceImpl.class);

    private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

    @Override
    @GET
    @Path("/{id}/get")
    public Person getPerson(@PathParam("id") int id) {
        return persons.get(id);
    }

    @GET
    @Path("/{id}/getDummy")
    public Person getDummyPerson(@PathParam("id") int id) {
        Person p = new Person();
        return p;
    }

    @Override
    @GET
    @Path("/getAll")
    public Person[] getAllPersons() {
        log.info("getAllPersons()...");
        createPersons();
        log.info("persons.size(): " + persons.size());
        Set<Integer> ids = persons.keySet();
        Person[] p = new Person[ids.size()];
        int i=0;
        for(Integer id : ids){
            p[i] = persons.get(id);
            i++;
        }
        return p;
    }

    public void createPersons() {
        Person p = new Person(1,1,"Samsung Electronics","Mobile Devices, Semiconductor, Personal Computing",212.68,2013,326000,137.91,"Seoul, South Korea");
        persons.put(1, p);

        p = new Person(2,2,"Apple Inc.","Mobile Devices, Personal Computing, Consumer software",182.79,2014,98000,616.59,"Cupertino, CA, USA (Silicon Valley)");
        persons.put(2, p);

        p = new Person(3,3,"Foxconn","OEM Component Manufacturing",132.07,2013,1290000,32.15,"New Taipei, Taiwan");
        persons.put(3, p);

        p = new Person(4,4,"HP","Personal Computing and Servers, Consulting",111.45,2014,317500,65.30,"Palo Alto, CA, USA (Silicon Valley)");
        persons.put(4, p);

        p = new Person(5,5,"IBM","Computing services, Mainframes",99.75,2013,433362,188.21,"Armonk, NY, USA");
        persons.put(5, p);

        p = new Person(6,6,"Amazon.com","Internet Retailer, App Hosting",88.99,2014,154100,175.22,"Seattle, WA, USA");
        persons.put(6, p);

        p = new Person(7,7,"Microsoft","Business computing",86.83,2014,128076,370.31,"Redmond, WA, USA");
        persons.put(7, p);

        p = new Person(8,8,"Sony","Electronic Devices, Personal Computing",72.34,2014,146300,17.60,"Tokyo, Japan");
        persons.put(8, p);

        p = new Person(9,9,"Panasonic","Electronics Devices & Components",70.83,2013,293742,22.70,"Osaka, Japan");
        persons.put(9, p);

        p = new Person(10,10,"Google","Internet Advertising, Search Engine, Miscellaneous",59.82,2013,53546,396.24,"Mountain View, CA, USA (Silicon Valley)");
        persons.put(10, p);
    }
}