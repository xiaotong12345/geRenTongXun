package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.example.pojo.Phone;
import org.example.service.PhoneService;
import org.example.mapper.PhoneMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

/**
* @author xiaotong
* @description 针对表【phone】的数据库操作Service实现
* @createDate 2024-09-29 21:10:24
*/
@Service
public class PhoneServiceImpl extends ServiceImpl<PhoneMapper, Phone>
        implements PhoneService{
    @Resource
    private PhoneMapper phoneMapper;
    @Override
    public void show() {
        List<Phone> phones = phoneMapper.selectList(null);
        for (Phone phone1 : phones) {
            System.out.println(phone1);
        }
    }

    @Override
    public void add() {
        Phone phone=new Phone();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入姓名、手机号、地址：");
        phone.setName(scanner.nextLine());
        phone.setNumber(scanner.nextLine());
        phone.setAddress(scanner.nextLine());
        phoneMapper.insert(phone);
        System.out.println("添加成功");
    }

    @Override
    public void updatePhone() {
        Phone phone=new Phone();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入id,姓名、手机号、地址：");
        phone.setId(scanner.nextInt());
        scanner.nextLine();
        phone.setName(scanner.nextLine());
        phone.setNumber(scanner.nextLine());
        phone.setAddress(scanner.nextLine());
        phoneMapper.updateById(phone);
        System.out.println("修改成功");
    }

    @Override
    public void delete() {
        int id;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入id");
        id=scanner.nextInt();
        phoneMapper.deleteById(id);
        System.out.println("删除成功");
    }
}




