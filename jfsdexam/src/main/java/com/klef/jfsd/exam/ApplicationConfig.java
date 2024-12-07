
package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(1, "John Doe", 50000.0, "IT", Arrays.asList("Java", "Spring", "Hibernate"));
    }

    @Bean
    public Instructor instructor() {
        return new Instructor(101, "Dr. Smith", "dr.smith@example.com", "1234567890");
    }

    @Bean
    public Course course() {
        Course course = new Course(201, "Spring Framework", 3);
        course.setInstructor(instructor()); // Autowiring Instructor
        return course;
    }
}
