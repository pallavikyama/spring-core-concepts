package com.demo.springcoreconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    public static final Logger logger = LoggerFactory.getLogger(DepartmentBean.class);
    private String deptName;

    public DepartmentBean() {
        logger.debug("Execution is in DepartmentBean class.");
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
