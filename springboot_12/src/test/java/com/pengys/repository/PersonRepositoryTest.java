package com.pengys.repository;

import com.pengys.domain.Address;
import com.pengys.domain.Family;
import com.pengys.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private  PersonRepository personRepository;


    @Test
    void save() {
        Person person = new Person();
        person.setId("002");
        person.setLastName("悟");
        person.setFirstName("空");

        Address address = new Address();
        address.setNation("中国");
        address.setVillage("南京");
        person.setAddress(address);

        List<Family> familyList = new ArrayList<>();
        Family father = new Family();
        father.setType("father");
        father.setName("杨康");
        Family mother = new Family();
        mother.setType("mother");
        mother.setName("穆念慈");
        familyList.add(father);
        familyList.add(mother);
        person.setFamilyList(familyList);

        System.out.println(personRepository.save(person));
    }



//需要连接Redis数据库
    @Test
    void findPersonByFirstName() {
        Optional<Person> personByFirstName = personRepository.findPersonByFirstName("过");
        if (personByFirstName.isPresent()) {
            Person person = personByFirstName.get();
            System.out.println("person = " + person);
        }
    }
}