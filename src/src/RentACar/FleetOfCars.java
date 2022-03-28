package src.RentACar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public int getTotalRegistrationFee() {
        int totalRegistrationFee = 0;
        for(Car f : fleet) {
            totalRegistrationFee += f.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleetoOfCars=" + fleet +
                '}';
    }
}
