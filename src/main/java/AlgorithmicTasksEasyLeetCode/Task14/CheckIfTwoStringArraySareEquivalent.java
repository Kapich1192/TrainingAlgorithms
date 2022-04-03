package AlgorithmicTasksEasyLeetCode.Task14;
/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.*/
public class CheckIfTwoStringArraySareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        for (String s : word1) {
            temp1.append(s);
        }
        for (String s : word2) {
            temp2.append(s);
        }
        return temp1.toString().equals(temp2.toString());
    }
}
