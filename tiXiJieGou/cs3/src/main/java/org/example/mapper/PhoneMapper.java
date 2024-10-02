package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Phone;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author xiaotong
* @description 针对表【phone】的数据库操作Mapper
* @createDate 2024-09-29 21:10:24
* @Entity org.example.pojo.Phone
*/
@Mapper
public interface PhoneMapper extends BaseMapper<Phone> {

}




