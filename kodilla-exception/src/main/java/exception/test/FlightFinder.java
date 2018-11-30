package exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa", true);
        flightMap.put("Mediolan", true);
        flightMap.put("Gdańsk", false);
        flightMap.put("Kraków", true);
        flightMap.put("Florencja", true);
        flightMap.put("New York", false);

        for(Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
           if(flight.getArrivalAirport().equals(entry.getKey())){
               return entry.getValue();
           } else {
               throw new RouteNotFoundException("Route found but is not available");
           }
        }
        throw new RouteNotFoundException("Route not found");
    }
}
