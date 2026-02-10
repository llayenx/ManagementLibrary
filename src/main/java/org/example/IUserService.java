package org.example;

import java.util.List;

public interface IUserService {

        public  void addUser(User user);
        public String displayUsers();

        public User findUserByEmail(String email);
        public int countUsers();

        public List<User> getActiveUsers();
    }


