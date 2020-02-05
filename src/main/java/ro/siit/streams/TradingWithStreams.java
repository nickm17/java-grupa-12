package ro.siit.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TradingWithStreams {




    /*
            Find all transactions in the year 2011 and sort them by value (small to high).
            What are all the unique cities where the traders work?
            Find all traders from Cambridge and sort them by name.
            Return a string of all traders names sorted alphabetically.
            Are any traders based in Milan?
            Print all transactions values from the traders living in Cambridge.
            Whats the highest value of all the transactions?
            Find the transaction with the smallest value.
             */
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(brian, 2011, 300));
        transactions.add(new Transaction(raoul, 2012, 1000));
        transactions.add(new Transaction(raoul, 2011, 400));
        transactions.add(new Transaction(mario, 2012, 710));
        transactions.add(new Transaction(mario, 2012, 700));
        transactions.add(new Transaction(alan, 2012, 950));

//        List<Transaction> transFrom2011 = getTransactionsFrom2011SortedByValue(transactions);

//        List<Transaction> from2011 = new ArrayList<>();
//        for (Transaction tr : transactions) {
//            if(tr.getYear() != 2011) {
//                from2011.add(tr);
//            }
//        }

//        System.out.println(transFrom2011);
//        transFrom2011.forEach(System.out::println);
//        Collections.sort(transFrom2011, Comparator.comparingInt(Transaction::getValue));
//        Collections.sort(transFrom2011, (transaction1, transaction2) -> transaction1.getValue()-transaction2.getValue());

        List<List<Transaction>> flatMapEx = new ArrayList<>();
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);
        flatMapEx.add(transactions);

//        Stream<Stream<Transaction>> flatStream = flatMapEx.stream().map(transactions1 -> transactions.stream());//.forEach(System.out::println);
//         flatMapEx.stream().map(transactions1 -> transactions.get(0)).forEach(System.out::println);
        flatMapEx.stream().flatMap(transactions1 -> transactions.stream());
         Stream<Integer> integerStream = flatMapEx.stream()
                                                  .map(transactions1 -> transactions.get(3))
                                                  .map(transaction -> transaction.getYear())
                                                  .map(year -> year + 10);
//        integerStream.forEach(System.out::println);
    }

    /**
     * Find all transactions in the year 2011 and sort them by value (small to high).
     *
     * This method returns all transactions from 2011 sorted by value
     *
     * @param transactions
     * @return
     */
    private static List<Transaction> getTransactionsFrom2011SortedByValue(List<Transaction> transactions) {
        return transactions
                .stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
//                .sorted((transaction1, transaction2) -> transaction1.getValue()-transaction2.getValue())
                .collect(toList());
    }


}
