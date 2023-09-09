import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        String name = "hello";
        System.out.println(Reverse(name));
    }

    public static String Reverse(String str){
        String newString = "";

        for (int i  = (str.length()-1); i >= 0;i--){
            newString += str.charAt(i);
        }
        return newString;
    }
}