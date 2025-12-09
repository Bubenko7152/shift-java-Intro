package homework24;

public class Decepticon extends Transformer {

    private static final String TEAM_NAME = "Decepticons";
    private static final String EYE_COLOR = "red";

    public Decepticon(String name) {
        super(name, TEAM_NAME, EYE_COLOR, false);
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a powerful weapon or air transport");
    }
}