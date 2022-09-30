public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public void refill() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " можно заправить дизелем или бензином.");
    }

    public String toString() {
        return "Информация об автобусе: " + getBrand() + " " + getModel() + ", " + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() + ", " + getColor() + " цвет кузова, максимальная " +
                "скорость: " + getMaxSpeed() + " км/ч.";
    }
}
