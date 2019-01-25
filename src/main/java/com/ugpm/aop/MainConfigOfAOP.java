package com.ugpm.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 22:52 2019/1/23
 * AOP的一些配置测试
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {
    //业务逻辑类加入到容器中
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
    //切面类加入到容器中
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
