package org.example.Controller;

import jakarta.annotation.Resource;
import org.example.pojo.Phone;
import org.example.service.PhoneService;
import org.example.util.Result;
import org.springframework.web.bind.annotation.*;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-29
 * @Description: controller
 * @Version: 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("phone")
public class PhoneController {
    @Resource
    private PhoneService phoneService;
    @PostMapping("show")
    public Result show(){
        Result result=phoneService.show();
        return result;
    }
    @PostMapping("add")
    public Result add(@RequestBody Phone phone){
        Result result=phoneService.add(phone);
        return result;
    }
    @PostMapping("update")
    public Result update(@RequestBody Phone phone){
        Result result=phoneService.updatePhone(phone);
        return result;
    }
    @PostMapping("delete")
    public Result delete(@RequestParam int id){
        Result result=phoneService.delete(id);
        return result;
    }
}
