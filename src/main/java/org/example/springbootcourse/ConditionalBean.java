package org.example.springbootcourse;

import org.springframework.stereotype.Component;

@Component
public class ConditionalBean {
    public ConditionalBean() {
        System.out.println("not missing");
    }
    public ConditionalBean(String message) {
        System.out.println(message);
    }

    public String getMessage() {
        return "Conditional Bean Loaded!";
    }

}