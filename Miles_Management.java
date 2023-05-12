
package Miles_Management;

import java.util.Scanner;

public class Miles_Management {

    public static final int BONUS_MILES = 25000;
    public static final int BONUS_SEGMENTS = 10;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter [Y] or [y] if participates in promotion:");
        String bonus = keyboard.nextLine();

        System.out.println("Enter customer mileage:");
        int customerMileage = keyboard.nextInt();

        System.out.println("Enter customer segments:");
        int customerSegments = keyboard.nextInt();

        String applyBonus = bonus.substring(0, 1);
        String applyBonusLower = applyBonus.toLowerCase();
        int totalMiles = customerMileage;
        int totalSegments = customerSegments;

        boolean promo = applyBonusLower.equals("y");

        if (promo) {
            totalMiles = customerMileage + BONUS_MILES;
            totalSegments = customerSegments + BONUS_SEGMENTS;

        }

        String status = "";

        if (totalMiles >= 100000 && totalSegments >= 75) {
            status = "Platinum";

        } else if (totalMiles >= 75000 && totalSegments >= 50) {
            status = "Gold";

        } else if (totalMiles >= 50000 && totalSegments >= 25) {
            status = "Silver";

        } else {
            status = "Bronze";
        }

        System.out.println("Total mileage: " + customerMileage);
        System.out.println("Total mileage with bonus: " + totalMiles);
        System.out.println("Count of Segements flown: " + customerSegments);
        System.out.println("Count of Segements with bonus: " + totalSegments);
        System.out.println("The customer's status is: " + status);

    }

}
