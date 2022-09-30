import java.util.Objects;

public class Flying extends Birds {

    private String typeMovement;

    public void flying() {
        System.out.println(getName() + " летает.");
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

    public Flying(String name, int numberOfYears, String livingEnvironment, String typeMovement) {
        super(name, numberOfYears, livingEnvironment);
        setTypeMovement(typeMovement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return typeMovement.equals(flying.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMovement);
    }

    @Override
    public String toString() {
        return "Информация о животном: " + getName() + ", возраст " + getNumberOfYears() + " лет, среда " +
                "проживания " + getLivingEnvironment() + ", тип передвижения - " + getTypeMovement() + ". Принадлежит " +
                "классу " + getClass().getName() + ".";
    }
}
