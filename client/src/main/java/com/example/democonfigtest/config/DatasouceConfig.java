package com.example.democonfigtest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasouceConfig {
    @Autowired
    private Config config;

//    @Bean("defaultDataSoure")
//    public DataSource defaultDataSoure() {
//        String url = config.getDataSourceUrl();
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(config.getDataUsername());
//        dataSource.setPassword(config.getDataPassword());
//        dataSource.setMaxActive(20);
//        dataSource.setTestOnBorrow(true);
//        dataSource.setValidationQuery("SELECT 1");
//        return dataSource;
//    }
}
