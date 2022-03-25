package BubbleSorting;

import java.util.Arrays;

public class Traning3 {
    public static void main(String[] args){
        int[] a = new int[]{4,2,6,4,3,2,1,643,34,34,2,3,4,3245,34,5};
        bubbleSorting(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSorting(int[]array){
        int temp;
        for(int i = 0;i<array.length;i++){
            for(int j = i; j<array.length;j++){
                temp = array[i];
                if(array[i] == array[j])continue;
                if(array[i]<array[j]){
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
