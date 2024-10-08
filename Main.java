public class Main
{
    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("Jeffrey23", 448833, 1000.00, "password", true);
        System.out.println(savings);

        savings.logIn("Jeffrey23", "password");
        System.out.println(savings.getBalance());

        int withdrawAmount = 100;
        System.out.println("System Withdrawal:");
        System.out.println(Balance-withdrawAmount);

    }
}