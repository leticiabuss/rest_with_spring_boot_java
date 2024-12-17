package br.com.udemy.rest_with_spring_boot_java.controllers;

import br.com.udemy.rest_with_spring_boot_java.model.Person;
import br.com.udemy.rest_with_spring_boot_java.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public Person findById(@PathVariable(value = "id") String id) {
        return personService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET,
            produces = "application/json")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            produces = "application/json")
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @RequestMapping(method = RequestMethod.PUT,
            produces = "application/json")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.PUT,
            produces = "application/json")
    public void delete(@PathVariable(value = "id") String id) {
        personService.delete(id);
    }
}
