package JDBC.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // class load and register the driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@1410");

        // execute the query
        Statement statement=connection.createStatement();
        String updateQuery="update TheCourses set course_duration='10' where id=17";
        int executeUpdate=statement.executeUpdate(updateQuery);
        System.out.println("updated "+executeUpdate);

        //close connection
        connection.close();

    }
}
