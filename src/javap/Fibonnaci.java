package javap;

public class Fibonnaci {
    public static void main(String[] args){
//        int a = 0;
//        int b = 1;
//        System.out.println(a+ " "+ b+ " ");
//        for( int i = 2; i < 10; i++){
//            int c = a + b;
//            System.out.println(c+ " ");
//            a = b;
//            b = c;
//        }


        int num = 12;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i < num; i ++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);

    }
}
