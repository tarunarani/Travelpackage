import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void testPrintDetails() {
        Passenger passenger = new Passenger("John", 1, 100.0);
        Activity activity = new Activity("Sightseeing", "Explore the city", 20.0, 10, destination);
        passenger.signUpForActivity(activity);

        String expectedDetails = "Name: John\nPassenger Number: 1\nBalance: 100.0\nActivities:\n" +
                " - Sightseeing at Destination: <destinationName>, Cost: 20.0";

        assertEquals(expectedDetails, passenger.printDetails());
    }

    @Test
    void testSignUpForActivity() {
        Passenger passenger = new Passenger("Alice", 2, 50.0);
        Activity activity = new Activity("Hiking", "Enjoy nature", 30.0, 5, destination);

        assertTrue(passenger.signUpForActivity(activity));
        assertEquals(20.0, passenger.getBalance()); // Verify balance deduction

        assertFalse(passenger.signUpForActivity(activity)); // Should fail due to insufficient balance
    }
}