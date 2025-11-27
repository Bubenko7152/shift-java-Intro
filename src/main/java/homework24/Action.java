package homework24;

public interface Action {

    // метод по умолчанию
    default void run() {
        System.out.println("Transformer is running");
    }

    void fire();

    void charge();
}