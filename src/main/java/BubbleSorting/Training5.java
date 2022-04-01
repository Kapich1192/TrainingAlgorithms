package BubbleSorting;

import java.util.Arrays;

public class Training5 {
    public static void main(String[] args){
        int[] array = {1,2,3,412,2,324,3,41,42};
        System.out.println(Arrays.toString(bubbleSorting(array)));
    }

    public static int[] bubbleSorting(int[] array){
      int temp = 0;
      for(int i = 0; i< array.length;i++){
          for(int j = i;j< array.length;j++){
              temp = array[i];
              if(array[i]<array[j]){
                  array[i]=array[j];
                  array[j]=temp;
              }
          }
      }
      return array;
    }

}
