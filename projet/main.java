package projet;

import java.util.Scanner;

public class main {

    public static Scanner src = null;
    public static void main(String[] args) {
    src = new Scanner(System.in);
    String firstName = getUser("You  firstname");
    String lastName = getUser("You lastname");
    String PhoneNumber = getUser("your phone number");
    src.close();
    contact newContact = new contact();

    newContact.setFirstName(firstName);
    newContact.setLastName(lastName);
    newContact.setPhoneNumber(PhoneNumber);

    System.out.println(lastName);
    System.out.println(firstName);
    System.out.println(PhoneNumber);
    }

    public static String getUser(String request){
        System.out.println(request);
        return src.nextLine();
    }
    
}
