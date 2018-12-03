package cn.javaex.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javaex.entity.User;
import cn.javaex.service.UserService;

/*User控制类*/

@Controller
@RequestMapping(value="/user")
public class UserController {

   // @Resource(name="userService") 
    @Autowired
    private UserService userService;

    @RequestMapping(value="/findUser")
    public String findUser(Model model) {
        int id = 1;
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
