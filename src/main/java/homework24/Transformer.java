package homework24;

public abstract class Transformer {

    protected String name;
    protected String teamName;
    protected String eyeColor;
    protected boolean kindness;

    // Конструктор с 4 параметрами — под него сейчас пишутся super(...) в Autobot/Decepticon
    public Transformer(String name, String teamName, String eyeColor, boolean kindness) {
        this.name = name;
        this.teamName = teamName;
        this.eyeColor = eyeColor;
        this.kindness = kindness;
    }

    // Показать свойства трансформера
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }

    // Абстрактный метод по заданию
    public abstract void transform();
}