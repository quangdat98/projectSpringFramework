package example.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        obj1.getMessage1();
        obj1.getMessage2();

        HelloVietNam obj2 = (HelloVietNam) context.getBean("helloVN");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();
    }
}
