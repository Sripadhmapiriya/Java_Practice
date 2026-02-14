package javap;

//public class Reverse {
//    public static void main(String[] args){
//        int num = 12345;
//        int rev = 0;
//        while (num >0){
//            rev = rev*10 + num % 10;
//            num = num / 10;
//            }
//        System.out.println(rev);
//
//        }
//
//    }


public class Reverse{
    public static void main (String[] args){
        String str = "sri";
        String rev = "";
        for ( int i = str.length() -1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
