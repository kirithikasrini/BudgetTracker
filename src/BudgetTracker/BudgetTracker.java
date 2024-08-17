package BudgetTracker;
import java.util.Scanner;
public class BudgetTracker {
	private double totalExpenses;
	private double totalIncome;
	private double totalRecurringCost;
	public BudgetTracker() {
		this.totalExpenses = 0;
		this.totalIncome=0;
		this.totalRecurringCost=0;
	}

	public void addExpense(double amount) {
		totalExpenses += amount;
	}

	public void addIncome(double amount) {
		totalIncome += amount;
	}

	public void addRecurringCost(double amount) {
		totalRecurringCost += amount;
	}

	public void displayBudget() {
		System.out.println("Total Expenses:" + totalExpenses);
		System.out.print("Total Income: " +totalIncome);
		System.out.println("Total Recurring Cost: " + totalRecurringCost);
		System.out.println("Total Budget: " + (totalIncome - totalExpenses - totalRecurringCost));
	}

	public static void main(String[] args) {
		BudgetTracker budgetTracker = new BudgetTracker();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add Expense");
			System.out.println("2.Add Income");
			System.out.println("3.Recurring Cost");
			System.out.println("4.Display Budget");
			System.out.println("5.Exit");
			System.out.println("Choose an option: ");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Expense Amount: ");
				double expenseAmount = scanner.nextDouble();
				budgetTracker.addExpense(expenseAmount);
				break;
			case 2:
				System.out.println("Enter Income Amount: ");
				double incomeAmount = scanner.nextDouble();
				budgetTracker.addIncome(incomeAmount);
				break;
			case 3:
				System.out.println("Enter Recurring Cost Amount: ");
				double recurringAmount = scanner.nextDouble();
				budgetTracker.addRecurringCost(recurringAmount);
				break;
			case 4:
				budgetTracker.displayBudget();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option!! \nPlease Choose again.");
			}
		}
	}
}