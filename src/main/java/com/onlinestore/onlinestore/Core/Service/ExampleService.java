package com.onlinestore.onlinestore.Core.Service;

import com.onlinestore.onlinestore.Infrastructure.Entity.PersonEntity;
import com.onlinestore.onlinestore.Presentation.DTO.Person;

import java.util.List;

public interface ExampleService {

    String getPersonDetails(Person person);

    List<PersonEntity> getAllPerson();

    PersonEntity findPersonByName(String name);
}
