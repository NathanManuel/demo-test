package dbTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbHelper {

    String URL = "jdbc:mysql://localhost/classicmodels";
    String USER = "root";
    String PASSWORD = "";

    // Connection object
    public Connection con = null;
    // Statement object
    public Statement stmt = null;

    @BeforeTest
    public void setConn(){
        try {
            // Database connection
            String dbClass = "com.mysql.cj.jdbc.Driver";
            Class.forName(dbClass).newInstance();

            // Get connection to DB
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("BD Connected");

            // Statement object to send the SQL statement to the Database
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void closeConn() throws Exception {

        // Close DB connection
        if (con != null) {
            con.close();
        }
    }
}
