package src.RentACar;

public abstract class AFuelCar extends ACar{
    int kmPrLitre;


    public AFuelCar(String registrationNumber, String brand, String model, int numberOfDoors) {
        super(registrationNumber, brand, model, numberOfDoors);
    }

    abstract String getFuelType();

    int kmPrLitre() {
       return 0; // should return how many kilometres the car can drive on 1 litre of fuel
    }
}
