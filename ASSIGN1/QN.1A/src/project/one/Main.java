package project.one;


public class Main
{

    public static void main(String[] args)
    {
        Account ke = new Account(5432345);
            System.out.println(ke.toString());
        Account k = new Account(5432345,500000.0);
          System.out.println(k.toString());
          k.debit(1000000);
          System.out.println(k.toString());
    }

}
