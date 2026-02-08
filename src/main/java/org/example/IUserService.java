package org.example;

public interface IUserService {

        public  void addUser(User user);
        public String displayUsers();

        public  String findUserByEmail(String email);
        public int countUsers();

        //public  String getActiveUsers();
       // User getUserById(int id);
    }


