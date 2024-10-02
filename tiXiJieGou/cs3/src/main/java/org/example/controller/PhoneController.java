package org.example.controller;

import jakarta.annotation.Resource;
import org.example.service.PhoneService;
import org.springframework.stereotype.Controller;

/*
 * @Author: xiaotong
 * @CreateTime: 2024-09-29
 * @Description: controller
 * @Version: 1.0
 */
@Controller
public class PhoneController {
    @Resource
    private PhoneService phoneService;
    public void controller(int choose){
        switch (choose){
            case 1-> phoneService.show();
            case 2->phoneService.add();
            case 3->phoneService.updatePhone();
            case 4->phoneService.delete();
        }
    }
}
