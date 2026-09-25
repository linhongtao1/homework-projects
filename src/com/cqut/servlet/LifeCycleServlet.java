package com.cqut.servlet;


import javax.servlet.*;
import java.io.IOException;

public class LifeCycleServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化...");
        String university = servletConfig.getInitParameter("university");
        System.out.println(university);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service方法");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy销毁...");
    }
}
