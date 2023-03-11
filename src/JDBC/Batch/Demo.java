package JDBC.Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="Yash@1410";
        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement= connection.createStatement();
        String insertQuery="insert into student (id,course_name,course_duration,course_fees) values ('2','AWS','6','22000')";
        String insertQuery1="insert into student (id,course_name,course_duration,course_fees) values ('10','java','8','43000')";
        String insertQuery2="insert into student (id,course_name,course_duration,course_fees) values ('4','core java','3','10000')";
        String insertQuery3="insert into student (id,course_name,course_duration,course_fees) values ('3','full stack','11','55000')";

        statement.addBatch(insertQuery);
        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);

        int [] array=statement.executeBatch();
        System.out.println("data insert");

        connection.close();
    }
}
