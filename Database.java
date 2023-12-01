import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
public class Database {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "jainam");

            // Create a statement
            Statement smt = con.createStatement();

            // Execute a query
            ResultSet rs = smt.executeQuery("SELECT * FROM emp");

            // Iterate through the result set and print the "name" column
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }

            // Close resources
            rs.close();
            smt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
