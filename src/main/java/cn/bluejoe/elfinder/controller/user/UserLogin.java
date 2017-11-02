package cn.bluejoe.elfinder.controller.user;

import cn.bluejoe.elfinder.util.HSQLUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;

/**
 * Created by 14999 on 2017/11/1.
 */
@Controller
@RequestMapping("user")
public class UserLogin {


    @RequestMapping("index")
    public String index(){
        return "userLogin";
    }

    @RequestMapping("login")
    public ModelAndView login(String userName, String userPwd){
        ModelAndView modelAndView = new ModelAndView();
        Connection conn = HSQLUtil.getConnection();
        User user = HSQLUtil.queryUser(userName,conn);
        if(user == null){
            modelAndView.setViewName("redirect:registerPage");
            return modelAndView;
        }else{
            if(user.getUserPwd().equals(userPwd)){
                modelAndView.setViewName("redirect:/");
                return modelAndView;
            }else{
                return modelAndView;
            }
        }
    }

    @RequestMapping("registerPage")
    public String registerPage(){
        return "userRegister";
    }

    @RequestMapping("register")
    public String register(String userName,String userPwd){
        Connection conn = HSQLUtil.getConnection();
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        HSQLUtil.registerUser(user,conn);
        return "redirect:index";
    }

}
