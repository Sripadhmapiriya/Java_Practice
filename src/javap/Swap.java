package javap;

public class Swap {
    public static void main(String[] args){
        int arr[] = {22,33,44,55,66,77};
        int temp = arr[0];
        arr[0] = arr[2];          //swap between 0 and 2
        arr[2] = temp;
        for(int i : arr){
            System.out.println(i);
        }
    }

}
