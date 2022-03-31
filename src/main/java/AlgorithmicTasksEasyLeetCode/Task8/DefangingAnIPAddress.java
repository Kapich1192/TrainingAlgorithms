package AlgorithmicTasksEasyLeetCode.Task8;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String s ="";
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        String s ="";
        char[] temp =address.toCharArray();
        for(int i = 0; i< temp.length;i++){
            if(temp[i]!='.')
            s = s + temp[i]; else s = s +"[.]";
        }
        return s;
    }
}
