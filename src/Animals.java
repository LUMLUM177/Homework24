public abstract class Animals {

    private String name;
    private int numberOfYears;

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println(getName() + " спит.");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setName(String name) {
        if (name != null && name.isEmpty() && name.isBlank()) {
            this.name = "Животное";
        } else {
            this.name = name;
        }
    }

    public Animals(String name, int numberOfYears) {
        setName(name);
        if (numberOfYears <= 0) {
            this.numberOfYears = 0;
        } else {
            this.numberOfYears = numberOfYears;
        }
    }


}
