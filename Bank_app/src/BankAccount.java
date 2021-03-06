import java.util.Scanner;

public class BankAccount {
int balance;
int previousTransaction;
String customerName;
String customerId;

BankAccount(String cname,String cid){
	customerName = cname;
	customerId = cid;
}

void deposit(int amount) {
	if (amount!=0 || amount<0) {
		balance = balance + amount;
		previousTransaction = amount;
				
	}
}
void withdraw(int amount) {
	if (amount!=0 || amount<0) {
		balance = balance - amount;
		previousTransaction = -amount;
				
	}
}
void getPreviousTransaction() {
	if (previousTransaction<0) {
		System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
	}
	else if(previousTransaction>0) {
		System.out.println("Deposited: "+ (previousTransaction));
	}
	else {
		System.out.println("No transaction occured");
	}
}
void showMenu() {
	char option = '\0';
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome "+customerName);
	System.out.println("Your ID is "+customerId);
	System.out.println("\n");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposit ");
	System.out.println("C. Withdraw");
	System.out.println("D. Previous transaction");
	System.out.println("E. Exit");
	
	do {
		System.out.println("============================================================================================");
		System.out.println("Enter an option");
		System.out.println("============================================================================================");
		option =  scanner.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
		case 'A':
			System.out.println("--------------------------------------");
			System.out.println("Balance is "+ balance);
			System.out.println("--------------------------------------");
			break;
		case 'B':
			System.out.println("--------------------------------------");
			System.out.println("Enter amount to deposit ");
			System.out.println("--------------------------------------");
			int amount = scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			System.out.print(amount + " deposited");
			System.out.println("\n");
			break;
		case 'C':
			System.out.println("--------------------------------------");
			System.out.println("Enter amount to withdraw ");
			System.out.println("--------------------------------------");
			int w_amount = scanner.nextInt();
			withdraw(w_amount);
			System.out.println("\n");
			System.out.print(w_amount + "withdrawn");
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("--------------------------------------");
			System.out.println("Your previous transaction ");
			System.out.println("--------------------------------------");
			getPreviousTransaction();
			System.out.println("\n");
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("--------------------------------------");
			System.out.println("Done!");
			break;
		default:
			System.out.println("Invalid option please enter again");
			break;
		}
		
	}
	while(option != 'E');
}

}
