package algoritms.bubbleSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortingTraining12 {
    public static void main(String[] args) throws Exception{
        System.out.println(Arrays.toString(bubbleSortArray(new int[]{3,4,5,4,3})));
    }

    public static int[] bubbleSortArray(int[] array){
        int temp;
        for(int i = 0; i<array.length; i++){
            for (int j = i;j<array.length;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSortingList(ArrayList<Integer> list){
        Integer temp;
        for(int i = 0; i<list.size();i++){
            for(int j = i; j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
