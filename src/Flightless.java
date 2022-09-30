import java.util.Objects;

public class Flightless extends Birds {

    private String typeMovement;

    public void walk() {
        System.out.println(getName() + " гуляет.");
    }

    public void eat() {
        System.out.println(getName() + " кушает.");
    }

    public void go() {
        System.out.println(getName() + " перемещается.");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && typeMovement.isEmpty() && typeMovement.isBlank()) {
            this.typeMovement = "Неизвестный тип пищи";
        } else {
            this.typeMovement = typeMovement;
        }
    }

    public Flightless(String name, int numberOfYears, String livingEnvironment, String typeMovement) {
        super(name, numberOfYears, livingEnvironment);
        setTypeMovement(typeMovement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMovement);
    }

    public String toString() {
        return "Информация о животном: " + getName() + ", возраст " + getNumberOfYears() + " лет, среда " +
                "проживания " + getLivingEnvironment() + ", тип передвижения - " + getTypeMovement() + ". Принадлежит " +
                "классу " + getClass().getName() + ".";
    }
}
