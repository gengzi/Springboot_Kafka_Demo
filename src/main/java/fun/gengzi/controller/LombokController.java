package fun.gengzi.controller;

import fun.gengzi.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LombokController {


    @RequestMapping("/userinfo")
    private User getUserInfo() {
        User user = new User();
        user.setUsername("user");
        System.out.println(user.toString());
        return null;
    }

    public static void main(String[] args) {
        LombokController lombokController = new LombokController();
        lombokController.getUserInfo();
    }


}
