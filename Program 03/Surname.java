// wap java program to print surname & name after taking his/her name

import java.util.Scanner;

public class Surname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the name by space
        String[] nameParts = fullName.trim().split("\\s+");

        if (nameParts.length >= 2) {
            // Assume first part is name, last part is surname
            String name = nameParts[0];
            String surname = nameParts[nameParts.length - 1];

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
        } else if (nameParts.length == 1) {
            System.out.println("Name: " + nameParts[0]);
            System.out.println("Surname: Not provided");
        } else {
            System.out.println("Please enter a valid name");
        }

        scanner.close();
    }
}
