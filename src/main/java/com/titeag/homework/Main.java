package com.titeag.homework;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // 1. Utilizator valid
        try {
            User user1 = new User("testuser", 25);
            repo.addUser(user1);
        } catch (InvalidUserDataException e) {
            System.out.println(" Eroare: " + e.getMessage());
        }

        // 2. Admin valid
        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repo.addUser(admin);
        } catch (InvalidUserDataException e) {
            System.out.println(" Eroare: " + e.getMessage());
        }

        // 3. Username prea scurt
        try {
            User badUser1 = new User("ab", 22);
            repo.addUser(badUser1);
        } catch (InvalidUserDataException e) {
            System.out.println(" Eroare: " + e.getMessage());
        }

        // 4. Vârstă negativă
        try {
            User badUser2 = new User("baduser", -5);
            repo.addUser(badUser2);
        } catch (InvalidUserDataException e) {
            System.out.println(" Eroare: " + e.getMessage());
        }

        // Afișăm toți utilizatorii valizi
        System.out.println("\n--- Utilizatori valizi înregistrați ---");
        for (User user : repo.getUsers()) {
            System.out.println(user);
        }
    }
}