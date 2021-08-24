package com.pengys.config;

import com.pengys.domain.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(name = "aPet")
    public Pet getPet(){

        return new Pet();
    }

}
