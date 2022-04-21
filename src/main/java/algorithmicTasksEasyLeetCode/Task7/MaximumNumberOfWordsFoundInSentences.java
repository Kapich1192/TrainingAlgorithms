package algorithmicTasksEasyLeetCode.Task7;
/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.*/
public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        int temp ;
        char[]a;
        String s;
        for(int i = 0; i < sentences.length; i++){
            s = sentences[i];
            a=s.toCharArray();
            temp=0;
            for (int j=0;j<a.length;j++){
                if(a[j]==' ')temp++;
            }
            if(temp>count)count=temp;
        }
        return count+1;
    }
}
