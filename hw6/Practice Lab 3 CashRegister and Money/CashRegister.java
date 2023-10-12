import java.util.Scanner;
import java.io.*;

class Money {
	private int cents;
	
	public Money() {
		cents = 0;
	}
	
	public Money(Scanner scan) {
		String stringCents = scan.next();
		cents = Integer.parseInt(stringCents.substring(1, stringCents.indexOf(".")))*100+Integer.parseInt(stringCents.substring(stringCents.indexOf(".")+1));
	}
	
	public void add(Money money) {
		cents += money.cents;
	}
	
	public String toString() {
		return "$"+cents/100+(cents%100<10?".0"+cents%100:"."+cents%100);
	}
	
	private boolean equals(Money money) {
		if(this.cents == money.cents)
			return true;
		return false;
	}
}

public class CashRegister {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner balanceReader = new Scanner(new File("balance"));
      Money balance = new Money(balanceReader);
      System.out.println("Starting Balance: " + balance.toString());
      
      Scanner transactionsReader = new Scanner(new File("transactions"));
      int transactionsCount = 0;
      Money transactionSum = new Money();
      
      while(transactionsReader.hasNext()) {
         transactionsCount++;
         Money newMoneyVariable = new Money(transactionsReader);
         transactionSum.add(newMoneyVariable);
      }
      
      System.out.println(transactionsCount + " transactions");
      System.out.println("Transaction Total: " + transactionSum.toString());
      balance.add(transactionSum);
      System.out.println("Closing balance: " + balance.toString());
      
      PrintWriter fileWriter = new PrintWriter(new File("balance"));
      fileWriter.println(balance.toString());
      fileWriter.close();
	}
}