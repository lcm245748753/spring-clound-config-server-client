package com.example.democonfigtest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class PollingConfig {

    @Autowired
    private ContextRefresher contextRefresher;
    // @EventListener刷新注解，一旦这个这个应用完成了将执行什么
    @EventListener(ApplicationReadyEvent.class)
    //项目启动完重新获取一次数据(刷新，从新从服务器获取)
    public void refresh() {
        contextRefresher.refresh();
    }

}
