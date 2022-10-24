package dbTests.select;

import dbTests.DbHelper;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQ extends DbHelper {

    @Test(description = "Select from db customer table")
    public void selectCustomersNumber() {
        try {
            String query = "SELECT * FROM classicmodels.customers;";
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                System.out.println(results.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db customer table")
    public void selectCustomersName() {
        try {
            String query = "SELECT * FROM classicmodels.customers;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db customer table")
    public void selectContactLastName() {
        try {
            String query = "SELECT * FROM classicmodels.customers;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
