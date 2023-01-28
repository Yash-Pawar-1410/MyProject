package JDBC.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // class load and register driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="Yash@1410";
        Connection connection= DriverManager.getConnection(url , username, password);

        //execute query
        Statement statement= connection.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter course id");
        int id=sc.nextInt();
        System.out.println("enter course name");
        String course_name=sc.next();
        System.out.println("enter course duration");
        String course_duration=sc.next();
        System.out.println("enter course fees");
        int course_fees=sc.nextInt();

        String insertQueries="insert into TheCourses (id,course_name,course_duration,course_fees)" +
                "  values('"+id+"','"+course_name+"','"+course_duration+"','"+course_fees+"')";
        int executeUpdate=statement.executeUpdate(insertQueries);
        System.out.println("inserted "+executeUpdate);

        // close connection
        connection.close();
    }
}
