public class reverseInt {
    public static void main(String[] args) {
        int number = 134;

        System.out.println(IntReverse(number));

    }
    public static int IntReverse(int a){
        String integer = String.valueOf(a);
        String number = "";

        for(int i = (integer.length() -1);i >= 0;i--){
            number +=  integer.charAt(i);
        }
        int reverseNumber = Integer.parseInt(number);

        return reverseNumber;
    }
}
