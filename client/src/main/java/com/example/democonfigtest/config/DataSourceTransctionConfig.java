package com.example.democonfigtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

@Configuration
public class DataSourceTransctionConfig {


    //   DataSourceTransactionManager进行事务管理，初始化事物
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource);
        return tm;
    }
    //DefaultTransactionDefinition接口，控制事物属性
    @Bean
    public DefaultTransactionDefinition transactionDefinition() {
        return new DefaultTransactionDefinition();
    }

}
