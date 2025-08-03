import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort Bank Transactions by Amount and Date
//
//Class: Transaction (txnId, amount, txnDate)
//
//Sort: higher amount first; if equal, most recent txn first.
public class BankTransaction {
    String txnId;
    double amount;
    LocalDate date;

    @Override
    public String toString() {
        return "BankTransaction{" +
                "txnId='" + txnId + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    BankTransaction(String txnId,double amount,LocalDate date)
    {
        this.txnId=txnId;
        this.amount=amount;
        this.date=date;
    }


}

class Transactions implements Comparator<BankTransaction>
{

    @Override
    public int compare(BankTransaction o1, BankTransaction o2) {
        int amountCompare = Double.compare(o1.amount, o2.amount);
        if(amountCompare ==0)
        {
            return o1.date.compareTo(o2.date);
        }
        return amountCompare;
    }
}
class BankingTransaction
{
    public static void main(String[] args) {
        List<BankTransaction> bankdetails = new ArrayList<>();
        bankdetails.add(new BankTransaction("txnId123",100000, LocalDate.of(25,07,10)));
        bankdetails.add(new BankTransaction("txnId456",200000, LocalDate.of(25,07,11)));
        bankdetails.add(new BankTransaction("txnId890",500000, LocalDate.of(25,07,13)));
        bankdetails.add(new BankTransaction("txnId100",500000, LocalDate.of(25,07,12)));

        Collections.sort(bankdetails,new Transactions());

        for(BankTransaction trans : bankdetails)
        {
            System.out.println(trans);
        }

    }
}
