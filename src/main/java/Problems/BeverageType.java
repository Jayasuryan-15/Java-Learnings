package Problems;


enum BeverageType {
    COFFEE, TEA, JUICE, SMOOTHIE
}


class Beverage {
    private String name;
    private BeverageType type;
    private double price;

    public Beverage(String name, BeverageType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BeverageType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class CoffeeShop {
    public static void main(String[] args) {

        Beverage coffee = new Beverage("Espresso", BeverageType.COFFEE, 2.5);
        Beverage tea = new Beverage("Green Tea", BeverageType.TEA, 2.0);
        Beverage juice = new Beverage("Orange Juice", BeverageType.JUICE, 3.0);
        Beverage smoothie = new Beverage("Berry Smoothie", BeverageType.SMOOTHIE, 4.0);


        System.out.println("Available Beverages:");
        System.out.println(coffee.getName() + " - $" + coffee.getPrice());
        System.out.println(tea.getName() + " - $" + tea.getPrice());
        System.out.println(juice.getName() + " - $" + juice.getPrice());
        System.out.println(smoothie.getName() + " - $" + smoothie.getPrice());
    }
}
