package JDBC.DCL;

import java.sql.*;

public class RegisterToDriverManager {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load and register the driver with driver manager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // getConnection
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Yash@1410";
        Connection connection = DriverManager.getConnection(url, username, password);

        //execute the queries
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery("select * from TheCourse");

        // use the result
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")
                    +"\t"+resultSet.getString("course_name")
                    +"\t"+resultSet.getString("course_duration")
                    +"\t"+resultSet.getInt(" course_fees"));
        }
        connection.close();
    }
}
