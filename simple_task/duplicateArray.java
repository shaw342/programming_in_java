public class duplicateArray {

    public static void main(String[] args) {
        int[] arr = {13,67,13,89,67};

        for (int i = 0; i < arr.length;i++){
            for (int y = i+1;y< arr.length;y++){
                if (arr[i] == arr[y]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    
}
