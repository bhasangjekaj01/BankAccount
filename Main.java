public class Main
{
    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("Jeffrey23", 448833, 990.00, "password", true);
        System.out.println(savings);

        savings.logIn("Jeffrey23", "password");
        System.out.println(savings.getBalance());
    }
}