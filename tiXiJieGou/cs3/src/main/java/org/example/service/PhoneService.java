package org.example.service;

import org.example.pojo.Phone;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author xiaotong
* @description 针对表【phone】的数据库操作Service
* @createDate 2024-09-29 21:10:24
*/
@Service
public interface PhoneService extends IService<Phone> {
    void show();

    void add();

    void updatePhone();

    void delete();
}
