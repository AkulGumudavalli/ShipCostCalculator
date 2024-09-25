import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the cost of your item? ");
        String trash = "";
        double cost = 0.00;
        if (input.hasNextDouble()) {
            cost = input.nextDouble();
            input.nextLine();
            if (cost < 100.00) {
                double shipping_price = cost * 0.02;
                System.out.println("Your shipping price: $" + shipping_price + " ,And your total cost is: $" + (shipping_price + cost));

            } else {
                System.out.println("Your shipping price is: $0 , And your total cost is: $" + cost);
            };

        }
        else{
            trash = input.nextLine();

            System.out.println("\n You said your wage was:" + trash);
            System.out.println("\n Please run the program again with the correct values");
        }

    }
}