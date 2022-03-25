package AlgorithmicTasksEasyLeetCode.Task3;
/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].*/
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        char[] temp =s.toCharArray();
        int count = 0;
        int result = 0;
        int     I = 1,
                V = 5,
                X = 10,
                L = 50,
                C = 100,
                D = 500,
                M = 1000;

        if(s.contains("M")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='M')count++;
            }
            result += M * count;
            count =0;
        }
        if(s.contains("D")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='D')count++;
            }
            result += D*count;
            count =0;
        }
        if(s.contains("C")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='C')count++;
            }
            result += C*count;
            count =0;
        }
        if(s.contains("L")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='L')count++;
            }
            result += L*count;
            count =0;
        }
        if(s.contains("X")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='X')count++;
            }
            result = result + X*count;
            count =0;
        }
        if(s.contains("V")){
            for(int i = 0; i<temp.length;i++){
                if(temp[i]=='V')count++;
            }

            result = result + V*count;
            count =0;
        }
        if(s.contains("I")){
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i] == 'I') count++;
                }
                result =result + I * count;
        }
        if(s.contains("IV")){result = result - 2;}
        if(s.contains("IX")){result = result - 2;}
        if(s.contains("XL")){result = result - 20;}
        if(s.contains("XC")){result = result - 20;}
        if(s.contains("CD")){result = result - 200;}
        if(s.contains("CM")){result = result - 200;}
        return result;
    }
}
