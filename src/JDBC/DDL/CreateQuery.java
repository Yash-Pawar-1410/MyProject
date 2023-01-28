package JDBC.DDL;

import java.sql.*;

public class CreateQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url ="jdbc:mysql://localhost:3306/student";
        String username ="root";
        String password ="Yash@1410";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Execute the queries
        Statement statement = connection.createStatement();
        String createTableQuery = "CREATE TABLE TheCourses(id int primary key auto_increment, course_name varchar(100), course_duration varchar(20), course_fees int(100))";
        boolean isTableCreated = statement.execute(createTableQuery);
        System.out.println("Table created successfully "+isTableCreated);
        //5. close the connection
        connection.close();
    }
}
