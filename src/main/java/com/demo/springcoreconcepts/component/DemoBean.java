package com.demo.springcoreconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

    protected DemoBean() {
        logger.debug("Execution is in DemoBean class.");
    }

}
