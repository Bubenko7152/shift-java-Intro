package homework24;

public class Decepticon extends Transformer implements Action {

    // По умолчанию: красные глаза, злой
    public Decepticon(String name) {
        super(name, "Decepticons", "red", false);
    }

    public Decepticon(String name, boolean kindness) {
        super(name, "Decepticons", "red", kindness);
    }

    @Override
    public void fire() {
        System.out.println(name + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging");
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a powerful weapon or air transport");
    }
}