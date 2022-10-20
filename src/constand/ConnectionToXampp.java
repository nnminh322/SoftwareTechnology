/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constand;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nnminh322
 */
public class ConnectionToXampp {

    public static Connection getConnection() {

        var url = "jdbc:mysql://localhost:3306/mydatabase";
        var user = "root";
        var password = "";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionToXampp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void close(Connection conn) {

        try {
            if (conn != null) {
                conn.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionToXampp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
