package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    // This method will be executed whenever we get a request

    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("In service");
    }
}
