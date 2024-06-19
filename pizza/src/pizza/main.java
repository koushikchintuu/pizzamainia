package pizza;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.println("Welcome to Pizza Bill Generator");
        System.out.println("Menu:");
        System.out.println("1. Veg Pizza - $300");
        System.out.println("2. Non Veg Pizza - $400");
        System.out.println("3. Deluxe Veg Pizza - $550");
        System.out.println("4. Deluxe Non Veg Pizza - $650");
        System.out.println("Extra Cheese - $100");
        System.out.println("Extra Toppings - $150");
        System.out.print("Enter your choice (1-4 for pizza): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double pizzaCost = 0.0;

        switch (choice) {
            case 1:
                VegPizza vegPizza = new VegPizza();
                System.out.print("Do you want extra cheese? (yes/no): ");
                String extraCheeseInput = scanner.nextLine();
                if (extraCheeseInput.equalsIgnoreCase("yes")) {
                    vegPizza.addExtraCheese();
                }

                System.out.print("Do you want extra toppings? (yes/no): ");
                String extraToppingsInput = scanner.nextLine();
                if (extraToppingsInput.equalsIgnoreCase("yes")) {
                    vegPizza.addExtraToppings();
                }

                pizzaCost = vegPizza.calculateCost();
                break;
            case 2:
                NonVegPizza nonVegPizza = new NonVegPizza();
                System.out.print("Do you want extra cheese? (yes/no): ");
                extraCheeseInput = scanner.nextLine();
                if (extraCheeseInput.equalsIgnoreCase("yes")) {
                    nonVegPizza.addExtraCheese();
                }

                System.out.print("Do you want extra toppings? (yes/no): ");
                extraToppingsInput = scanner.nextLine();
                if (extraToppingsInput.equalsIgnoreCase("yes")) {
                    nonVegPizza.addExtraToppings();
                }

                pizzaCost = nonVegPizza.calculateCost();
                break;
            case 3:
                DeluxeVegPizza deluxeVegPizza = new DeluxeVegPizza();
                pizzaCost = deluxeVegPizza.calculateCost();
                break;
            case 4:
                DeluxeNonVegPizza deluxeNonVegPizza = new DeluxeNonVegPizza();
                pizzaCost = deluxeNonVegPizza.calculateCost();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
        }

        bill.addPizza(pizzaCost);

        System.out.print("Do you want takeaway? (yes/no): ");
        String takeawayInput = scanner.nextLine();
        boolean takeaway = takeawayInput.equalsIgnoreCase("yes");
        bill.setTakeaway(takeaway);

        double totalBill = bill.calculateTotal();
        System.out.println("Your total bill is: $" + totalBill);

        scanner.close();
    }
}