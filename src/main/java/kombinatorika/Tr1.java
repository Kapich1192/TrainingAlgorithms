package kombinatorika;

import java.util.HashSet;
import java.util.Iterator;

public class Tr1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i<=100;i++){
            if(i%5!=0 && i%7!=0)hashSet.add(i);
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            Integer a = it.next();
            System.out.println(a);
        }
        System.out.println("Mosh = " + hashSet.size());

    }
}
