/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkash_reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayeed
 */
public class DBconnect {
    
    /**
     * Connect with database
     * Supports MySql and SqLite Database
     * @return Connection
     */
    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:SMSdb.db");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: In DB Class connect "+e);
            return null;
        }
    }
}