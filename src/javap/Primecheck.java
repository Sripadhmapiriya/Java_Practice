package javap;

public class Primecheck {
    public static void main (String[] args){
        int num = 12;
        boolean isprime = true;
        if( num <= 1){
            isprime = false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                isprime = false;
                break;
            }
        }
        if (isprime){
            System.out.println(num+" is a prime");
        }else {
            System.out.println(num+ " is not a prime");
        }
    }
}


