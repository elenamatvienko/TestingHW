package me.matvienkoeg.testinghw;


import me.matvienkoeg.testinghw.exception.IllegalEmailException;
import me.matvienkoeg.testinghw.exception.LoginEqualEmailException;

public class User {
    private String login;
    private String email;

    public User(String login, String email) throws LoginEqualEmailException, IllegalEmailException {
        if (login.equals(email)) {
            throw new LoginEqualEmailException();
        }
        if (!email.contains("@") || !email.contains(".")){
            throw new IllegalEmailException();
        }
        this.login = login;
        this.email = email;
    }
    public User() {
    }
    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
}
