package algorithmicTasksEasyLeetCode.task22;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
    public static String reversePrefix(String word, char ch) {
        if(word.contains(""+ch)){
            char[] wordChar=word.toCharArray();
            int temp = word.indexOf(ch);
            char tmp;
            for(int i = 0;i<=temp;i++){
                tmp=wordChar[i];
                wordChar[i]=wordChar[temp];
                wordChar[temp]=tmp;
                temp--;
            }

            word="";

            for(int i=0;i<wordChar.length;i++){
                word+=wordChar[i];
            }
            return word;
        }

        return word;
    }
}
