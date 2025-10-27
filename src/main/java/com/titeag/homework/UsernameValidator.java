import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();
            valid = true;

            if (username.contains(" ")) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                valid = false;
                continue;
            }

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                valid = false;
            }

            boolean hasDigit = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                valid = false;
            }

        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}