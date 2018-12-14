package challenges.flyCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public List<Flight> getFlightsFromDatabase() {
        List<Flight> fligths = new ArrayList<>();

        fligths.add(new Flight("Warszawa", "Krakow"));
        fligths.add(new Flight("Warszawa", "Radom"));
        fligths.add(new Flight("Krakow", "Berlin"));
        fligths.add(new Flight("Lublin", "Frankfurt"));
        fligths.add(new Flight("Lublin", "Krakow"));
        fligths.add(new Flight("Berlin", "Krakow"));
        fligths.add(new Flight("Wroclaw", "Krakow"));
        fligths.add(new Flight("Frankfurt", "Radom"));
        fligths.add(new Flight("Frankfurt", "Helsinki"));

        return fligths;
    }

}
