package MainSQL;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "http://localhost/quiz/";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO quiz " +
                    "VALUES (1001, '2', '2.', '3', 3)");
         /*   st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1002, 'McBeal', 'Ms.', 'Boston', 2004)");
            st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1003, 'Flinstone', 'Mr.', 'Bedrock', 2003)");
            st.executeUpdate("INSERT INTO Customers " +
                    "VALUES (1004, 'Cramden', 'Mr.', 'New York', 2001)");
*/
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }


    }
}
