package cn.bluejoe.elfinder.test;

import cn.bluejoe.elfinder.controller.user.User;
import cn.bluejoe.elfinder.util.HSQLUtil;

import java.sql.*;
import java.util.UUID;
import java.util.logging.Logger;

public class TestHsqldb {
    public static void main(String[] args) {
//        HSQLUtil2.startHSQL();
//
//        try {
//            System.out.println("start to connect hsqldb and excute statements\n");
//            Statement statement = HSQLUtil.getConnection().createStatement();
//            statement.executeUpdate("create table if not exists user(username varchar(32) not null,password varchar(32) not null");
//                String sql = "insert into user values('admin','admin')";
//                int count = statement.executeUpdate(sql);
//                System.err.println("excute [ " + sql + " ] "+ (count > 0 ? "Ok" : "Bad"));
//            statement.close();
//        } catch (SQLException ex) {
//        }
//        HSQLUtil2.stopHSQL();
//        System.out.println("\ndisconnect to hsqldb");
        Connection conn = HSQLUtil.getConnection();
        User user = HSQLUtil.queryUser("admin",conn);
        System.out.println(user.getUserName() + user.getUserPwd());
    }
}
