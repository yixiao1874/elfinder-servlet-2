package cn.bluejoe.elfinder.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String  login(){
        return "main";
    }
}
