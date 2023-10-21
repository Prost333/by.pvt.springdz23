package by.pvt.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-conf.xml");
//        Student student= applicationContext.getBean("student", Student.class);
//        student.hello();
        ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student=applicationContext1.getBean("student", Student.class);
        student.hello();
    }
}