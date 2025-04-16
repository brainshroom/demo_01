package com.example.demo_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Demo01Controller {
    @RequestMapping("/")
    String index(){
        return "index";//htmlを編集して返す
    }
    
}
