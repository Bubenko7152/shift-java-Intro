package homework24;

public class Autobot extends Transformer {
    private String teamName = "Autobots";
    private String eyeColor = "blue";
    private boolean kindness = true; // по умолчанию добрые

    public Autobot(String name) {
        super(name);
    }

    // Конструктор, где kindness можно переопределить
    public Autobot(String name, boolean kindness) {
        super(name);
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(name + " transforms into a ground transport (car, truck, etc.)");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }
}
