import junit.framework.Assert;
import org.example.IUserService;
import org.example.User;
import org.example.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

   UserServiceImpl userServiceTest = new UserServiceImpl();

    @Test
    void getActiveUsersTest() {
        userServiceTest.addUser(new User(true, "taj@gmail.com", 1, "TAJ"));
        userServiceTest.addUser(new User(false, "emilie@gmail.com", 3, "Emilie"));
        userServiceTest.addUser(new User(true, "clanette@gmail.com", 2, "Clanette"));

        List<User> listaUserActive = userServiceTest.getActiveUsers();
        assertEquals(2, listaUserActive.size());
    }

    @Test
    void getActiveUsersTest_NOTEQUALS() {
        userServiceTest.addUser(new User(true, "taj@gmail.com", 1, "TAJ"));
        userServiceTest.addUser(new User(false, "emilie@gmail.com", 3, "Emilie"));
        userServiceTest.addUser(new User(true, "clanette@gmail.com", 2, "Clanette"));

        List<User> listaUserActive = userServiceTest.getActiveUsers();
        assertNotEquals(5, listaUserActive.size());
    }

    @Test
    void findUserEmailTest() {
        userServiceTest.addUser(new User(true, "jean@gmail.com", 1, "Jean"));
        userServiceTest.addUser(new User(true, "jeff@gmail.com", 2, "Jeff"));

        User usuario = userServiceTest.findUserByEmail("jeff@gmail.com");

        assertEquals("jeff@gmail.com", usuario.getEmail());

    }






    void addUserTest(){
        userServiceTest.addUser(new User(true, "jean@gmail.com", 1, "Jean"));
        userServiceTest.addUser(new User(true, "joe@gmail.com", 2, "Joe"));

      assertEquals(2, userServiceTest.countUsers());
      assertNotEquals(3, userServiceTest.countUsers());


       userServiceTest.addUser(new User(true, "joe@gmail.com", 1, "joe"));
    }











    }



