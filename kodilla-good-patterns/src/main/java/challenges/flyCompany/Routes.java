package challenges.flyCompany;

import java.util.List;

public class Routes {

    public static void main(String[] args) {

        FlightRepository flightRepository = new FlightRepository();
        FlightSearchService flightSearchService = new FlightSearchService(flightRepository);

        List<Flight> searchResult = flightSearchService.findFlightFrom("Lublin");
        searchResult.stream().forEach(System.out::println);

        System.out.println("------------------------------");

        List<Flight> searchResult2 = flightSearchService.findFlightTo("Berlin");
        searchResult2.stream().forEach(System.out::println);

        System.out.println("------------------------------");

        String departureAirport = "Lublin";
        List<Flight> searchResult3 = flightSearchService.findFlightToWithStopover(departureAirport, "Berlin");
        System.out.println("Possible transfers from " + departureAirport);
        searchResult3.stream().forEach(System.out::println);


    }

}
