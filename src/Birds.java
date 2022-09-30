public class Birds extends Animals {

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

    public Birds(String name, int numberOfYears, String livingEnvironment) {
        super(name, numberOfYears);
        setLivingEnvironment(livingEnvironment);
    }
}
