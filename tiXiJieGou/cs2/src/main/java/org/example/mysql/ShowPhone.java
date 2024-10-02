package org.example.mysql;

import org.example.pojo.Phone;
import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-29
 * @Description: 查
 * @Version: 1.0
 */
public class ShowPhone {
    Connection connection= GetConnect.getConnect();
    public void show() throws SQLException {
        String sql="select * from phone";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        List<Phone> phones=new ArrayList<>();
        while(resultSet.next()){
            Phone phone=new Phone();
            phone.setAddress(resultSet.getString("address"));
            phone.setName(resultSet.getString("name"));
            phone.setNumber(resultSet.getString("number"));
            phone.setId(resultSet.getString("id"));
            phones.add(phone);
        }
        for (Phone phone1 : phones) {
            System.out.println(phone1);
        }
    }
}
