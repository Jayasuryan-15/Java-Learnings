package Problems;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount) {
        if (amount > quantity) {
            System.out.println("Insufficient stock.");
        } else {
            quantity -= amount;
        }
    }
}

class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        items.add(product);
        product.decreaseQuantity(quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println("Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }
}

 class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product("Laptop", 80000, 10);
        Product product2 = new Product("Smartphone", 20000, 20);

        ShoppingCart cart = new ShoppingCart();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nOnline Shopping System");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name (Laptop/Smartphone): ");
                    String productName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (productName.equalsIgnoreCase("Laptop")) {
                        cart.addItem(product1, quantity);
                    } else if (productName.equalsIgnoreCase("Smartphone")) {
                        cart.addItem(product2, quantity);
                    } else {
                        System.out.println("Invalid product name.");
                    }
                    break;
                case 2:
                    cart.displayCart();
                    System.out.println("Total: $" + cart.calculateTotal());
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us. Your total is $" + cart.calculateTotal());
                    exit = true;
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}

