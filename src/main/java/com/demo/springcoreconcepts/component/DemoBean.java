package com.demo.springcoreconcepts.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public DemoBean() {
        System.out.println("Execution is in DemoBean class.");
    }

}
