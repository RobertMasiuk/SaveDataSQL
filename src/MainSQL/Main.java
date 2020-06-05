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
/*

        try {
            String url = "jdbc:mysql://localhost/quiz";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            st.executeUpdate("SELECT * FROM pytania");
                    //                   "VALUES (1001, '2', '2.', '3', 3)");
         /*   st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1002, 'McBeal', 'Ms.', 'Boston', 2004)");
            st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1003, 'Flinstone', 'Mr.', 'Bedrock', 2003)");
            st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1004, 'Cramden', 'Mr.', 'New York', 2001)");
*/
  /*          conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
*/

    }
}
