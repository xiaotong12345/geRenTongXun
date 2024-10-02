package org.example.mysql;

import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-29
 * @Description: 删
 * @Version: 1.0
 */
public class DeletePhone {
    Connection connection= GetConnect.getConnect();
    public void delete() throws SQLException {
        int id;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入id");
        id=scanner.nextInt();
        String sql = "delete from phone where id="+id;
        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("删除成功");
    }
}
