package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.annotation.WebServlet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    @WebServlet("/hello") // This is used if we want to use external tomcat

    public static void main(String[] args) throws LifecycleException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Tomcat tomcat= new Tomcat();

        // If we want to change the port number
//        tomcat.setPort(8081);

        Context context= tomcat.addContext("",null);
        // Here first argument is the context name second parameter is the name of the servlet and the third parameter is the object of the servlet
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");
        tomcat.start();
        // If we want the  tomcat to wait and keep running
        tomcat.getServer().await();
    }
}