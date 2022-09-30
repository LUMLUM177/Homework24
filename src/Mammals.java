public class Mammals extends Animals {

    private String livingEnvironment;
    private int speedMovement;

    public void walk() {
        System.out.println(getName() + " гуляет.");
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

    public int getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(int speedMovement) {
        if (speedMovement <= 0) {
            this.speedMovement = 0;
        } else {
            this.speedMovement = speedMovement;
        }
    }

    public Mammals(String name, int numberOfYears, String livingEnvironment, int speedMovement) {
        super(name, numberOfYears);
        setLivingEnvironment(livingEnvironment);
        setSpeedMovement(speedMovement);
    }
}
