package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class helloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        System.out.println("hello helloServlet。。。。。");
        //获取请求资源
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        //存储
        req.setAttribute("key",name);
        System.out.println("hello servlet");
        //响应
        resp.getWriter().println("Hello servlet");
        resp.getWriter().print(name);
        resp.getWriter().println(pwd);

        //重定向
        //resp.sendRedirect("https://www.baidu.com/");
    }


}
