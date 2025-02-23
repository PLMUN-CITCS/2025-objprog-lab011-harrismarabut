import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;
        
        do {
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to classify: ");
                    int num = scanner.nextInt();
                    
                    if (num > 0) {
                        System.out.println("The number " + num + " is positive.");
                    } else if (num < 0) {
                        System.out.println("The number " + num + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    
                    if (num % 2 == 0) {
                        System.out.println("It is an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNum = scanner.nextInt();
                    
                    System.out.println("Multiplication Table for " + tableNum + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
            
            System.out.print("Do you want to return to the menu? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
            
        } while (continueChoice == 'Y' || continueChoice == 'y');
        
        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }
}
