package algoritms.bubbleSorting;

import java.util.Arrays;

public class Traning2 {
    public static void main(String[] args) {
        int[]a = new int[]{8,7,5,365,4,7,86,5,6};
        bubbleSorting(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSorting(int[] array){
        int temp;
        for(int i = 0;i < array.length;i++){
            for(int j = i; j < array.length;j++){
                temp=array[i];
                if(array[i]==array[j])continue;
                if(array[i]<array[j]){
                   array[i]=array[j];
                   array[j]=temp;
                }
            }
        }
    }
}
