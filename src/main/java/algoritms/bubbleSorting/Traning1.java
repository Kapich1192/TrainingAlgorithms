package algoritms.bubbleSorting;

import java.util.Arrays;

public class Traning1 {
    public static void main(String[] args){
            int[] a = new int[]{1, 3, 2, 14, 412, 2, 1, 23, 42, 321, 4, 2, 32, 1, 2, 3, 53, 32, 2, 1};
            bubbleSorting(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSorting(int[] array){
        int temp = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = i; j < array.length;j++){
                temp = array[i];
                if(array[i]==array[j]) continue;
                if(array[i]<array[j]){
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
        }
    }
}
