package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.example.pojo.Phone;
import org.example.service.PhoneService;
import org.example.mapper.PhoneMapper;
import org.example.util.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

/**
* @author xiaotong
* @description 针对表【phone】的数据库操作Service实现
* @createDate 2024-09-29 22:05:35
*/
@Service
public class PhoneServiceImpl extends ServiceImpl<PhoneMapper, Phone>
    implements PhoneService{
    @Resource
    private PhoneMapper phoneMapper;
    @Override
    public Result show() {
        List<Phone> phones = phoneMapper.selectList(null);
        return Result.ok(phones);
    }

    @Override
    public Result add(Phone phone) {
        phone.setId(null);
        phoneMapper.insert(phone);
        return Result.ok(null);
    }

    @Override
    public Result updatePhone(Phone phone) {
        phoneMapper.updateById(phone);
        return Result.ok(null);
    }

    @Override
    public Result delete(int id) {
        phoneMapper.deleteById(id);
        return Result.ok(null);
    }
}




