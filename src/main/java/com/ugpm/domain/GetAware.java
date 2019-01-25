package com.ugpm.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 21:10 2019/1/22
 * 实现Aware接口，获取Spring底层的一些组件
 */
@Component
public class GetAware implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware{
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的IOC容器："+applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("****="+name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String value = resolver.resolveStringValue("系统为${os.name},也支持Spring表达式语言#{20*18}");
        System.out.println(value);
    }
}
