package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// If we want to tell spring that this is a controller
@Controller
public class HomeController {
    // If we want to map the request to the home page
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    // If we want to use different variable name than the query params
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session){
        // This code is working without HttpServlet but we have to make sure that the name in query params and the name
        // given here is same
        // public String add(int num1,int num2, HttpSession session)


        int result = num + num2;

        session.setAttribute("result",result);
        System.out.println(result);
        System.out.println("in add");
        return "result.jsp";
    }
}
