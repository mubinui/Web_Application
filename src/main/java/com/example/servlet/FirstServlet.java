package com.example.servlet;
import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet{
    //Life cycle methods
    ServletConfig config;
    public void init(ServletConfig config){
        this.config = config;
        System.out.println("->Creating object ......");
    }

    public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
        //Throws exception
        System.out.println("-> Servicing .........");
    }

    public void destroy(){
        System.out.println("-> Going to destroy Servlet Object ");
    }


    //Overriding non-Life cycle methods

    public ServletConfig getServletConfig(){
        return this.config;
    }
    public String getServletInfo(){
        return "This servlet is created by Mubin UIC";
    }


}
