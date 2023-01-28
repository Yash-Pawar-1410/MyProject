package JDBC.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Yash@1410";
        Connection connection = DriverManager.getConnection(url, username, password);

        //execute the query
        Statement statement=connection.createStatement();
        String deleteQuery="delete from TheCourses where id = 1655 ";
        int executeUpdate=statement.executeUpdate(deleteQuery);
        System.out.println("deleted "+executeUpdate);

        // close connection
        connection.close();
    }
}
