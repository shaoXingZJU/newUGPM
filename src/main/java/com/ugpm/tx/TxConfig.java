package com.ugpm.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 10:16 2019/1/25
 * 声明式事务
 *
 */

@Configuration
public class TxConfig {
    //数据源
//    @Bean
//    public DataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("root");
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/Xing/mydb2");
//        return dataSource;
//    }

//    @Bean
//    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
//        //Spring对@Configuration类会特殊处理：给容器中加组件的方法多次调用只是从容器中找组件
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
//        return jdbcTemplate;
//    }
}
