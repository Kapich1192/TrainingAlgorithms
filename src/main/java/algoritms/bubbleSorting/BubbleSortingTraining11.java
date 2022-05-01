package algoritms.bubbleSorting;
import java.util.Arrays;
import java.util.ArrayList;
public class BubbleSortingTraining11 {
    public static void main(String[] args) throws Exception{
        int[] numbers = {1,2,3,41,4,243,52,23,23,4,1,3,5,4,3,2,6,7,5,4,3};
        System.out.println(Arrays.toString(bubbleSortingArray(numbers)));
    }
    public static int[] bubbleSortingArray(int[] array) throws Exception {
        try {
            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        catch(ArithmeticException e){
            System.out.println("деление на 0 ");
        }
        return array;
    }
    public static ArrayList<Integer> bubbleSortingList(ArrayList<Integer> list){
        Integer temp;
        for(int i = 0; i<list.size();i++){
            for(int j = i;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
