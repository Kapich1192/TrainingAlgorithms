package AlgorithmicTasksEasyLeetCode.Task5;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s ="{{}}()";
        char temp = '}';
        temp = (char) (temp+1);
        //System.out.println(temp);
        System.out.println(isValid(s));
        //System.out.println(valider(s));
    }
    public static boolean isValid(String s) {
        String temp = s,temp1 ="";
        while(temp.length()>0){
            temp1 = valider(temp);
            System.out.println("add = " + temp1);
            temp = temp.substring(temp1.length());
            System.out.println(temp);
        }
        return false;
 }
        public static String valider(String s){
            String n1="{",nn1 = "}",n2="[",nn2="]",n3="(",nn3 = ")",
                    temp="";
            int indexStart = 0,indexEnd = 0;
            temp = s.substring(0,1);
            for(int i = 0;i<s.length();i++){
                if(temp.equals(n1)){indexEnd=s.indexOf(nn1);}
                if(temp.equals(n2)){indexEnd=s.indexOf(nn2);}
                if(temp.equals(n3)){indexEnd=s.indexOf(nn3);}
                if(indexEnd!=0)
                return s.substring(indexStart,indexEnd+1);}
            return "1";
            }

        }



