package top.soft.class03response.response;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import top.soft.class03response.HelloServlet;

import java.io.IOException;

/**
 * @author 我辰昊
 * @description: 转发和重定向测试
 * @date 2024/9/28 14:28
 */

@WebServlet("/responseDemo02")
public class ResponseDemo02 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //转发
        request.getRequestDispatcher("/responseDemo01?username=zhangsan").forward(request,response);
        //重定向
        //resp.sendRedirect("/responseDemo01?username=zhangsan");
        //其他
        // resp.sendRedirect("http://www.baidu.com");
    }
}
