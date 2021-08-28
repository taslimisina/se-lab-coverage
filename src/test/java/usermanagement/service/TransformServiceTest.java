package usermanagement.service;

import org.junit.Before;
import org.junit.Test;
import usermanagement.entity.Person;

import static org.junit.Assert.assertEquals;

public class TransformServiceTest {
    private TransformService transformService;
    private Person person;

    @Before
    public void init() {
        transformService = new TransformService();
        person = new Person();
        person.setCompanyName("company");
        person.setPersonId(20);
        person.setfName("first");
        person.setlName("last");
        person.setmName("middle");
    }

    @Test
    public void test_toUserDomain() {
        User user = transformService.toUserDomain(person);
        assertEquals("company", user.getCompanyName());
        assertEquals("first", user.getFirstName());
        assertEquals("last", user.getLastName());
        assertEquals(20, user.getUserId().intValue());
    }

    @Test
    public void test_toUserEntity() {
        User user = transformService.toUserDomain(person);
        Person transformed = transformService.toUserEntity(user);
        assertEquals("company", transformed.getCompanyName());
        assertEquals("first", transformed.getfName());
        assertEquals("last", transformed.getlName());
        assertEquals(20, transformed.getPersonId());
    }
}
