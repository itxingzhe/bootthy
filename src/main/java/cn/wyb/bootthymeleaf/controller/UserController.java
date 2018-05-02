package cn.wyb.bootthymeleaf.controller;

import cn.wyb.bootthymeleaf.model.po.UserPO;
import cn.wyb.bootthymeleaf.model.vo.CommResponse;
import cn.wyb.bootthymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create Time: 2018年04月26日 13:06
 * C@author wyb
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "toLogin",method = RequestMethod.GET)
    public String init(Model m){
        m.addAttribute("user",userService.getUser(1));
        m.addAttribute("token","user-token");
        return "user/toLogin";
    }

    @RequestMapping(value = "toRegister",method = RequestMethod.GET)
    public String register(Model m){
        m.addAttribute("token","user-token");
        return "user/register";
    }

    @RequestMapping(value = "toUpdate",method = RequestMethod.GET)
    public String toUpdate(Model m,Integer id){
        UserPO user = userService.getUser(3);
        m.addAttribute("user",user);
        return "user/toUpdate";
    }

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    @ResponseBody
    public CommResponse addUser(UserPO user){
        Integer row =  userService.save(user);
        return CommResponse.success(row);
    }

    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    @ResponseBody
    public CommResponse updateUser(UserPO user){
        Integer row =  userService.update(user);
        return CommResponse.success(row);
    }
}
