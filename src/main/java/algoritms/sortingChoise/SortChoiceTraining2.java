package algoritms.sortingChoise;
import java.util.Arrays;

public class SortChoiceTraining2 {
    public static void main(String[] args){
        int[] numbers = new int[20];
        for(int i = 0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*10);
        }
        choiceSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void choiceSort(int[] array){
        for(int i = 0;i<array.length;i++){
            swap(array,i,min(array,i));
        }
    }
    public static int min(int[]array,int startIndex){
        int index = startIndex;
        for(int i = startIndex;i<array.length;i++){
            if(array[index]<array[i])index=i;
        }
        return index;
    }

    public static void swap(int[]array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
