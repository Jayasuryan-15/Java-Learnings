package Problems;

interface Vehicle {
    void start();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}


class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck starts with a push button.");
    }
}

class PolymorphismExample {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle truck = new Truck();


        startVehicle(car);
        startVehicle(truck);
    }


    public static void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }
}

