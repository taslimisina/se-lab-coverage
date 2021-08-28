package usermanagement.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void test_user_equality() {
        User user = new User();
        user.setUserId(2);
        User user2 = new User();
        user2.setUserId(2);

        assertEquals(user, user2);
    }
}