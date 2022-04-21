package AlgorithmicTasks.Task4;

public class Credit {

    private int interestRate;//процентная ставка
    private int loanAmount;//сумма кредита
    private int loanTermInMonths;//срок кредита в месяцах
    private int theAmountOfEarlyRepayment = 0;//сумма ежемесячного досрочного погашения

    private int overpaymentAmount;//сумма переплаты
    private int loanBody ;//тело кредита

    private int[] monthlyPayment ;//ежемесячный платеж

    private int[] monthlyInterestOnTheLoan;//месячные проценты по кредиту

    //constructors
    Credit(){}
    Credit(int loanAmount,int loanTermInMonths,int interestRate){
        this.loanAmount=loanAmount;
        this.loanTermInMonths=loanTermInMonths;
        this.interestRate = interestRate;
        overpaymentAmount = (int)(loanAmount * (loanTermInMonths/12.0 / 100));
        loanBody = calculateLoanBody();
    }
    //getters
    public int getInterestRate() {return interestRate;}
    public int getLoanAmount() {return loanAmount;}
    public int getLoanTermInMonths() {return loanTermInMonths;}
    public int getTheAmountOfEarlyRepayment() {return theAmountOfEarlyRepayment;}
    public int getLoanBody(){return loanBody;}
    public int getOverpaymentAmount(){return overpaymentAmount;}
    //setters
    public void setInterestRate(int interestRate) {this.interestRate = interestRate;}
    public void setLoanAmount(int loanAmount) {this.loanAmount = loanAmount;}
    public void setLoanTermInMonths(int loanTermInMonths) {this.loanTermInMonths = loanTermInMonths;}
    public void setTheAmountOfEarlyRepayment(int theAmountOfEarlyRepayment) {this.theAmountOfEarlyRepayment = theAmountOfEarlyRepayment;}
    //system
    private int calculateLoanBody(){
        System.out.println(loanAmount);
        return overpaymentAmount + loanAmount;
    }
    //methods
    /*График платежей*/
    public void printPaymentSchedule(){
        for (int i = 0; i < loanTermInMonths; i++) {
            System.out.println(

            );
        }
    }
}
