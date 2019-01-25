package com.ugpm.aop;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 10:27 2019/1/24
 */
public class MathCalculator {
    public int div(int i,int j){
        System.out.println("耦合的方式打印日志");
        return i/j;
    }
}
