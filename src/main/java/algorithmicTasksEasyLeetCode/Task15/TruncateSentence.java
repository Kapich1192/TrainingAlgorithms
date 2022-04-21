package algorithmicTasksEasyLeetCode.Task15;

import java.util.ArrayList;
/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s and an integer k.
You want to truncate s such that it contains only the first k words. Return s after truncating it.
*/
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String result ="";
        int start = 0,end;
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 1 ; i < s.length();i++){
            if(s.charAt(i)==' '|| i == s.length()-1){
                end = i;
                res.add(s.substring(start,end));
                start = end;
            }
        }
        if(k>=res.size())
            return s;else{
            for(int i=0;i<k;i++){
                result += res.get(i);
            }
            return result;
        }
    }
}
