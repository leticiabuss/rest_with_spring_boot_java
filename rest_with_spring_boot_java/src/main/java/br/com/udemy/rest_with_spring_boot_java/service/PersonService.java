package br.com.udemy.rest_with_spring_boot_java.service;

import br.com.udemy.rest_with_spring_boot_java.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonService.class.getName());


    public Person findById(String id) {
        logger.info("Finding one person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leticia");
        person.setLastName("Buss");
        person.setAddress("Rua das flores");
        return person;
    }

    public List<Person> findAll() {
        logger.info("Finding all people");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person){
        logger.info("Creating one person");
        return person;
    }

    public Person update(Person person){
        logger.info("Updating one person");
        return person;
    }

    public void delete(String id){
        logger.info("Deleting one person");
    }

    private Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leticia" + i);
        person.setLastName("Buss" + i);
        person.setAddress("Rua das flores" + i);
        return person;
    }
}
