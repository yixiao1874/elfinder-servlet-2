package cn.bluejoe.elfinder.util;

import cn.bluejoe.elfinder.controller.user.User;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HSQLUtil {


    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost","sa","");
            System.out.println("connect to test ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("connect fail");
        }
        return conn;
    }

    public static User queryUser(String userName,Connection conn){
        User user = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select username,password from customer where username = " +userName);
            while (rs.next()){
                user = new User();
                user.setUserName(rs.getString("userName"));
                user.setUserPwd(rs.getString("password"));
            }
        }catch (Exception e){
            return user;
        }
        return user;
    }

    public static void registerUser(User user,Connection conn){
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO customer VALUES ("+user.getUserName()+","+user.getUserPwd()+")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert(String userName,String userPwd,Connection conn){
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        registerUser(user,conn);
    }

}
