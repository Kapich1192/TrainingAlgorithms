package algorithmicTasksEasyLeetCode.task21;

import java.util.HashMap;


/*You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.
The test cases are generated so that a unique mapping will always exist.
Example 1:
Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:
Input: s = "1326#"
Output: "acz"
Constraints:
1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.*/
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }

    public static  String freqAlphabets(String s){
        StringBuilder result= new StringBuilder();
        String string = s;
        String temp;

        HashMap<String,String> map = new HashMap<>(){{
            char init = 'b';
            for(int i = 1;i<=26;i++){
                if(i==1)put("1","a"); else
                if(i<=9){
                put(i+"",String.valueOf(init)); init++;
                }else{
                    put(i+"#",String.valueOf(init));init++;
                }
            }
        }};

        while(string.length()!=0){
            if(string.length()>=3){
            temp=string.substring(0,3);}else{temp =string.substring(0,1);}
            if(temp.length()==3 && temp.endsWith("#")) {
            }else{
                temp =string.substring(0,1);
            }
            result.append(map.get(temp));
            string = string.substring(temp.length());
        }
        return result.toString();
        }


    }

