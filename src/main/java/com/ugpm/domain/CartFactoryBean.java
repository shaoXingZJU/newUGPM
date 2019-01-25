package com.ugpm.domain;

import com.ugpm.pojo.Cart;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 20:44 2019/1/14
 * 创建一个Spring定义的工厂Bean
 */
public class CartFactoryBean implements FactoryBean<Cart> {

    //返回一个Cart对象，这个对象会添加到容器中
    @Override
    public Cart getObject() throws Exception {
        System.out.println("CartFactoryBean getObject new Cart");
        return new Cart();
    }

    @Override
    public Class<?> getObjectType() {
        return Cart.class;
    }

    //true为单实例，false为多例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
