//package com.onlinestore.onlinestore.Core.Service.Impl;
//
//import com.onlinestore.onlinestore.Core.Service.ExampleService;
//import com.onlinestore.onlinestore.Infrastructure.Entity.PersonEntity;
//import com.onlinestore.onlinestore.Infrastructure.Repository.PersonRepository;
//import com.onlinestore.onlinestore.Presentation.DTO.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service("ExampleServiceV2Impl")
//public class ExampleServiceV2Impl implements ExampleService {
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @Override
//    public String getPersonDetails(Person person) {
//        PersonEntity personEntity = PersonEntity.builder().name(person.getName()).age(person.getAge()).build();
//        personRepository.save(personEntity);
//        return "Hello, " + person.getName() + " with age: " + person.getAge();
//    }
//}
