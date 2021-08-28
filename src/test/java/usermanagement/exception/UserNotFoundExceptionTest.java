package usermanagement.exception;

import org.junit.Test;
import usermanagement.service.User;

import static org.junit.Assert.*;

public class UserNotFoundExceptionTest {

    @Test
    public void test_getUserId() {
        try {
            throw new UserNotFoundException("user not found", 10);
        }
        catch (UserNotFoundException u) {
            assertEquals(10, u.getUserId().intValue());
        }
    }
}