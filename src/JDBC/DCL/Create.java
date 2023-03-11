package JDBC.DCL;

import java.sql.*;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/student" +
                "" +
                "";
        String username="root";
        String password="Yash@1410";
        Connection connection= DriverManager.getConnection(url,username,password);

        Statement statement= connection.createStatement();
        String insertQuery="create table Employee (empId int(10) primary key, empName varchar(25)";
        statement.execute(insertQuery);
        System.out.println("table created");

        connection.close();
    }
}
