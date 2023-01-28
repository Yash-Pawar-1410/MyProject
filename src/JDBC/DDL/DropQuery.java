package JDBC.DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //getConnection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@1410");

        // execute query
        Statement statement= connection.createStatement();
        String executeQuery="drop table Courses";
        boolean dropTable= statement.execute(executeQuery);
        System.out.println("drop table "+dropTable);

        //close connection
        connection.close();
    }
}
