package com.example.controller;

import com.example.model.Address;
import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengqa
 * @create 2018-05-03 15:06
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        User zs = new User("<b>张三</b>", 16);
        zs.setId(1);
        User ls = new User("李四", 21);
        ls.setId(2);
        List<Address> list = new ArrayList<>();
        Address a1 = new Address();
        a1.setArea("铁西区");
        a1.setStreet("兴华街");
        Address a2 = new Address();
        a2.setArea("和平区");
        a2.setStreet("三好街");
        Address a3 = new Address();
        a3.setArea("大东区");
        a3.setStreet("未知街");
        list.add(a1);
        list.add(a2);
        list.add(a3);
        zs.setAddress(list);

        model.addAttribute("user1", zs);
        model.addAttribute("user2", ls);
        model.addAttribute("className", "redClass");
        return "hello";
    }

    @RequestMapping("/details")
    public String details(@RequestParam("userId") Integer userId, Model model) {
        User zs = new User("张三", 16);
        zs.setId(1);
        User ls = new User("李四", 21);
        ls.setId(2);
        if (userId == 1) {
            model.addAttribute("user", zs);
        } else if (userId == 2) {
            model.addAttribute("user", ls);
        }
        return "details";
    }
}
