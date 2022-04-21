package training.collections.list;

import java.util.ArrayList;

public class Training1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("value");
        arrayList.add("afaf");
        arrayList.add("LinkedList");
        arrayList.add("Vector");
        arrayList.add("Stack");
        arrayList.add("ArrayList");
        arrayList.add("LinkedList");
        arrayList.add("Vector");
        arrayList.add("Stack");

        arrayList.add(0,"value");
        int f = arrayList.size();
        String asd = arrayList.get(1);
        arrayList.set(1,"valueSet");
        boolean b = arrayList.contains("value");
        arrayList.isEmpty();
        arrayList.remove("value");
        arrayList.remove(0);
        arrayList.toArray();
        arrayList.clear();

    }
}
