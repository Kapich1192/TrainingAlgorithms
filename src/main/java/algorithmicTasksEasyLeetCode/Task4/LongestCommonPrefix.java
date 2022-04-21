package algorithmicTasksEasyLeetCode.Task4;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] sss = new String[]{"flower","flow","flight"};
        String ddd = longestCommonPrefix(sss);
        System.out.println(ddd);
    }
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        String temp = "";
        int count = 0;
        for(int j = 1; j<strs[0].length()+1;j++) {
            temp = strs[0].substring(0,j);
            for (int i = 0; i < strs.length; i++){
                if(strs[i].startsWith(temp)){
                    count++;
                    if(count == strs.length){
                        s = temp;
                        count = 0;
                    }
                }
            }
            count = 0;
        }
        return s;
    }
}
