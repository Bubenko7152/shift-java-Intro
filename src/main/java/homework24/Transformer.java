package homework24;

public abstract class Transformer {

    protected String name;
    protected String teamName;
    protected String eyeColor;
    protected boolean kindness;

    public Transformer(String name, String teamName, String eyeColor, boolean kindness) {
        this.name = name;
        this.teamName = teamName;
        this.eyeColor = eyeColor;
        this.kindness = kindness;
    }

    public void showInfo() {
        System.out.println("=== Info ===");
        System.out.println("Name: " + name);
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void fire() {
        System.out.println(name + " is firing");
    }

    public void charge() {
        System.out.println(name + " is charging");
    }

    public abstract void transform();
}