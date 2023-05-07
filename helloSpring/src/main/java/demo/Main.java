package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //getting beans from the context defined in resources/spring.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //beans: context in spring
        Staff staff1 = context.getBean(Doctor.class);
        Staff staff2 = context.getBean(Nurse.class);
        staff1.assist();
        staff2.assist();

        //value of qualification was injected from the XML itself.
        Doctor staff = context.getBean(Doctor.class);   //getter setter to get qualification.
        System.out.println(staff.getQualification());
    }
}
