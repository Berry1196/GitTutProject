package src.RentACar;

public class DieselCar extends AFuelCar {

    boolean particleFilter;

    public DieselCar(String registrationNumber,  String brand, String model, int numberOfDoors,boolean particleFilter) {
        super(registrationNumber, brand, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }

   public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {

        int registrationFee;
        int partikelCost = 1000;

        if(kmPrLitre >= 21) {
            registrationFee = 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <=20) {
            registrationFee = 1390;
        } else if (kmPrLitre >=10 && kmPrLitre <= 14) {
            registrationFee = 1850;
        } else if (kmPrLitre >=5 && kmPrLitre <= 9){
            registrationFee = 2770;
        } else {
            registrationFee = 15260;
        }

        if(!particleFilter) {
            registrationFee += partikelCost;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar " +
                "registrationNumber '" + registrationNumber + '\'' +
                ", brand '" + brand + '\'' +
                ", model '" + model + '\'' +
                ", numberOfDoors " + numberOfDoors +
                ", kmPrLitre " + kmPrLitre +
                ", particleFilter " + particleFilter;
    }
}
