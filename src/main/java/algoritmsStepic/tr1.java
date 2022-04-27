package algoritmsStepic;

public class tr1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Tasks
        for (int i = 1; i < 46 ; i++) {
            new tr1().run(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+" ms");
    }
    private void run(int a){
        long f = new tr1().fib(a);
        System.out.println(f);
    }
    private int fib(int n){
        if(n<2){
            return 1;
        }else return fib(n-1)+fib(n-2);
    }
}
