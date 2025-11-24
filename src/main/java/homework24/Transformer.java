package homework24;

public class Transformer {
    protected String name; // имя трансформера

    public Transformer(String name) {
        this.name = name;
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

    public void showInfo() {
        System.out.println("Name: " + name);
    }
}