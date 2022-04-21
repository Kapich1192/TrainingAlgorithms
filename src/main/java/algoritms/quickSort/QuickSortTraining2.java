package algoritms.quickSort;
import java.util.Arrays;

public class QuickSortTraining2 {
    public static void main(String[] args){
        int[] array = new int[10];
        for(int i = 0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        //sort
        System.out.println(Arrays.toString(array));
    }
    //Метод сортировки
    public static int[] quickSort(int[] array,int from,int to){
        if(from<to){

        }
        return array;
    }
    //метод переставляет значения в массиве
    private void swap(int[]array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2]=temp;
    }
    //метод возвращает центр массива
    private int partition(int[] array,int from,int to){
        int leftIndex = from;
        int rightIndex = to;
        int pivot = array[leftIndex];
        return leftIndex;
    }
}
