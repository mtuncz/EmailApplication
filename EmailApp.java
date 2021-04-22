package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        new Opener();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Name: ");
        String fn = sc.nextLine();
        System.out.print("Please Enter Last Name: ");
        String ln = sc.next();
        sc.nextLine();
        Email em1 = new Email(fn, ln);

        System.out.println(em1.showInfo());
    }
}
