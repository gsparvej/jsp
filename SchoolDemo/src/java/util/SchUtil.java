
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SchUtil {
    
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/schooljsp";
    private static String user = "root";
    private static String password = "1234";
    private static String driver = "com.mysql.cj.jdbc.Driver";

   public static Connection getCon() {
   
        try {
            Class.forName(driver);
            try {
                con=DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(SchUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SchUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   return con;
   }
}
