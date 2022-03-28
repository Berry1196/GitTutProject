package src.RentACar;

public class Main {
   // public static FleetOfCars fleetOfCars;

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();
        DieselCar dieselCar = new DieselCar("AB12345", "Audi", "A6",5,false);
        ElectricCar electricCar = new ElectricCar("AC12435", "Tesla", "Model S",5,1000,1500);
        GasolineCar gasolineCar = new GasolineCar("AD12543", "BMW", "X6",5,16);
        fleetOfCars.addCar(dieselCar);
        fleetOfCars.addCar(electricCar);
        fleetOfCars.addCar(gasolineCar);

        for(Car f: fleetOfCars.getFleet()) {
            System.out.println(f);
        }
        System.out.println("Total cost of registration= " + fleetOfCars.getTotalRegistrationFee());
    }
}
