/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class JDBCsample {
    // username of the database
    private static final String USERNAME="dbuser";
   // password for database
    private static final String PASSWORD="dbpassword";
    //link of the database
    private static final String CONN="jdbc:mysql://localhost/school";
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        try {
            con=DriverManager.getConnection(CONN, USERNAME, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println(e);
        }
        finally{
        if(con!=null)
        {
            con.close();
        }
        }
        
    }
    
}
