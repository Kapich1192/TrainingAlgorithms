package AlgorithmicTasksEasyLeetCode.Task9;
/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".*/
public class JewelsAndStones {
    public static void main(String[] args) {
       String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();

        for(int i = 0;i<j.length;i++ ){
            for(int a=0;a<s.length;a++){
                if(j[i]==s[a]){
                    count++;
                }
            }
        }

        return count;
    }
}
