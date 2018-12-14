package challenges.flyCompany;

import java.util.Objects;

public class Flight {

    String departure;
    String arrival;


    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrival, flight.arrival) &&
                Objects.equals(departure, flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departure);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
