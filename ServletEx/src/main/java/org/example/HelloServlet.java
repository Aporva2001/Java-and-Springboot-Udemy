package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


    // If we want to send the get request
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");

        // If we want to set the type of response to be sent to the server

        res.setContentType("text/html");

        // This is the better way of writing the response to the client

        PrintWriter out= res.getWriter();
        // we can also mention html tags inside it
        out.println("<h1>Hello world</h1>");
    }
}
