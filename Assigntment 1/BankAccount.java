public class BankAccount {
  protected String ownerName ;
  protected String accountNumber;
  protected double balance;

  protected static final double MIN_BALANCE = 50000.0;
  protected static final double WITHDRAW_FEE = 5000.0;

  public BankAccount(String ownerName, String accountNumber, double initialBalance) {
    if(initialBalance >= MIN_BALANCE){
      this.ownerName = ownerName;
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
      System.out.println("Khoi tao tai khoan thanh công!!");
    } else {
      System.out.println("So tien khoi tao it nhat la 50.000d");
    }
  }
  public void print(){
    System.out.println("ten tai khoan: " + ownerName + " ,So du: " + balance);
  }

  public void deposit (double ammout){
    if(ammout > 0){
      this.balance += ammout;
      System.out.println("Gui tien thanh cong! ");
    } else {
      System.out.println("Tien gui phai lon hon 0");
    }
  }

  public void withDraw(double ammount){
    if(ammount > 0){
      if(this.balance - ammount - WITHDRAW_FEE >= MIN_BALANCE) {
        this.balance = this.balance - ammount - WITHDRAW_FEE;
        System.out.println("Rut tien thanh cong! ");
      } else {
        System.out.println("Khong the rut do so tien du con lai khong đu!");
      }
    } else {
      System.out.println("Tien rut phai lon hon 0");
    }
  }
}




