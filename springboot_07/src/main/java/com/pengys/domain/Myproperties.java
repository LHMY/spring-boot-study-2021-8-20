package com.pengys.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= "classpath:test.yml")
@ConfigurationProperties(
        prefix = "test",
        ignoreUnknownFields = true
)
public class Myproperties {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myproperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
