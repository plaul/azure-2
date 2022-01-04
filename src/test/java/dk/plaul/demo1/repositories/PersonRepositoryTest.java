package dk.plaul.demo1.repositories;

import dk.plaul.demo1.entity.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    void setUp() {}
    @Test
    public void dbCountTest(){
        long count = personRepository.count();
        assertEquals(3,count);
    }

    @Test
    public void demoTest(){
        var persons = personRepository.findAll();
        persons.forEach(p ->{
            System.out.println(p.getId() +", " + p.getFirstName());
        });
        var person = personRepository.save(new Person("Kurt","Wonnegut"));
        System.out.println(person.getId());
    }

    @Test
    public void demoTest2(){
        var persons = personRepository.findAll();
        persons.forEach(p ->{
            System.out.println(p.getId() +", " + p.getFirstName());
        });
        var person = personRepository.save(new Person("Kurt","Wonnegut"));
        System.out.println(person.getId());
    }
}