package bankaccount_mila;

 public class BankAccount_Mila {
   String accountNumber;
   double balance;

  public BankAccount_Mila (String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void deposit(double amount) {
     System.out.println(balance += amount);
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
         System.out.println( balance -= amount);
      } else {
          System.out.println("Insufficient balance");
      }
  }

  public double getBalance() {
      return balance;
  }


  public static void main(String[] args) {
    BankAccount_Mila bank1;
    bank1 = new BankAccount_Mila ("11223344", 0);
    System.out.println("Saldo: " + bank1.getBalance()); 
    System.out.print("Deposit: ");
    bank1.deposit(250000);
    System.out.print("Withdraw: ");
    bank1.withdraw(75000);

    bank1.getBalance();
    System.out.println("Saldo Sisa: "+ bank1.getBalance());
  }
}
