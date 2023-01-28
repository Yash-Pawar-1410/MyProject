package JDBC.DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register driver with registerDriver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@1410");

        // execute query
        Statement statement= connection.createStatement();
        String executeQuery="alter table TheCourses rename column course_fees to fees";
        String executeQuery1="alter table TheCourses rename column course_duration to duration";
        String executeQuery2="alter table TheCourses rename column course_name to name";
        boolean status= statement.execute(executeQuery);
        boolean status1= statement.execute(executeQuery1);
        boolean status2= statement.execute(executeQuery2);
        System.out.println("table alter "+status);
        System.out.println("table alter "+status1);
        System.out.println("table alter "+status2);

        //closeConnection
        connection.close();
    }
}
