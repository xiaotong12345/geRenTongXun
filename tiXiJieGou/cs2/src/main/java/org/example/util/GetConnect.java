package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-30
 * @Description: connect
 * @Version: 1.0
 */
public class GetConnect {
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");			//加载mysql驱动
            String str="jdbc:mysql://localhost:3306/tong";				//目标数据库地址
            String name="root";
            String password="tongmingyang666";
            Connection con= DriverManager.getConnection(str,name,password);		//connection连接，生成连接对象
            return con;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
