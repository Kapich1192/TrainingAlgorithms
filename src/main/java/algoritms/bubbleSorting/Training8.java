package algoritms.bubbleSorting;

import java.util.ArrayList;

public class Training8 {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>(){{
            for(int i=0;i<30;i++) add((int)(Math.random()*100));
        }};
        bubbleSorting(listInteger);
        for(int i = 0;i<listInteger.size();i++)
        System.out.print(" " + listInteger.get(i));
    }

    public static void bubbleSorting(ArrayList<Integer> list){
        Integer temp ;
        for(int i =0;i<list.size();i++){
            for(int j = i;j<list.size();j++){
                temp = list.get(i);
                if(list.get(i)<list.get(j)){
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
