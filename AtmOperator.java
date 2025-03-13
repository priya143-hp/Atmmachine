package atm;

public class AtmOperator {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    public AtmOperator(){
        super();
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public double getBalance() {
        return balance;
    }
    public double getDepositAmount() {
        return depositAmount;
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("balance="+balance+",depositAmount="+depositAmount+",withdrawAmount="+withdrawAmount);
            }
            
}