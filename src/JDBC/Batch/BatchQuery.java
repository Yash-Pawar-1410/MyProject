package JDBC.Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register driver with the DriverRegister
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@1410");
        // executeQuery
        Statement statement= connection.createStatement();
        String insertQuery="insert into TheCourses (id,course_name,course_duration,course_fees) values ('515','AWS','6','22000')";
        String insertQuery1="insert into TheCourses (id,course_name,course_duration,course_fees) values ('54','sql','3','11000')";
        String insertQuery2="insert into TheCourses (id,course_name,course_duration,course_fees) values ('5','HTML5','2','15000')";
        String insertQuery3="insert into TheCourses (id,course_name,course_duration,course_fees) values ('6','CSS5','2','12000')";
        statement.addBatch(insertQuery);
        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);
         int[] ints= statement.executeBatch();
        System.out.println("data inserted");

        // closeConnection
        connection.close();
    }
}
