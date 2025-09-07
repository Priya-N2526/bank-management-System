package src;
import java.sql.*;

public class jdbcconnection {
    Connection c;
    Statement s;
    public jdbcconnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///javabankmanagementsystem","root","priya@2526");
            s=c.createStatement();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
