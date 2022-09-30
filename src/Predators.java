import java.util.Objects;

public class Predators extends Mammals {

    private String typeFood;

    public void hunt() {
        System.out.println(getName() + " охотится.");
    }

    public void eat() {
        System.out.println(getName() + " кушает.");
    }

    public void go() {
        System.out.println(getName() + " перемещается.");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && typeFood.isEmpty() && typeFood.isBlank()) {
            this.typeFood = "Неизвестный тип пищи";
        } else {
            this.typeFood = typeFood;
        }
    }

    public Predators(String name, int numberOfYears, String livingEnvironment, int speedMovement, String typeFood) {
        super(name, numberOfYears, livingEnvironment, speedMovement);
        setTypeFood(typeFood);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return typeFood.equals(predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }

    @Override
    public String toString() {
        return "Информация о животном: " + getName() + ", возраст " + getNumberOfYears() + " лет, среда " +
                "проживания " + getLivingEnvironment() + ", развивает скорость до " + getSpeedMovement() +
                " км/ч, тип пищи - " + getTypeFood() + ". Принадлежит " + "классу " + getClass().getName() + ".";
    }
}
