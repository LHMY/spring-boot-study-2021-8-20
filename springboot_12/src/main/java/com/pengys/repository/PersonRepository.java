package com.pengys.repository;


import com.pengys.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person,String> {
    @Override
    <S extends Person> S save(S entity);


    Optional<Person> findPersonByFirstName(String s);

}
