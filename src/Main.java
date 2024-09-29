import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int cost = 0
        double cost = 0.00;
        //Output "What is the cost of your item?"
        System.out.println("What is the cost of your item? ");
        if (input.hasNextDouble()) {
            //Input cost
            cost = input.nextDouble();
            input.nextLine();
            //if cost < 100.00 then
                //num shipping price = cost * 0.02
                //Output "Your shipping price: $" + shipping_price + " ,And your total cost is: $" + (shipping_price + cost)
            if (cost < 100.00) {
                double shipping_price = cost * 0.02;
                System.out.println("Your shipping price: $" + shipping_price + " ,And your total cost is: $" + (shipping_price + cost));

            }
            //else
                //Output "Your shipping price is: $0 , And your total cost is: $" + cost
            else {
                System.out.println("Your shipping price is: $0 , And your total cost is: $" + cost);
            }
            //end if

        }
    }
}