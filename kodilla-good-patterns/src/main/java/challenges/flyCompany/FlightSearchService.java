package challenges.flyCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchService {

    private FlightRepository flightRepository;

    public FlightSearchService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findFlightFrom(String departureAirport) {
        return flightRepository.getFlightsFromDatabase().stream()
                .filter( f -> f.getDeparture().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String arrivalAirport) {
        return flightRepository.getFlightsFromDatabase().stream()
                .filter( f -> f.getArrival().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightToWithStopover(String departureAirport, String arrivalAirport) {
        //loty z miejsca startowego
        List<Flight> possibleFlights = findFlightFrom(departureAirport);
        //wszystkie mozliwe przesiadki
        List<Flight> possibleStopovers = possibleFlights.stream()
                .flatMap(f -> findFlightFrom(f.getArrival()).stream())
                .collect(Collectors.toList());
        //ze wszystkich mozliwych przesiadek zwraca te z podanym miejscem docelowym
        return possibleStopovers.stream()
                .filter(f -> f.getArrival().equals(arrivalAirport))
                .collect(Collectors.toList());

    }



}
