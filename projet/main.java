package projet;

import java.util.Scanner;

public class main {

    public static Scanner src = null;
    public static void main(String[] args) {
    src = new Scanner(System.in);
    String firstName = getUser("You  firstname");
    String lastName = getUser("You lastname");
    src.close();
    System.out.println(lastName);
    System.out.println(firstName);
    }

    public static String getUser(String request){
        System.out.println(request);
        return src.nextLine();
    }
    
}
