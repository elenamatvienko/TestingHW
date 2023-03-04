package me.matvienkoeg.testinghw;

import me.matvienkoeg.testinghw.exception.IllegalEmailException;
import me.matvienkoeg.testinghw.exception.LoginEqualEmailException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    public static final String CORRECT_LOGIN = "login";
    public static final String CORRECT_EMAIL = "email@mail.ru";
    public static final String ILLEGAL_EMAIL = "email.ru";


    @Test
    public void shouldCreatUserWithAllParam() throws LoginEqualEmailException, IllegalEmailException {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertEquals(CORRECT_LOGIN, user.getLogin());
        Assertions.assertEquals(CORRECT_EMAIL, user.getEmail());
    }

    @Test
    public void shouldTrowsExceptionLoginEqualEmailUser() {
        Assertions.assertNotEquals(CORRECT_LOGIN, CORRECT_EMAIL);
    }

    @Test
    public void shouldTrowsExceptionCreatEmailUser() {
        Assertions.assertThrows(IllegalEmailException.class, () -> new User(CORRECT_EMAIL, ILLEGAL_EMAIL));
    }

    @Test
    public void shouldCreatUserWithNoParam() {
        User user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }
}
