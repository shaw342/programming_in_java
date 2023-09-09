import java.util.Scanner;

public class isPalindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reverseWord = reverse.Reverse(word);
        if (word == reverseWord) {
            System.out.println(word +" is palindrome");
        }else{
            System.out.println(word + " is not palindrome");
        }

    }
    
}
