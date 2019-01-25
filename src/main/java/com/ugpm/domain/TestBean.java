package com.ugpm.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 13:45 2019/1/10
 */
@Data
@Component
public class TestBean {
    private int id;
    private String name;

    public void start(){
        System.out.println("start");
    }
}
