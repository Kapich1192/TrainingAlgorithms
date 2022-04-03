package AlgorithmicTasks.Task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(rasrez(7));
    }
    public static int rasrez(int a){
        int b = 0;
        if(a%2==0) b=a/2; else b = a/2+1;
        return b;
    }
}
