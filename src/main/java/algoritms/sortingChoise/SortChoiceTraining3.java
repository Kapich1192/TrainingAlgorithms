package algoritms.sortingChoise;
import java.util.*;
public class SortChoiceTraining3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(){{
           for(int i = 0; i <20;i++){
               add((int)(Math.random()*10));
           }
        }};
        choiceSort(list);

        for(int i = 0; i<list.size();i++){
            System.out.print(" " + list.get(i));
        }
    }
    public static void choiceSort(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            swap(list,i,max(list,i));
        }
    }

    public static Integer max(ArrayList<Integer> list,int start){
        int index = start;
        for(int i = start;i<list.size();i++){
            if(list.get(i)>list.get(index))index=i;
        }
        return index;
    }
    public static void swap(ArrayList<Integer> list,int index1, int index2){
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }

}
