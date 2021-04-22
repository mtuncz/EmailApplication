package emailapp;
import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailbox_capacity = 500;
    private int defaultPasswordLength = 10;
    private String alternate_email;
    private String companySuffix = "aeycompany.com";

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("\n\nEMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department
        this.department = setDepartment();
        //System.out.println("Department is: " + this.department);

        // Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() +"." + companySuffix;
        //System.out.println("Your email is : " + email);
    }

    // Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1-Sales\n2-Development\n3-Accounting\n0-None\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        switch(depChoice){
            case 1:
                return "Sales";
            case 2:
                return "Dev";

            case 3:
                return "Acct";

            default:
                return "None";

        }
    }


    // Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set the mailbox capacity
    public void setMailbox_capacity(int capacity){
        this.mailbox_capacity = capacity;
    }


    // Set the alternate email
    public void setAlternate_email(String altEmail){
        this.alternate_email = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailbox_capacity(){ return mailbox_capacity; }

    public String getAlternate_email(){ return alternate_email; }

    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailbox_capacity + "mb";
    }


}
