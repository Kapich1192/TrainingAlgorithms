package tasksYandex.lection1.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long start, end, res;
        char c;
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        start = System.currentTimeMillis();
        c = qSym(s);
        end = System.currentTimeMillis();
        System.out.println(c + " " + (end - start) + "ms");

        start = System.currentTimeMillis();
        c = qSym2(s);
        end = System.currentTimeMillis();
        System.out.println(c + " " + (end - start) + "ms");

        start = System.currentTimeMillis();
        c = qSym3(s);
        end = System.currentTimeMillis();
        System.out.println(c + " " + (end - start) + "ms");
    }

    /*(Плохое решение "Полиноминальная сложность") Переберем все позиции и для каждой позиции
    в строке еще раз переберем все позиции и в случае совпадения
    прибавим к счетчику единицую Найдем максимальное значение счетчика*/

    public static char qSym(String s){
        char temp;
        int max = 0;
        char tmpSym = '\0';
        int tmp;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                tmp = 0;
                temp = s.charAt(i);
                if (temp == s.charAt(j)) {
                    tmp++;
                }
                if (tmp > max) {
                    tmpSym = temp;
                }
            }
        }
        return tmpSym;
    }
    /*(Среднечковое решение O(N*K) - сложность) Переберем все символы, встречающиеся в строке,
    а затем переберем все позиции
    * и в случае совпадения прибавим к счетчику
    единицую найдем максимальное значение счетчика*/

    public static char qSym2(String s) {
        char ss[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int tmp;
        char temp = '\0';
        for (int i = 0; i < ss.length; i++) {
            if (!(set.contains(ss[i])))
                set.add(ss[i]);
        }
        for (Character c : set) {
            for (int j = 0; j < ss.length; j++) {
                tmp = 0;
                if (c == ss[j]) {
                    tmp++;
                }
                if (tmp > max) {
                    temp = c;
                }
            }
        }
        return temp;
    }
    /*(Хорошее решение O(N + K)) Заведем словарь, где ключом является символ, а значением - сколько раз он встретился.
    * Если символ встретился впервые - создаем елемент словаря с ключом, совпадающим с
    * этим символом и значением ноль. Прибавляем к элементу словаря с ключом, совпадающем с этим символом, единицу*/

    public static char qSym3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int temp;
        char tmp = '\0';
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(map.containsKey(s.charAt(i)))) {
                map.put(s.charAt(i),0);
            } else {
                temp = map.get(s.charAt(i));
                map.put(s.charAt(i),temp + 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                tmp = c;
            }
        }
        return tmp;
    }
}
