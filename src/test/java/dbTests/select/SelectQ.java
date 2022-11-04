package dbTests.select;

import dbTests.DbHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQ extends DbHelper {

    @Test(description = "Select from db employees table")
    public void selectEmployeesNumber() {
        try {
            String query = "SELECT * FROM classicmodels.employees WHERE employeeNumber = 1002;";
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                System.out.println(results.getString(1));
                System.out.println(results.getString("firstName"));
            Assert.assertEquals(results.getInt("employeeNumber"), 1002);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db offices table", enabled = true)
    public void selectOficesCode() {
        try {
            String query = "SELECT * FROM classicmodels.offices WHERE officeCode = 1;";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(2));
                Assert.assertEquals(results.getInt(1), 1);;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db orders table", enabled = true)
    public void selectOrdersOrderDate() {
        try {
            String query = "SELECT * FROM classicmodels.orders WHERE orderDate = '2003-01-06';";
            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString(3));
                Assert.assertEquals(results.getString("orderDate"), "2003-01-06");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Select from db customer table", enabled = true)
    public void selectContactCoutnry() {
        try {
            String query = "SELECT * FROM classicmodels.customers WHERE country = 'France';";
            ResultSet results = stmt.executeQuery(query);
            while (results.next()) {
                Assert.assertTrue(results.getString("country").contains("France"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
