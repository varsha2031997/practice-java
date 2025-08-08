class Payment
{
    public String customer;
    public double amount;
    public String paymentmode;

    public double balance;


    public boolean processPayment(String customer,double amount,String paymentmode,double balance) throws InvalidAmountException, CardDeclinedException
    {
            if(amount <= 0)
            {
                throw  new InvalidAmountException("Invalid amount");
            }

            if(!paymentmode.equals("upi") && !paymentmode.equals("card") &&!paymentmode.equals("wallet"))
            {
                throw new IllegalArgumentException("Unsupported payment mode");
            }

            if(paymentmode == "card" && amount > balance)
            {
                throw new CardDeclinedException("Insuffient balance please check");
            }

             System.out.println("Payment processed for :" +customer + "with amount :"+ amount + "With payment mode :"+paymentmode);
            return true;

    }
}

class InvalidAmountException extends Exception
{
    private String message;
    InvalidAmountException(String message)
    {
        super(message);
        this.message = message;
    }
}
class CardDeclinedException extends Exception
{
    private String message;
    CardDeclinedException(String message)
    {
        super(message);
        this.message= message;
    }
}
public class Main {
    public static void main(String[] args) {
          Payment p = new Payment();
          try
          {
              if(p.processPayment("varsha",10000,"upi",20000))
              {
                  System.out.println("Transaction successful");
              }
          }catch (IllegalArgumentException | CardDeclinedException | InvalidAmountException e)
          {
              System.out.println("Payment failed : "+e.getMessage());
          }finally {
              System.out.println("Payment session ended");
          }


    }
}