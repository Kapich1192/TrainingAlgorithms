package AlgorithmicTasks.Task4;

public class Task4 {

    public static void main(String[] args) {
        Credit credit = new Credit(100_000,24,10);
        System.out.println(credit.getLoanAmount());
        System.out.println(credit.getLoanBody());
        System.out.println(credit.getOverpaymentAmount());

    }

}
