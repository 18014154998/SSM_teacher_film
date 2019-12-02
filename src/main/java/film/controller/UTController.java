package film.controller;

import film.pojo.Ut;
import film.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:刘平远
 * @Date：2019/10/8 11:06
 * @verson 1.0
 **/
@Controller
public class UTController {

    @Autowired
    UserTestService usertestService;

    @RequestMapping("/utest1")
    public String name1(Ut ut){
        boolean b=usertestService.registerUser(ut);
        System.out.println(b);
        return "ok";
    }

    @RequestMapping("/welcome")
    public String name2(){
        System.out.println("welcome");
        return "welcome";
    }
}
