package algoritms.bubbleSorting;

import java.util.*;

public class Training10 {
    public static void main (String[] args){

        ArrayList<Integer> list = new ArrayList<>(){{
            for(int i=0;i<20;i++){
                add((int)(Math.random()*100));
            }
        }};

        bubbleSort(list);

        for(int i = 0;i<list.size();i++){
            System.out.print(" " + list.get(i));
        }
    }

    public static void bubbleSort(ArrayList<Integer> list){
        Integer temp;
        for(int i = 0;i<list.size();i++){
            for(int j=i; j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
