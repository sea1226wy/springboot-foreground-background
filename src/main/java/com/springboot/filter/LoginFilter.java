package com.springboot.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther Seay
 * @date 2019/4/24 16:28
 * 描叙：自定义servlet3.0的Filter
 */
/*@WebFilter(urlPatterns = "/api*//*",filterName = "LoginFilter")*/
public class LoginFilter implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.print("init loginFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFIlter loginFilter");
        ServletRequest req = (HttpServletRequest)servletRequest;
        ServletResponse resp = (HttpServletResponse)servletResponse;
        String username = req.getParameter("username");
        if("wy".equals(username)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            return;
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy loginFilter");
    }
}