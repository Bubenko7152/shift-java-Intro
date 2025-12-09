package homework24;

public class Autobot extends Transformer implements Action {

    // Конструктор с предустановленными значениями
    public Autobot(String name) {
        super(name, "Autobots", "blue", true);
    }

    // Конструктор, если нужно задать kindness самому
    public Autobot(String name, boolean kindness) {
        super(name, "Autobots", "blue", kindness);
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
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a ground transport (car, truck, etc.)");
    }
}