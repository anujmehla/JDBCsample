package jdbcsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
  // username of the database
    private static final String USERNAME="dbuser";
   // password for database
    private static final String PASSWORD="dbpassword";
    //link of the database
    private static final String CONN="jdbc:mysql://localhost/school";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    }
}
