package org.example;

public class Main {
    public static void main(String[] args) {

        IUserService userService = new UserServiceImpl();
        // Agregar usaurios
        userService.addUser(new User(true, "llayenx@gmail.com", 1, "Layenx"));
        userService.addUser(new User(true, "Junior@gmail.com", 2, "Junior"));
        userService.addUser(new User(false, "jeff@gmail.com", 3, "Jeff"));
        userService.addUser(new User(true, "Diditch@gmail.com", 4, "Didicth"));
        userService.addUser(new User(true, "Emilie@gmail.com", 5, "Emilie"));
        System.out.println(userService);

        System.out.println(".........");

        // Cantidad de Usuarios
        System.out.println(userService.countUsers());

        System.out.println(".........");
        //Encontrar un user par email
        System.out.println( userService.findUserByEmail("llayenx@gmail.com"));

        //Users Actives

        System.out.println(".........");
        // liste des utilisateurs
        System.out.println("La liste des utilisateurs est la suivante");
        String display1 =userService.displayUsers();

       
    }
}