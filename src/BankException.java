import javax.sound.midi.Soundbank;
import java.util.Scanner;

class InsufficentBalance extends Exception
{
    InsufficentBalance(String message)
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
    double amount;
    double balance;

    int pin;

    Bank(double balance,int pin)
    {
        this.balance= balance;
        this.pin=pin;
    }

    public  void withdrawl(int enteredPin,double amount) throws WrongPin,InsufficentBalance
    {
        if(enteredPin != pin)
        {
            throw  new WrongPin("You Entered wrong pin please check");
        }
        if(amount>balance)
        {
            throw new InsufficentBalance("Insufficient balance");
        }
        balance-=amount;
        System.out.println("balance :"+balance);
    }
    public void deposit(int enteredPin,double amount) throws WrongPin
    {
        if(enteredPin != pin)
        {
            throw  new WrongPin("You Entered wrong pin please check");
        }
        balance +=amount;
        System.out.println("Balance is :"+balance);
    }
}

public class BankException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(2000,1234);
        try
        {
            System.out.print("Enter pin :");
            int pin = sc.nextInt();
            System.out.print("Enter amount :");
            double amt = sc.nextDouble();
            bank.withdrawl(pin,amt);

            System.out.print("Enter amount for Deposit :");
            double deposit = sc.nextDouble();
            bank.deposit(pin,deposit);
        }catch (WrongPin | InsufficentBalance e)
        {
            System.out.println("Exception :"+e.getMessage());
        }

    }
}
