package src.RentACar;

public abstract class ACar implements Car {
    String registrationNumber;
    String brand;
    String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String brand, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistration() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
