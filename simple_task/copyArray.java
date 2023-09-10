import java.util.Arrays;

public class copyArray {

    public static void main(String[] args) {
        int[] number = {134,123,788,89};
        int[] newNumber = CopyArray(number);
        System.out.println(Arrays.toString(newNumber));

    }

    public static int[] CopyArray(int[] arr){
        int[] copyarr = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            copyarr[i] = arr[i];
        }

        return copyarr;
    } 
    
}
