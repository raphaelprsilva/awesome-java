import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Double> transactions;

  public Customer(String name, double initialTransaction) {
    this.name = name;
    this.transactions = new ArrayList<Double>();
    addTransaction(initialTransaction);
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Double> getTransactions() {
    return this.transactions;
  }

  public void addTransaction(double transaction) {
    if (transaction > 0) {
      this.transactions.add(transaction);
    } else {
      System.out.println("Não é possível fazer um transação com valor negativo.");
    }
  }
}
