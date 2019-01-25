package com.ugpm.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/1/24.
 */
public class MathCalculatorTest {
    @Test
    public void testAOP() throws Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,1);

        applicationContext.close();
    }

}