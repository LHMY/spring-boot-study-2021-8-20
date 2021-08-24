package com.pengys;

import com.pengys.domain.Myproperties;
import com.pengys.domain.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot07ApplicationTests {
    @Autowired
    private Myproperties myproperties;
    @Test
    void contextLoads() {
        System.out.println("myproperties = " + myproperties);
    }



    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSpringXml(){
        Pet pet = (Pet)applicationContext.getBean("myPet");
        System.out.println("pet = " + pet);

    }


    @Test
    void testConfiguration(){

        Pet aPet = (Pet) applicationContext.getBean("aPet");
        System.out.println("aPet = " + aPet);

    }

}
