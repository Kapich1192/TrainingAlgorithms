package algoritms.bubbleSorting;

import java.util.Arrays;

public class Training6 {
    public static void main(String[] args) {
        int[] array = {7,8,97,8,8,5,4,2,14,4,75,3,5,75,8,6};
        System.out.println(Arrays.toString(bubbleSorting(array)));
    }
    public static int[] bubbleSorting(int[]array){
        int temp;
        for(int i =0; i< array.length;i++){
            for(int j = i; j<array.length;j++){
                temp = array[i];
                if(array[i]<array[j]){
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
