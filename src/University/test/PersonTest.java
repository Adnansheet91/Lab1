package University.test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    Person person =new Person ("Mohamed",29);




    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Mohamed", person.getName());


    }

    @org.junit.jupiter.api.Test
    void setName() {
        person.setName("Rami");
        assertEquals("Rami", person.getName());



    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(29, person.getAge ());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        person.setAge (10);
        assertEquals(10, person.getAge ());

    }

    @org.junit.jupiter.api.Test
    void reverseName() {
        assertEquals ("demahoM",person.reverseName (person.getName ()));



    }
}