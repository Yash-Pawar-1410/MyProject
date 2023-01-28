package JDBC.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register the driver with driver manager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="Yash@1410";
        Connection connection= DriverManager.getConnection(url,username,password);

        //execute the queries
        Statement statement=connection.createStatement();
        String insertQuery="INSERT INTO TheCourses" +
                "(id, course_name, course_duration, course_fees) " +
                "values('17','manual testing','8','25000')";
        int executeUpdate= statement.executeUpdate(insertQuery);
        System.out.println("data insert "+executeUpdate);

        // close connection
        connection.close();
    }
}
