import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMinutes = 0; // Stores accumulated total in minutes
        boolean running = true;

        System.out.println("Welcome to Time Calculator!");
        System.out.println("Enter time in format (e.g., 1h30m) and use + or - to add or subtract time.");
        System.out.println("Press 'c' to clear and exit.");

        while (running) {
            System.out.print("Enter time with operator (+/-): ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Check for clear and exit condition
            if (input.equals("c")) {
                System.out.println("Calculator cleared. Exiting.");
                running = false;
                continue;
            }

            // Determine operation based on the first character
            char operation = input.charAt(0);
            if (operation != '+' && operation != '-') {
                System.out.println("Invalid input. Please start with + or -.");
                continue;
            }

            // Extract and parse time in hours and minutes
            int hours = 0;
            int minutes = 0;
            input = input.substring(1); // Remove the operator

            if (input.contains("h")) {
                String[] parts = input.split("h");
                hours = Integer.parseInt(parts[0]);
                if (parts.length > 1 && parts[1].contains("m")) {
                    minutes = Integer.parseInt(parts[1].replace("m", ""));
                }
            } else if (input.contains("m")) {
                minutes = Integer.parseInt(input.replace("m", ""));
            }

            int timeInMinutes = (hours * 60) + minutes;

            // Perform the calculation based on the operation
            if (operation == '+') {
                totalMinutes += timeInMinutes;
            } else if (operation == '-') {
                totalMinutes -= timeInMinutes;
            }

            System.out.println("Current total: " + totalMinutes + " minutes");
        }

        scanner.close();
    }
}
