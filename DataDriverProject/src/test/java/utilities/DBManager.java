package utilities;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBManager {

	public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // replace below details
        String url = "jdbc:postgresql://10.20.0.58:5432/test";
        String username = "postgres";
        String password = "postgres";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            // create object for the Statement class
            Statement st = db.createStatement();
            // execute the quesry on database
            ResultSet rs = st.executeQuery("SELECT * FROM rumsessiontable_sdk");
            System.out.println("Data retrieved from the PostgreSQL database ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | "+rs.getString(2) +" | "+ rs.getString(3));
            }
            rs.close();
            // close the result set
            st.close();
            //close the database connection
            db.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
}
