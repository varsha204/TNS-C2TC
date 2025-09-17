package BillingApplicationProject;

import java.util.Scanner;

public class TiketBookingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First input: stageEvent,customer,noOfSeats
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String stageEvent = parts[0];
        String customer = parts[1];
        Integer noOfSeats = Integer.parseInt(parts[2]);

        TiketBooking booking = new TiketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1: // Cash
                double amount1 = sc.nextDouble();
                booking.makePayment(amount1);
                break;
          case 2: // Wallet
                double amount2 = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(walletNumber, amount2);
                break;

            case 3: // Credit card
                String name = sc.nextLine();
                double amount3 = sc.nextDouble();
                sc.nextLine();
                String creditCard = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(creditCard, ccv, name, amount3);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
