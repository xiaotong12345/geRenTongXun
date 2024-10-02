package org.example.mysql;

import org.example.pojo.Phone;
import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-29
 * @Description: 增
 * @Version: 1.0
 */
public class AddPhone {
    Connection connection= GetConnect.getConnect();
    public void add() throws SQLException {
        Phone phone=new Phone();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入姓名、手机号、地址：");
        phone.setName(scanner.nextLine());
        phone.setNumber(scanner.nextLine());
        phone.setAddress(scanner.nextLine());
        String sql="insert into phone set number=?,name=?,address=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,phone.number);
        preparedStatement.setString(2,phone.name);
        preparedStatement.setString(3,phone.address);
        preparedStatement.execute();
        System.out.println("添加成功");
    }
}
