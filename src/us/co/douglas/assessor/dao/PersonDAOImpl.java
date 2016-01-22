package us.co.douglas.assessor.dao;

import us.co.douglas.assessor.model.Person;
import us.co.douglas.common.sql.JDBCHelper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    public Person getPerson(int id) {

        return null;
    }

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();
        return null;
    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.setLoginTimeout(5);
            String dbURL = "jdbc:sqlserver://dvrwsql.dcgd.douglas.co.us\\DVRW_Patch;user=manu;password=manu";
            connection = DriverManager.getConnection(dbURL);
        } catch (Exception ex) {
            throw new RuntimeException(ex);

        }
        return connection;
    }

}