package src.RentACar;

public class GasolineCar extends AFuelCar  {



    public GasolineCar(String registrationNumber, String brand, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, brand, model, numberOfDoors);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {

        int registrationFee;

        if(kmPrLitre >= 21) {
            registrationFee = 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <=20) {
            registrationFee = 1050;
        } else if (kmPrLitre >=10 && kmPrLitre <= 14) {
            registrationFee = 2340;
        } else if (kmPrLitre >=5 && kmPrLitre <= 9){
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }
            return registrationFee;
    }

    @Override
    public String toString() {
        return "GasolineCar " +
                "registrationNumber '" + registrationNumber + '\'' +
                ", brand '" + brand + '\'' +
                ", model '" + model + '\'' +
                ", numberOfDoors " + numberOfDoors +
                ", kmPrLitre " + kmPrLitre;
    }
}



   /* For en Benzinbil er afgiften afhængig af kilometer pr liter. Hvis den kører mellem 20 km/l
        og 50 km/l er prisen 330 kr, mellem 15 km/l og 20 km/l er prisen 1050 kr, mellem 10 km/l
        og 15 km/l er prisen 2340 kr, mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l
        er prisen 10470 kr */