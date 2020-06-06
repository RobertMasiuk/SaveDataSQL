package MainSQL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz","root", "");
        System.out.print("Database is connected !");
        conn.close();
    }
    catch(Exception e) {
        System.out.print("Do not connect to DB - Error:" + e);
    }


    }
}
