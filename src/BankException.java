import javax.sound.midi.Soundbank;
import java.util.Scanner;

class InsuffientBalance extends Exception
{
    InsuffientBalance(String message)
    {
        super(message);
    }
}
class WrongPin extends Exception
{
    WrongPin(String message)
    {
        super(message);
    }
}

class Bank
{
    int pin;
    double balance;

    Bank(int pin,double balance)
    {
        this.pin=pin;
        this.balance=balance;
    }

    public void withdraw(int Enteredpin,double amount) throws InsuffientBalance,WrongPin
    {
        if(Enteredpin != pin)
        {
            throw new WrongPin("Entered pin is wrong");
        }
        if(balance<amount)
        {
           throw  new InsuffientBalance("Entered amount is greater than balance");
        }
        balance-=amount;
        System.out.println("Balance is"+balance);
    }

    public void deposit(int Enteredpin, double amount) throws WrongPin
    {
        if(Enteredpin!=pin)
        {
            throw  new WrongPin("Entered pin is wrong");
        }
        balance+=amount;
        System.out.println("Balance is"+balance);

    }
}



public class pract {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(1234,30000);
        System.out.println("Enter amount");
        double amount = sc.nextDouble();
        System.out.println("Enter pin");
        Integer pin = sc.nextInt();
        System.out.println("Enter choice");
        Integer choice = sc.nextInt();
        try {
            if(choice == 1)
            {
               bank.withdraw(pin,amount);
            }else if(choice == 2)
            {
                bank.deposit(pin,amount);
            }else {
                System.out.println("Invalid choice");
            }

        }catch (InsuffientBalance | WrongPin e)
        {
            System.out.println("Exception e"+e.getMessage());
        }


    }
}
