import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    String txnId;
    double amount;
    LocalDate date;

    Example(String txnId, double amount, LocalDate date) {
        this.txnId = txnId;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Example{" +
                "txnId='" + txnId + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Example> bank = new ArrayList<>();
        bank.add(new Example("txnId123", 10000, LocalDate.of(2025, 7, 23)));
        bank.add(new Example("txnId124", 20000, LocalDate.of(2025, 7, 22)));
        bank.add(new Example("txnId126", 50000, LocalDate.of(2025, 7, 21)));
        bank.add(new Example("txnId127", 1000, LocalDate.of(2025, 7, 20)));
        bank.add(new Example("txnId129", 1000, LocalDate.of(2025, 7, 31)));

        // Comparator: higher amount first, then most recent date first
        Comparator<Example> amtDateCompare = (o1, o2) ->
                Double.compare(o2.amount, o1.amount) != 0
                        ? Double.compare(o2.amount, o1.amount)  // Higher amount first
                        : o2.date.compareTo(o1.date);           // If equal, most recent date first

        Collections.sort(bank, amtDateCompare);

        for (Example banks : bank) {
            System.out.println(banks);
        }
    }
}
