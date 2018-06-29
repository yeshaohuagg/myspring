package com.yeshao;

import javafx.scene.paint.Stop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public HelloSpring helloSpring(){
        return new HelloSpring();
    }
    @Bean
    public StartHandle startHandle(){
        return new StartHandle();
    }
    @Bean
    public StopHandle stopHandle(){
        return new StopHandle();
    }
}
