package org.example;

import java.util.*;

public class UserServiceImpl implements IUserService {
    List<User> users = new ArrayList<>();
    Set<String> names = new HashSet<>();
    Set<String> emails = new HashSet<>();
    Map<Integer, User> userById = new HashMap<>();

    @Override
    public void addUser(User user) {
        if (names.contains(user.getName())) {
            System.out.println("Votre nom existe deja:" + user.getName());
        } else if (userById.containsKey(user.getId())) {
            System.out.println("Cet Id existe deja: " + user.getId());
        } else if (emails.contains(user.getEmail())) {
            System.out.println("Cet email existe deja:" + user.getEmail());
        } else {
            users.add(user);
            names.add(user.getName());
            emails.add(user.getEmail());
            userById.put(user.getId(), user);
            System.out.println("Utilisateur ajouté");

        }
    }

    @Override
    public int countUsers() {
        int totalUsers = 0;

        for (int i = 0; i < users.size(); i++) {
            totalUsers++;

        }
        System.out.println("Le nombre total de utilisateurs est: " + totalUsers);
        return totalUsers;
    }

    @Override
    public List<User> getActiveUsers() {
        List<User> listaDeUsersActive = new ArrayList<>();
        // verificar chaque user in List users agregados
        for (int i = 0; i < users.size(); i++){
            //Get users que estan actives
            if(users.get(i).isActive()){
                listaDeUsersActive.add(users.get(i));
            }
        }
        return listaDeUsersActive;
    }


    @Override
    public String displayUsers() {
        if (userById.isEmpty()) {
            System.out.println("Aucun utilisateur");
        }
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + ": ESTADO: " + user.isActive());

        }

        return "";
    }

    @Override
    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Cet utilisateur avec cet email est: " + user.getName());
                return user;
            }
        }
        return null;
    }

}
