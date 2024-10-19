package top.soft.class04cookiesession.cookie;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @description: TODO 
 * @author 我辰昊
 * @date 2024/10/19 14:03
 *
 */

@WebServlet("/cookieDemo02")
public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
        Cookie[] cookies=req.getCookies();
//
        for(Cookie cookie:cookies){
            String name=cookie.getName();
            if("username".equals(name)){
                System.out.println("value的结果是"+cookie.getValue());
                break;
            }
        }
    }
}
