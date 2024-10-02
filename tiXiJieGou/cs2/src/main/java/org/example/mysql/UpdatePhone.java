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
 * @Description: 改
 * @Version: 1.0
 */
public class UpdatePhone {
    Connection connection= GetConnect.getConnect();
    public void update() throws SQLException {
        Phone phone=new Phone();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入id,姓名、手机号、地址：");
        phone.setId(scanner.nextLine());
        phone.setName(scanner.nextLine());
        phone.setNumber(scanner.nextLine());
        phone.setAddress(scanner.nextLine());
        String sql="update phone set number=?,name=?,address=? where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,phone.getNumber());
        preparedStatement.setString(2,phone.getName());
        preparedStatement.setString(3,phone.getAddress());
        preparedStatement.setString(4,phone.getId());
        preparedStatement.execute();
        System.out.println("修改成功");
    }
}
