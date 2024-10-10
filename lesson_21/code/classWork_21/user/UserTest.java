package classwork_21.user;

import classWork_21.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    final String email = "peter@mail.de"; // ideal email
    final String password = "123456Az!"; // ideal password


    @BeforeEach
    void setUp() {
        user = new User(email, password); // create new 'fresh' object user
    }

    @Test
    void testValidEmail(){

        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());

    }


    @Test
    void setEmailNoAt() {
        String email = "petermail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change

    }

    @Test
    void setEmailNoDot(){
        String email = "peter@mailde";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());

    }

    @Test
    void setEmailNoLetter(){
        String email = "1_-.@34.22";
        user.setEmail(email);
        assertEquals("1_-.@34.22", user.getEmail());
    }

    @Test
    void setEmailOnlyOneAt(){
        String email = "p@ter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailLastTwoSymbol(){
        String email = "peter@mail.d";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailOtherCharacters() {  // в идеале на каждый символ отдельный тесткейс
        String email = "b/±/|\\#$%&*()?!chb@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailSpace() {
        String email = "pet er@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailUppercase() {
        String email = "PETER@MAIL.DE";
        user.setEmail(email);
        assertEquals("PETER@MAIL.DE", user.getEmail());
    }

    @Test
    void setEmailMoreLastSymbol() {
        String email = "peter@mail.deeeeeeeee.eee_eeeeeeeeee-";
        user.setEmail(email);
        assertEquals("peter@mail.deeeeeeeee.eee_eeeeeeeeee-", user.getEmail());
    }

    @Test
    void setEmailDoubleDot() {
        String email = "pete..r@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }


    @Test
    void setPassword() {

    }

}
