package JDBC.DML;

import java.sql.*;
import java.util.Scanner;

public class InsertPrepearedstatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register with registerDriver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@1410");
         // execute query
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
                "  values(?,?,?,?)";
        PreparedStatement preparedStatement= connection.prepareStatement(insertQueries);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,course_name);
        preparedStatement.setString(3,course_duration);
        preparedStatement.setInt(4,course_fees);

        int executeUpdate= preparedStatement.executeUpdate();
        System.out.println("inserted "+executeUpdate);

        //close connection
        connection.close();
    }
}
