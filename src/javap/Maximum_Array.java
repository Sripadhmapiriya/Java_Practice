package javap;

public class Maximum_Array {
    public static void main(String[] args){
        int arr[] = { 24,34,54,45,35};
        int max = arr[0];
        for( int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.print(max);
    }

}
