package javap;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("it is anagram");
        }else
            System.out.println("it is not a anagram");
    }
}
