package algorithmicTasksEasyLeetCode.Task13;

import java.util.ArrayList;

public class SortingTheSentence {
    public static void main(String[] args) {
        String fff ="is2 sentence4 This1 a3";
        ArrayList<String> ddd = adapter(fff);
        sort(ddd);
        fff = sortSentence(fff);
        System.out.println(fff);
    }
    public static String sortSentence(String s) {
        ArrayList<String> ddd = adapter(s);
        sort(ddd);
        StringBuilder tempBuilder = new StringBuilder();
        for(int i = 0; i<ddd.size(); i++){
            tempBuilder.append(" ").append(ddd.get(i), 0, ddd.get(i).length() - 1);
        }
        String temp = tempBuilder.toString();
        temp = temp.trim();
        return temp;
    }

    public static ArrayList<String> adapter(String s){
        ArrayList<String> str = new ArrayList<>();
        int indexStart =0, indexEnd =0;
        String temp;
        for(int i = 0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) && i > indexEnd){
                indexEnd = i+1;
                temp = s.substring(indexStart,indexEnd);
                str.add(temp);
                indexStart = indexEnd + 1;
            }
        }
        return str;
    }
    public static void sort(ArrayList<String> s){

        String temp;
        for(int i = 0;i<s.size();i++){
            for(int j = i;j<s.size();j++){
                temp = s.get(i);

                if(s.get(i).charAt(s.get(i).length()-1) > s.get(j).charAt(s.get(j).length()-1)){
                    s.set(i,s.get(j));
                    s.set(j,temp);
                }
            }
        }
    }
}
