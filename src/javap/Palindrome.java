package javap;

public class Palindrome {
    public static void main(String[] args) {
//        String nam = "madam";
//        String rev = "";
//        for(int i = nam.length()-1; i>=0; i--){
//            rev += nam.charAt(i);
//        }
//        if (nam.equals(rev)){
//            System.out.println("it is palindrome");
//        }else
//            System.out.println("it is not a palindrome");


//armstrong or not


//         int num = 153;
//        int temp = num;
//        int sum = 0;
//        while (num > 0){
//            int digit = num % 10;
//            sum += digit * digit * digit;
//            num = num/10;
//        }
//        if(temp == sum){
//            System.out.println("it is armstrong");
//
//        }else
//            System.out.println("it is not a armstrong");
//    }
//
//
        //armstrong between 100 - 1000


        for (int i = 100; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num = num / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
