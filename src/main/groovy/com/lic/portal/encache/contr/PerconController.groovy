package com.lic.portal.encache.contr;

import com.lic.portal.encache.model.Person;
import com.lic.portal.encache.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "person")
@CacheConfig(cacheNames = "test")
class PerconController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    void addPerson(Person person) {
        person.setId(UUID.randomUUID().toString().replace("-",""));
        person.setAge(12);
        person.setName("test");
        personRepository.save(person);
    }

    @DeleteMapping
    void deletePerson(Long id) {
        personRepository.delete(id);
    }

    @GetMapping
    @Cacheable
    List allPersons() {
//        Person person = new Person();
//        person.setId(UUID.randomUUID().toString().replace("-",""));
//        person.setAge(12);
//        person.setName("test");
//        personRepository.save(person);
        return personRepository.findAll();
    }
}