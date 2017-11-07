
/*Description
    ===========
    A group of people go camping together, and end up buying a lot of stuff that they share. We need to write code to figure out how much people owe each other, and the most efficient way to pay each other back.

    Example
    =======
    Sarah rents a car for the trip - she pays $400 for the car, which is used by Alice, John, Bob and herself. Later in the trip, John went out and bought groceries for $100, which was used only by Alice and Bob.

    Now, the trip is over and everyone wants to get paid back what they are owed - print out the list of transactions that would settle everyone's debts.*/

import java.util.ArrayList;
import java.util.List;
// Sarah 400
// NbPerson/Group 400/nbPerso
// John 100   100/2
public class Main {

    public static void main(String[] args) {
        // input : purchase Price, Buyer, List<String> users
        List<Purchase> listOfPurchases = new ArrayList<>();

        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("John");
        users.add("Bob");
        users.add("Sarah");
        listOfPurchases.add(new Purchase(400, "Sarah", users));
        List<String> users2 = new ArrayList<>();
        users2.add("Alice");
        users2.add("Bob");
        listOfPurchases.add(new Purchase(100, "John", users2));

        List<Transaction> listOfTransaction = getTransactions(listOfPurchases);

        for (Transaction tr : listOfTransaction) {
            System.out.println("Transaction : price " + tr.priceToPay + " from " + tr.from + " to " + tr.to);
        }

        // output : transaction

    }

    public static List<Transaction> getTransactions(List<Purchase> purchases){
        List<Transaction> transactions = new ArrayList<>();

        // Alice -> Sarah 100
        // Alice -> Sarah 300
        for (Purchase purchase : purchases){
            double price = purchase.price;
            int nbPersons = purchase.users.size();
            double averPrice = price/nbPersons;

            for (String user : purchase.users){
                if (user.equals(purchase.bueyr))
                    continue;
                Transaction transaction = new Transaction();
                transaction.to = purchase.bueyr;
                transaction.priceToPay = averPrice;
                transaction.from = user;
                transactions.add(transaction);
            }
        }

        for (Transaction transaction1 : transactions){
            String to = transaction1.to;
            for (Transaction transaction2 : transactions) {
                String from = transaction2.from;
                if (to.equals(from)) {
                    double temp = transaction1.priceToPay;
                    if (transaction1.priceToPay <= transaction2.priceToPay) {
                        transaction2.priceToPay -=transaction1.priceToPay;
                        transaction1.priceToPay = 0;
                    }

                    for (Transaction trans:transactions) {
                        if (trans.to.equals(transaction2.to) && trans.from.equals(transaction1.from)){
                            trans.priceToPay += temp;
                        }
                    }

                }
            }

        }

        return transactions;

    }

}
