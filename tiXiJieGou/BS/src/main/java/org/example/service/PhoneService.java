package org.example.service;

import org.example.pojo.Phone;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.util.Result;
import org.springframework.stereotype.Service;

/**
* @author xiaotong
* @description 针对表【phone】的数据库操作Service
* @createDate 2024-09-29 22:05:35
*/
@Service
public interface PhoneService extends IService<Phone> {
    Result show();

    Result add(Phone phone);

    Result updatePhone(Phone phone);

    Result delete(int id);
}
