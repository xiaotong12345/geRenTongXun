package org.example;

import jakarta.annotation.PostConstruct;
import org.example.controller.PhoneController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Client {
    @Autowired
    private PhoneController phoneController;
    public static void main(String[] args){
        SpringApplication.run(Client.class,args);
    }

    @PostConstruct
    public void run(){
        Scanner scanner=new Scanner(System.in);
        int choose;
        while(true){
            System.out.println("1:查看联系人，2：添加，3：更改，4：删除");
            System.out.println("输入操作:");
            choose=scanner.nextInt();
            phoneController.controller(choose);
        }
    }
}