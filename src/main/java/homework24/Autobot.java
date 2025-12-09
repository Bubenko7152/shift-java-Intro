package homework24;

public class Autobot extends Transformer {

    private static final String TEAM_NAME = "Autobots";
    private static final String EYE_COLOR = "blue";

    public Autobot(String name) {
        super(name, TEAM_NAME, EYE_COLOR, true);
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a ground transport (car, truck, etc.)");
    }
}