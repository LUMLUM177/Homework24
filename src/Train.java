public class Train extends Transport {

    private double costTravel;
    private String timeTravel;
    private String stationDeparture;
    private String stationArrival;
    private int countTrainCar;

    public Train(String brand, String model, int productionYear, String productionCountry, double costTravel,
                 String timeTravel, String stationDeparture, String stationArrival, int countSeats, int speed) {
        super(brand, model, productionYear, productionCountry, null, speed);
        if (costTravel <= 0) {
            this.costTravel = 0;
        } else {
            this.costTravel = costTravel;
        }
        if (timeTravel != null && timeTravel.isEmpty()) {
            this.timeTravel = "default";
        } else {
            this.timeTravel = timeTravel;
        }
        if (stationDeparture != null && stationDeparture.isEmpty()) {
            this.stationDeparture = "default";
        } else {
            this.stationDeparture = stationDeparture;
        }
        if (stationArrival != null && stationArrival.isEmpty()) {
            this.stationArrival = "default";
        } else {
            this.stationArrival = stationArrival;
        }
        if (countSeats <= 0) {
            this.countTrainCar = 1;
        } else {
            this.countTrainCar = countSeats;
        }
    }

    public double getCostTravel() {
        return costTravel;
    }

    public String getTimeTravel() {
        return timeTravel;
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public int getCountTrainCar() {
        return countTrainCar;
    }

    public void setCostTravel(double costTravel) {
        this.costTravel = costTravel;
    }

    public void setTimeTravel(String timeTravel) {
        this.timeTravel = timeTravel;
    }

    public void refill() {
        System.out.println("Поезд " + getBrand() + " " + getModel() + " можно заправить только дизелем.");
    }

    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() + " год выпуска в "
                + getProductionCountry() + ", скорость передвижения - " + getMaxSpeed() + " км/ч, отходит от "
                + stationDeparture + " и следует до станции " + stationArrival + ". Цена поездки - " + costTravel +
                " рублей, в поезде " + countTrainCar + " вагонов. Время в пути - " + timeTravel + ". Приятного путешествия!";
    }
}
