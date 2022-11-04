package dbTests.delete;

import dbTests.DbHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteQ extends DbHelper {

    @Test(description = "Select from db employees table")
    public void deleteEmployeesNumber() {
        try {
            String query = "DELETE FROM classicmodels.employees WHERE employeeNumber = 2";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.employees;";
            ResultSet results2 = stmt.executeQuery(query2);
            while (results2.next()) {
                System.out.println(results2.getString("lastName"));
           Assert.assertEquals(results2.getInt("employeeNumber"), 2);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db offices table", enabled = true)
    public void deleteOfficesCode() {
        try {
            String query = "DELETE FROM classicmodels.offices WHERE officeCode = 8";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.offices WHERE officeCode = 8;";
            ResultSet results2 = stmt.executeQuery(query2);
            while (results2.next()) {
                System.out.println(results2.getString("city"));
                Assert.assertEquals(results2.getInt("officeCode"), 8);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(description = "Select from db orders table", enabled = true)
    public void deleteOrdersOrderDate() {
        try {
            String query = "DELETE FORM classicmodels.orders WHERE orderNumber = 1";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.orders WHERE orderNumber = 1;";
            ResultSet results2 = stmt.executeQuery(query2);
            while (results2.next()) {
                System.out.println(results2.getString("orderDate"));
                Assert.assertEquals(results2.getInt("orderNumber"), 1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Select from db customers table", enabled = true)
    public void deleteContactCoutnry() {
        try {
            String query = "DELETE FROM classicmodels.customers WHERE customerNumber = 1";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.customers WHERE customerName = 1;";
            ResultSet results2 = stmt.executeQuery(query2);
            while (results2.next()) {
                System.out.println(results2.getString("customerName"));
                Assert.assertEquals(results2.getInt("customerNumber"), 1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(description = "Select from db productlines table", enabled = true)
    public void deleteProductionline() {
        try {
            String query = "DELETE FROM classicmodels.productlines WHERE productLine = 'Cars'";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.productlines WHERE productLine = 'Cars';";
            ResultSet results2 = stmt.executeQuery(query2);
            while (results2.next()) {
                System.out.println(results2.getString("productLine"));
                Assert.assertEquals(results2.getString("productLine"), "Cars");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
