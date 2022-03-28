package src.RentACar;

public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String brand, String model, int numberOfDoors, int maxRange, int batteryCapacity) {
        super(registrationNumber, brand, model, numberOfDoors);
    this.batteryCapacity = batteryCapacity;
    this.maxRange = maxRange;
    }


    public int getBatteryCapacityKwh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhrPrKm() {
        return (batteryCapacity / maxRange) *1000;
    }

    @Override
    public String getRegistration() {
        return super.getRegistration();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int kmPrWh = 100 / (getWhrPrKm() / 91);

        if (kmPrWh >= 21) {
            registrationFee = 330;
        } else if (kmPrWh >= 15 && kmPrWh <= 20) {
            registrationFee = 1050;
        } else if (kmPrWh >= 10 && kmPrWh <= 14) {
            registrationFee = 2340;
        } else if (kmPrWh >= 5 && kmPrWh <= 9) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "ElectricCar" +
                "registrationNumber '" + registrationNumber + '\'' +
                ", brand '" + brand + '\'' +
                ", model '" + model + '\'' +
                ", numberOfDoors " + numberOfDoors +
                ", batteryCapacity " + batteryCapacity +
                ", maxRange" + maxRange;
    }
}


