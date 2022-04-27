package algoritms.bubbleSorting;

import java.util.Arrays;

public class Training9 {
    public static void main(String[] args){
        int[] numbers = new int[25];
        for(int i = 0; i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100);
        }
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array){
        int temp;
        for(int i =0; i<array.length;i++){
            for(int j = i; j<array.length;j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
