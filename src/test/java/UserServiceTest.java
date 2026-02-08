import junit.framework.Assert;
import org.example.IUserService;
import org.example.User;
import org.example.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

   UserServiceImpl userServiceTest = new UserServiceImpl();

    @Test
    void addUserTest(){
        userServiceTest.addUser(new User(true, "jean@gmail.com", 1, "Jean"));
        userServiceTest.addUser(new User(true, "joe@gmail.com", 2, "Joe"));

      assertEquals(2, userServiceTest.countUsers());
      assertNotEquals(3, userServiceTest.countUsers());
    }






    }



