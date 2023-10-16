import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Transaction {
    private final int amount;
    private final Date date;

    public Transaction(int amount, Date date){
        this.amount=amount;
        this.date=(Date) date.clone();
    }

    /**
     * Find value in an array
     * @params a array to search; requires that val occurs exactly once in a.
     * @params val value to search for
     * @return index i such that a[i] = val
     */
//    static int find(int[] a,int val){}
    public Date getDate() {
        return (Date)date.clone(); //defensive copying
    }

    public int getAmount() {
        return amount;
    }

    public static Transaction makeNextPayment(Transaction t) {
        Date d = t.getDate();
        d.after(new Date(12,12,2000));
        return new Transaction (t.getAmount(), d);
    }
    /** @return a list of 12 monthly payments of identical amounts */
//    public static List<Transaction> makeYearOfPayments (int amount) {
//        List<Transaction> list = new ArrayList<Transaction> ();
//        Calendar date = new GregorianCalendar();
//        for (int i=0; i < 12; i++) {
//            list.add (new Transaction (amount, date));
//            date.add (Calendar.MONTH, 1);
//        }
//        return list;
//    }
}
