public class Main
{
    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("Jeffrey23", 448833, 1000.00, "password", true);
        System.out.println(savings);

        savings.logIn("Jeffrey23", "password");
        System.out.println(savings.getBalance());

        savings.deposit(100.50);
        System.out.println(savings);
        savings.withdraw(50.20);
        System.out.println(savings);



    }
}