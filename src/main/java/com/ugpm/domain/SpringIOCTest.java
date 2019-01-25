package com.ugpm.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 11:38 2019/1/22
 */
@Data
@Component
public class SpringIOCTest {
    private TestBean testBean;


    public SpringIOCTest(@Autowired TestBean testBean){
        this.testBean=testBean;
        System.out.println("SpringIOCTest constructor");
    }

    public TestBean getTestBean() {
        return testBean;
    }

    //@Autowired
    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    //    public SpringIOCTest(TestBean testBean){
//        this.testBean=testBean;
//    }
    public void test() {
        System.out.println(testBean);
    }
}

