package com.demo.springcoreconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    private int empId;
    private String empName;

    @Autowired
    private DepartmentBean deptBean;

    public EmployeeBean() {
        logger.debug("Execution is in EmployeeBean class (Unparameterized constructor).");
    }

    /**
     * This Constructor is used for @Autowired on constructor
     * 
     * @param deptBean
     */
    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.debug("Execution is in EmployeeBean class (Parameterized constructor).");
        logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptBean;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    /**
     * This setter method is used for @Autowired on setter
     * 
     * @param deptBean
     */
    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on setter ***");
        this.deptBean = deptBean;
    }

    public void showEmployeeDetails() {
        logger.debug("Employee ID : {}", empId);
        logger.debug("Employee Name : {}", empName);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}", deptBean.getDeptName());
    }
}
