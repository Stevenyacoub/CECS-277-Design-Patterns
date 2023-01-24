import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        // YOUR CODE to input user's pizza order and then display the pizza using toString method.
        System.out.println("MENU");
        System.out.println("Cheese");
        System.out.println("Pepperoni");
        System.out.println("Please order a Pizza: ");
        Scanner in = new Scanner(System.in);
        PizzaFactory maker = new PizzaFactory();
        Pizza order = maker.orderPizza(in.nextLine());
        order.toString();
    }
}