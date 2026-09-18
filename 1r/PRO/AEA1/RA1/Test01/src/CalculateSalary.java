//
import java.util.Scanner; // Scanner class import
//
public class CalculateSalary {

    public static void main(String[] args) {
	System.out.println("--------------------------------------------------");
	System.out.println("----------------Salary Calculator-----------------");
	System.out.println("--------------------------------------------------");
	// We need to declare the Scanner variable to read input
	Scanner keyboard = new Scanner(System.in); // Remember to do CTRL space to auto-import the Scanner class.
	// Create the variables
	double hourlyRateBeforeTax;
	double hourlyRate;
	double weeklyHours;
	int yearlyPays;
	double taxRate;
	double remainingEarnings; // The percentage of the earning that the worker gets 
	double monthlySalaryBeforeTax;
	double monthlySalary;
	double yearlySalaryBeforeTax;
	double yearlySalary;
	// String workersName;
	// Here we ask for the value of both variables and assign them
	System.out.println("What is you hourly rate?"); // 9.25925926
	hourlyRateBeforeTax = keyboard.nextDouble();
	System.out.println("--------------------------------------------------");
	System.out.println("How many hours do you work each week?");
	weeklyHours = keyboard.nextDouble();
	System.out.println("--------------------------------------------------");
	System.out.println("How many monthly payments do you get a year?");
	yearlyPays = keyboard.nextInt();
	System.out.println("--------------------------------------------------");
	System.out.println("What is your tax rate?");
	taxRate = keyboard.nextDouble();
	// workersName = keyboard.next(); // This only takes the first thing, if the user inputs more than one line the excess will be sent to the next Scanner.
	// workersName = keyboard.nextLine(); // This scans the entire line, not only the first.
	// Now we calculate their salary before tax
	monthlySalaryBeforeTax = (weeklyHours * hourlyRateBeforeTax) * 4;
	yearlySalaryBeforeTax = monthlySalaryBeforeTax * 14;
	monthlySalaryBeforeTax = yearlySalaryBeforeTax / yearlyPays;
	// Now we calculate their salary after tax
	remainingEarnings = 100 - taxRate;
	hourlyRate = (hourlyRateBeforeTax / 100) * remainingEarnings;
    	monthlySalary = (monthlySalaryBeforeTax / 100) * remainingEarnings;
    	yearlySalary = (yearlySalaryBeforeTax / 100) * remainingEarnings;
	// We tell them
	System.out.println("--------------------------------------------------");
	System.out.println("-------------Total Salary Calculator--------------");
	System.out.println("--------------------------------------------------");
	System.out.println("- Hourly rate after tax: " + hourlyRate);
	System.out.println("- Monthly salary before tax: " + monthlySalaryBeforeTax);
	System.out.println("- Monthly salary after tax: " + monthlySalary);
	System.out.println("- Yearly salary before tax: " + yearlySalaryBeforeTax);
	System.out.println("- Yearly salary after tax: " + yearlySalary);
	System.out.println("--------------------------------------------------");
    }

}
// Quack
