package BubbleSorting;

import java.util.ArrayList;

public class Training7 {
    public static void main(String[] args) {
        String lll = "ddd"; lll.co
        ArrayList<Integer> list = new ArrayList<>(){{
            for(int i = 0;i<30;i++){
                add((int)(Math.random()*1000));
            }
        }};
        bubbleSorting(list);
        for(int i = 0;i<list.size();i++ ){
            System.out.print(" " + list.get(i));
        }
    }
    public static void bubbleSorting(ArrayList<Integer> list){
        Integer temp;
        for(int i =0; i<list.size();i++){
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
