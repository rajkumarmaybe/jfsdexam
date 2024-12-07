
package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {

    public static void main(String[] args) {
        // Load the ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Fetch the beans
        Employee employee = context.getBean(Employee.class);
        Course course = context.getBean(Course.class);

        // Print out the bean details
        System.out.println("Employee Details: " + employee);
        System.out.println("Course Details: " + course);
    }
}
