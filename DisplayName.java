//To get the name using the command line.

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is = " + name);
    }
}
