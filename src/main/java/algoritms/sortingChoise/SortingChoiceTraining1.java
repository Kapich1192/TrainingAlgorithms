package algoritms.sortingChoise;

import java.util.Arrays;

public class SortingChoiceTraining1 {
    public static void main(String[] args) {
        int[] numbers={1,51,6,4,3,1,5,4,2,5,4,7,6,2,3,1};
        System.out.println(Arrays.toString(sortingChoice(numbers)));
    }
    public static int[] sortingChoice(int[] array){
        int temp,index;

        for (int i = 0; i < array.length; i++) {
            index=min(array,i);
            temp = array[i];
            array[i]=array[index];
            array[index]=temp;
        }

        return array;
    }

    public static int min(int[]array,int start){
        int index = start;
        for (int i = start; i < array.length; i++) {
            if(array[index]<array[i])
                index=i;
        }
                return index;
    }
}
