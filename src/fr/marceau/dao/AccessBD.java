
package fr.marceau.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joelg
 */
public class AccessBD {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_NAME = "marceaujava";
    private static final String URL = "jdbc:mysql://localhost/" + DB_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    static{
        try {
            Class.forName(DRIVER_NAME).newInstance();
        } catch (Exception e) {
            System.out.println("err bd " + e.getMessage());
        }
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
