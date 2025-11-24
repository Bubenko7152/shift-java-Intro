package homework24;

public class Decepticon extends Transformer {
    private String teamName = "Decepticons";
    private String eyeColor = "red";
    private boolean kindness = false; // по умолчанию злые

    public Decepticon(String name) {
        super(name);
    }

    public Decepticon(String name, boolean kindness) {
        super(name);
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(name + " transforms into a powerful weapon or air transport");
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