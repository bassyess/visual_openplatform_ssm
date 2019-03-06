package com.bupt.web.admin.web.controller;

import com.bupt.commons.constant.ConstantUtils;
import com.bupt.domain.TbUser;
import com.bupt.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private TbUserService tbUserService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 登录逻辑
     * @param email
     * @param password
     * @param httpServletRequest
     * @param model
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(required=true) String email,@RequestParam(required=true) String password,HttpServletRequest httpServletRequest,Model model){
        TbUser tbUser = tbUserService.login(email,password);

        // 登录失败
        if(tbUser == null){
            model.addAttribute("message","用户名或密码错误");
            return login();
        }

        // 登录成功
        else{
            // 记录登录信息
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,tbUser);
            return "redirect:/main";
        }
    }

    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        return login();
    }
}
