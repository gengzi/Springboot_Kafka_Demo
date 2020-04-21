package fun.gengzi.controller;

import fun.gengzi.bean.User;
import lombok.Cleanup;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@Controller
public class LombokController {


    @RequestMapping("/userinfo")
    private User getUserInfo() {
        User user = new User();
        user.setUsername("user");
        user.setPasswrod(null);
        System.out.println(user.toString());
        return null;
    }

    @RequestMapping("/userinfo2")
    private User getUserInfo2(@NonNull User user) {
        System.out.println(user.toString());
        return null;
    }

    @RequestMapping("/upload")
    private void getUserInfo2(File file1,File file2) throws IOException {
        @Cleanup
        InputStream in = new FileInputStream(file1);
        @Cleanup
        OutputStream out = new FileOutputStream(file2);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }

    public static void main(String[] args) {
        LombokController lombokController = new LombokController();
        lombokController.getUserInfo();
    }


}
