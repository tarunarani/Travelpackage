import java.util.ArrayList;
import java.util.List;

class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    // Constructors, getters, and setters

    // Other methods as needed
}

class Destination {
    private String name;
    private List<Activity> activities;

    // Constructors, getters, and setters

    // Other methods as needed
}

class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    // Constructors, getters, and setters

    // Other methods as needed

    public void printItinerary() {
        // Implement the logic to print itinerary
    }

    public void printPassengerList() {
        // Implement the logic to print passenger list
    }
}

class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> activities;

    // Constructors, getters, and setters

    // Other methods as needed

    public void printDetails() {
        // Implement the logic to print details of an individual passenger
    }
}

public class TravelAgencySystem {
    public static void main(String[] args) {
        // Example usage of the classes and methods
        // Create instances, add activities, passengers, and destinations, and print details as needed
    }
}