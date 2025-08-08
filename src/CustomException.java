class Insuffientamount extends Exception
{

    Insuffientamount(String message)
    {
       super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        double withdrawlamt =20000;
        try
        {
            double balance = 10000;
            if(withdrawlamt> balance)
            {
               throw new Insuffientamount(" Insuffient balance in your account");
            }else{
                balance -=withdrawlamt;
                System.out.println("Withdrawl successfull remaining balance :"+balance);
            }
        }catch (Insuffientamount e)
        {
            System.out.println("Exception"+e.getMessage());
        }
    }
}
