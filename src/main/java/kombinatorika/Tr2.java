package kombinatorika;

import java.util.HashSet;

public class Tr2 {
    public static void main(String[] args) {
        int count =0;
        HashSet<Character> Alphavetic = new HashSet<>(){{
            for(char i = 'a';i<='z';i++){
                add(i);
            }
        }};
        HashSet<Character> fishWord = new HashSet<>(){{
            add('f');add('i');add('s');add('h');
        }};
        HashSet<Character> ratWord = new HashSet<>(){{
            add('r');add('a');add('t');
        }};
        HashSet<Character> birdWord = new HashSet<>(){{
            add('b');add('i');add('r');add('d');
        }};
        HashSet<Character> CharWordsThrows = new HashSet<>(){{
            for(char i = 'a';i<='z';i++){
                if(!birdWord.contains(i)&&!ratWord.contains(i)&&!birdWord.contains(i))
                add(i);
            }
        }};
        //long result = factorial(22);
        System.out.println(factorial(26) - factorial(23)-factorial(24)-factorial(23)+factorial(21));
    }
    public static long factorial(int number){
        long factor = 1;
        for(long i =1;i<=number;i++){
            factor*=i;
        }
        return factor;
    }
}
