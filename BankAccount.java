import java.util.Scanner;
public class BankAccount {
  //private boolean loggedIn;
  private String name;
  private int accountNumber;
  private double balance;
  private String password;
  private boolean loggedIn;


  public BankAccount(String name, int accountNumber, double balance, String password, boolean loggedIn)
  {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.password = password;
    this.loggedIn = true;
  }

//add bank information
  public boolean logIn(String name, String password)
  {
    if(name.equals(this.name) && password.equals(this.password))
    {
      loggedIn = true;
      return true;
    }
    else{
      return false;
    }
  }


  public double getBalance()
  {
    if (loggedIn == true)
    {
      System.out.println("Balance: ");
      return  balance;
    }
    else
    {
      throw new IllegalStateException("Not logged in.");
    }

  }

  public static double Withdraw(double balance, double withdrawnAmount)
  {
    System.out.println("Withdrawing amount: " + withdrawnAmount);
    if (balance >= withdrawnAmount) {
      balance = balance - withdrawnAmount;
      System.out.println("Withdrawal complete");
      System.out.println("Current balance: " + balance);
    }
    else{
      System.out.println();

    }

  }

  public String toString()
  {
    return "Account Number: " + this.accountNumber;
  }


}

