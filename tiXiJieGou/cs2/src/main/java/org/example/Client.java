package org.example;

import org.example.mysql.AddPhone;
import org.example.mysql.DeletePhone;
import org.example.mysql.ShowPhone;
import org.example.mysql.UpdatePhone;

import java.sql.SQLException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        int choose;
        while(true){
            System.out.println("1:查看联系人，2：添加，3：更改，4：删除");
            System.out.println("输入操作:");
            choose=scanner.nextInt();
            switch (choose){
                case 1->new ShowPhone().show();
                case 2->new AddPhone().add();
                case 3->new UpdatePhone().update();
                case 4->new DeletePhone().delete();
            }
        }
    }
}