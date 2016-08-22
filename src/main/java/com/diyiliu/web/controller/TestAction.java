package com.diyiliu.web.controller;

import com.diyiliu.web.entity.User;
import com.diyiliu.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Description: TestAction
 * Author: DIYILIU
 * Update: 2016-08-22 09:34
 */

@Controller
@RequestMapping("/test")
public class TestAction {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/delete")
    public String deleteUser(@RequestParam int id){

        User user = new User();
        user.setId(id);

        userService.delete(user);

        return "ok!";
    }
}
