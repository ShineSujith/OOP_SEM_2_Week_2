package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        MenuItem[] items = new MenuItem[] {
            new Burger("burger", 2.99, "cheese, sauce, lettuce"),
            new Salad("salad", 0.99, "lettuce, tomato"),
            new Pizza("pizza", 15.00, "peperoni, cheese, tomato sauce"),
        };

        for(MenuItem menuItem: items) {
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Price: " + menuItem.getPrice() + "\n");
        }

        double totalcost = 0;
        for(MenuItem menuItem: items) {
            totalcost += menuItem.getPrice();
        }
        System.out.println("Total cost: " + totalcost);
    }
}