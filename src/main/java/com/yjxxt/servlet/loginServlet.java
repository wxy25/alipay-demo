package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设定编码
        //请求的编码格式
        req.setCharacterEncoding("utf-8");
        //响应的编码格式
        resp.setContentType("text/html;charset=utf-8");

        //获取请求信息
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname + "--->" + pwd);

        //对比
        if("admin".equals(uname) && "123456".equals(pwd)){
            //登录成功了
            //request作用域
            req.setAttribute("uname",uname);

            //转发到登录成功的页面
            req.getRequestDispatcher("login_succes.jsp").forward(req,resp);
            return;
        }else {
            //登录失败了
            //重定向
            resp.sendRedirect("login_error.jsp?msg=账号或密码不正确");
        }
    }
}
