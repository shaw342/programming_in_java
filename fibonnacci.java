import java.util.Scanner;

/**
 * 0-fibonnacci
 */
public class fibonnacci{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many:");
        int count = scanner.nextInt();
        int a = 0;
        int b = 1;
        int tmp;

        for (int i = 0; i < count;i++){
            tmp = a + b;
            a = b;
            b = tmp;
            System.out.println(b);
        }
    }
    
}