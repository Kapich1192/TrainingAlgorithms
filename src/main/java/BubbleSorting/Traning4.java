package BubbleSorting;

import java.util.Arrays;

public class Traning4 {
    public static void main(String[] args){
       int[] array ={4,3,2,5,4,2,3,4,56,7,5,4,2,3};
       bubbleSorting(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSorting(int[] array){
        int temp;
        for(int i =0; i<array.length; i++){
            for(int j=i;j<array.length;j++){
                temp = array[i];
                if(array[i]<array[j]){
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
