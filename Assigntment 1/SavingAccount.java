public class SavingAccount extends BankAccount {
  private double annualInterestRate;

  public SavingAccount(String ownerName, String accountNumber, double initialBalance, double annualInterestRate) {
    super(ownerName, accountNumber, initialBalance);
    this.annualInterestRate = annualInterestRate;
  }

  public double CaculateMonthlyInterest(){
    return balance * (annualInterestRate / 12);
  }

  public void withDraw(double ammount){
    System.out.println("Khong the rut tien tu SavingAccount");
  }
}
