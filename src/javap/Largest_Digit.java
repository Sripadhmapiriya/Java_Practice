package javap;

public class Largest_Digit {
    public static void main(String[] args){
//        int num = 12345;
//        int max = 0;
//        while(num > 0 ){
//            int digit = num % 10;
//            if (digit > max){
//                max = digit;
//
//            }
//            num = num / 10;
//        }
//        System.out.println(max);



        // count how many digit


        int num = 3456;
        int count = 0;
        while(num > 0){
            num = num / 10;
            count ++;
        }
        System.out.println(count);



    }
}
