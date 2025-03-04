// Parent Class for Multilevel Inheritance
class Vehicle {
    // Fields of the Vehicle class
    String brand;
    int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child Class Car that inherits from Vehicle (Multilevel Inheritance)
class Car extends Vehicle {
    int doors;

    // Constructor
    public Car(String brand, int speed, int doors) {
        super(brand, speed); // Calling parent class constructor
        this.doors = doors;
    }

    // Method to display car details
    public void displayCarInfo() {
        displayInfo(); // Calling parent class method
        System.out.println("Doors: " + doors);
    }
}

// Child Class ElectricCar that inherits from Car (Multilevel Inheritance)
class ElectricCar extends Car {
    int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors); // Calling parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display electric car details
    public void displayElectricCarInfo() {
        displayCarInfo(); // Calling parent class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Parent Class for Hierarchical Inheritance
class Employee {
    String name;
    int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

// Child Class Manager that inherits from Employee (Hierarchical Inheritance)
class Manager extends Employee {
    int teamSize;

    // Constructor
    public Manager(String name, int age, int teamSize) {
        super(name, age); // Calling parent class constructor
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerInfo() {
        displayEmployeeInfo(); // Calling parent class method
        System.out.println("Team Size: " + teamSize);
    }
}

// Child Class Engineer that inherits from Employee (Hierarchical Inheritance)
class Engineer extends Employee {
    String specialization;

    // Constructor
    public Engineer(String name, int age, String specialization) {
        super(name, age); // Calling parent class constructor
        this.specialization = specialization;
    }

    // Method to display engineer details
    public void displayEngineerInfo() {
        displayEmployeeInfo(); // Calling parent class method
        System.out.println("Specialization: " + specialization);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Demonstrating Multilevel Inheritance
        System.out.println("Multilevel Inheritance Example:");
        ElectricCar myElectricCar = new ElectricCar("Tesla", 150, 4, 75);
        myElectricCar.displayElectricCarInfo(); // Displaying ElectricCar details

        System.out.println();

        // Demonstrating Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance Example:");
        Manager manager = new Manager("Alice", 35, 10);
        manager.displayManagerInfo(); // Displaying Manager details

        System.out.println();

        Engineer engineer = new Engineer("Bob", 28, "Software");
        engineer.displayEngineerInfo(); // Displaying Engineer details
    }
}
