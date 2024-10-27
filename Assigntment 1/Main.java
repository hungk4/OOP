public class Main {
  public static void main(String[] args) {
    BankAccount a = new BankAccount("Nguyen Manh Hung", "20225630", 100000);
    a.deposit(5000);
    a.withDraw(10000);
    a.print();

    System.out.println("-----------------");
    SavingAccount b = new SavingAccount("Nguyen Van B", "987654321", 200000.0, 0.05);
    
    b.deposit(10000);
    b.withDraw(50000);
    System.out.println("tien lai hang thang: " + b.CaculateMonthlyInterest());
    b.print();
    
  }
}
