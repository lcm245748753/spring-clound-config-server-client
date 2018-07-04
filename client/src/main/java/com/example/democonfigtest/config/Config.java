package com.example.democonfigtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class Config {
    @Value("${spring.datasource.url:}")
    private String dataSourceUrl;
    @Value("${spring.datasource.username:}")
    private String dataUsername;
    @Value("${spring.datasource.password:}")
    private String dataPassword;
    @Value("${config-test-value:}")
    private String name;

    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public String getDataUsername() {
        return dataUsername;
    }

    public String getDataPassword() {
        return dataPassword;
    }

    public String getName() {
        return name;
    }
}
