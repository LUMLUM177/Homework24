public class Amphibians extends Animals {

    private String livingEnvironment;

    public void hunt() {
        System.out.println(getName() + " охотится.");
    }

    public void eat() {
        System.out.println(getName() + " кушает.");
    }

    public void go() {
        System.out.println(getName() + " перемещается.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "Неизвестная среда проживания";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public Amphibians(String name, int numberOfYears, String livingEnvironment) {
        super(name, numberOfYears);
        setLivingEnvironment(livingEnvironment);
    }

    @Override
    public String toString() {
        return "Информация о животном: " + getName() + ", возраст " + getNumberOfYears() + " лет, среда " +
                "проживания " + getLivingEnvironment() + ". Принадлежит " + "классу " + getClass().getName() + ".";
    }
}
