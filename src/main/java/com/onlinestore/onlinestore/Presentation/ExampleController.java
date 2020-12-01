package com.onlinestore.onlinestore.Presentation;

import com.onlinestore.onlinestore.Core.Service.ExampleService;
import com.onlinestore.onlinestore.Core.Service.Impl.ExampleServiceImpl;
import com.onlinestore.onlinestore.Infrastructure.Entity.PersonEntity;
import com.onlinestore.onlinestore.Presentation.DTO.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    @Qualifier("ExampleServiceImpl")
    private ExampleService exampleService;

    @PostMapping("/save-person")
    public String savePerson(@RequestBody Person person){

        return exampleService.getPersonDetails(person);
    }

    @GetMapping("/get-person")
    public List<PersonEntity> getPerson(){

        return exampleService.getAllPerson();
    }

    @GetMapping("/get-person-by-name")
    public PersonEntity getPersonByName(@RequestParam(value = "name") String name){

        return exampleService.findPersonByName(name);
    }
}
