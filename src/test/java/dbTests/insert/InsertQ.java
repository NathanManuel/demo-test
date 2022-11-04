package dbTests.insert;

import dbTests.DbHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class InsertQ extends DbHelper {

    @Test(description = "Select from db employees table")
    public void insertEmployeesNumber() {
        try {
            String query = "INSERT INTO classicmodels.employees VALUES (2, 'van Velden', 'Nathan', 'x0001', 'nathan@email.com',1,1002, 'Visiter')";
//            String query = "UPDATE classicmodels.employees SET  lastName = 'van Velden' WHERE employeeNumber = 2";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.employees WHERE employeeNumber = 2;";
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
    public void insertOfficesCode() {
        try {
            String query = "INSERT INTO classicmodels.offices VALUES (8,'Oradea', '+301235612','Str. Nufărului 87', '-' , 'Bihor','Romania','40021','NA')";
//            String query = "UPDATE classicmodels.employees SET  lastName = 'van Velden' WHERE employeeNumber = 2";
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
    public void insertOrdersOrderDate() {
        try {
            String query = "INSERT INTO classicmodels.orders VALUES (1,'2022-05-11','2022-05-23', '2022-05-23 ','shipped',null, 363)";
//            String query = "UPDATE classicmodels.employees SET  lastName = 'van Velden' WHERE employeeNumber = 2";
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
    public void insertContactCoutnry() {
        try {
            String query = "INSERT INTO classicmodels.customers VALUES (1, 'vanVans','van Velden', 'Nathan', '03212341', 'somewhere',null,'Oradea', 'Bihor', '400213','Romania',1166,0.00)";
//            String query = "UPDATE classicmodels.employees SET  lastName = 'van Velden' WHERE employeeNumber = 2";
            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM classicmodels.customers WHERE customerNumber = 1;";
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
    public void insertProductlines() {
        try {
            String query = "INSERT INTO classicmodels.productlines VALUES ('Cars',null, null,null)";
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
