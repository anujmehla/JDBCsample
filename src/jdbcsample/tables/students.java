package jdbcsample.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class students 
{
    public static void getStudents(ResultSet rs) throws SQLException
    {
        while(rs.next())
        {
            String fullStudentName=rs.getInt("Id")+" "+rs.getString("first_name")+" "+rs.getString("last_name");
            System.out.println(fullStudentName);
            
        }
    }
    
}
