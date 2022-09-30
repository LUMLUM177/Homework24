public abstract class Transport {

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    String color;
    int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && color.isEmpty() && color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 50;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand != null && brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model != null && model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry != null && productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color != null && color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            setMaxSpeed(50);
        } else {
            setMaxSpeed(maxSpeed);
        }
    }
    public abstract void refill();
}


