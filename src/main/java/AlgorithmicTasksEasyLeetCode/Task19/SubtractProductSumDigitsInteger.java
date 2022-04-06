package AlgorithmicTasksEasyLeetCode.Task19;
/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.*/
public class SubtractProductSumDigitsInteger {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        String s =String.valueOf(n);
        int sum = 0,pr=1;
        for(int i = 0;i<s.length();i++){
            sum += Integer.parseInt("" + s.charAt(i));
        }
        for(int i = 0;i<s.length();i++){
            pr *= Integer.parseInt("" + s.charAt(i));
        }
        return pr-sum;
    }
}
