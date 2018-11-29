package exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Poznań", "Gdańsk");

        try {
            flightFinder.findFlight(flight);
            System.out.println("Flight found");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
