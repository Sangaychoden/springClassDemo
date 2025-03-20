package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import bt.edu.gcit.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Desktop dt = context.getBean("comp1",Desktop.class);
        // dt.compile();
        Alien obj = context.getBean(Alien.class);
        obj.code();

        // System.out.println("Hello world!");

        // Alien obj = new Alien();
        // obj.code();
     
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// creates a container

        // Alien obj = (Alien) context.getBean("alien"); // giving a variable to store a object type alien, context rrefer sto ico container. typcast to alien
        // another way
        // Alien obj1 = context.getBean("alien",Alien.class);

    
        // obj.code();                                                                                                                                                                                                                                                                    de();
        // System.out.println(obj.getAge());
        // Alien obj1 = (Alien) context.getBean("alien"); // creates
        // obj.code();

    }
}