/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Util;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection myConnection=null;
    private static String myURL=myURL="jdbc:mysql://localhost/csf3023";
    
    DBConnection(){
        
    }
    
    public static Connection getConnection() throws ClassNotFoundException{
        if(myConnection != null){
            return myConnection;
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                myConnection=DriverManager.getConnection(myURL,"root","admin");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return myConnection;
    }
    
    public void closeConnection() throws ClassNotFoundException{
        try{
            myConnection.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
