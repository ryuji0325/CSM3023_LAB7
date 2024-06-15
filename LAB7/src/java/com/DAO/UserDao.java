/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import com.Model.User;
import com.Util.DBConnection;

public class UserDao {
    private Connection connection;
    public UserDao()throws ClassNotFoundException{
        connection=DBConnection.getConnection();
        
    }
    
    public void addUser(User user){
        try{
            PreparedStatement ps=connection.prepareStatement("insert into users(userid,firstname,lastname) values(?,?,?)");
            ps.setString(1, user.getUserid());
            ps.setString(2,user.getFirstname());
            ps.setString(3, user.getLastname());
            ps.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void deleteUser(String userid){
        try{
            PreparedStatement ps=connection.prepareStatement("delete from users where userid=?");
            ps.setString(1, userid);
            ps.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void updateUser(User user){
        try{
            PreparedStatement ps=connection.prepareStatement("update users set firstname=?, lastname=? where userid=?");
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getUserid());
            ps.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<User> getAllUsers(){
        List<User> users=new ArrayList<User>();
        try{
            Statement statement=connection.createStatement();
            ResultSet rs =statement.executeQuery("select * from users");
            while(rs.next()){
                User user=new User();
                user.setUserid(rs.getString("userid"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                users.add(user);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    
    public User getUserById(String userid){
        User user=new User();
        try{
            PreparedStatement ps=connection.prepareStatement("select* from users where userid=?");
            ps.setString(1, userid);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                user.setUserid(rs.getString("userid"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}
