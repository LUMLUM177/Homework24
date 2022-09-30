public class Car extends Transport {

    double engineVolume;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int countSeats;
    String typeTyres;
    boolean carElectric;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int countSeats, String typeTyres, int speed, boolean carElectric) {
        super(brand, model, productionYear, productionCountry, color, speed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission != null && transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType != null && bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber != null && registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (countSeats <= 0) {
            this.countSeats = 1;
        } else {
            this.countSeats = countSeats;
        }
        if (typeTyres != null && typeTyres.isEmpty()) {
            this.typeTyres = "default";
        } else {
            this.typeTyres = typeTyres;
        }
        if (carElectric == true || carElectric == false) {
            this.carElectric = carElectric;
        } else {
            this.carElectric = false;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public String getTypeTyres() {
        return typeTyres;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTypeTyres(String typeTyres) {
        if (typeTyres != null && typeTyres.isEmpty()) {
            this.typeTyres = "default";
        } else {
            this.typeTyres = typeTyres;
        }
    }

    public void refill() {
        if (this.carElectric == true) {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " можно заправить " +
                    "на электродо-парковках, а также бензином или дизелем.");
        } else {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " можно заправить дизелем или бензином.");
        }

    }

    public String toString() {
        return "Информация об автомобиле: " + getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска, сборка в "
                + getProductionCountry() + ", " + getColor() + " цвет кузова, объём двигателя - " + engineVolume + " литра. " +
                "Коробка передач " + transmission + ", тип кузова - " + bodyType + ", регистрационный номер - " +
                registrationNumber + ", количество мест - " + countSeats + ", тип резины - " + typeTyres + ", максимальная " +
                "скорость: " + getMaxSpeed() + " км/ч";
    }
}
