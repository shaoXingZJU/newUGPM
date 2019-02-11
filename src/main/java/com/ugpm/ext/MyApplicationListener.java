package com.ugpm.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 9:54 2019/2/4
 * 事件监听器功能
 */
@Component
public class MyApplicationListener implements ApplicationListener {
    //当容器中事件触发时
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到的事件"+event);
    }
}
