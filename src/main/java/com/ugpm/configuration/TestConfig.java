package com.ugpm.configuration;

import com.ugpm.domain.CartFactoryBean;
import com.ugpm.domain.TestBean;
import com.ugpm.pojo.Cart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 13:43 2019/1/10
 */
@Configuration
@PropertySource(value = {"classpath:my.properties"},ignoreResourceNotFound = true)
public class TestConfig {
    @Value("${myTest}")
    private String url;
    public TestConfig(){
        System.out.println("TestConfig constructor");
    }

    @Primary
    @Bean(initMethod = "start")
    public TestBean testBean01(){
        TestBean testBean = new TestBean();
        testBean.setId(1);
        return testBean;
    }

    @Bean
    public CartFactoryBean cartFactoryBean(){
        return new CartFactoryBean();
    }

}
