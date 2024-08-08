package main.java.ru.clevertec;

public class Car implements Movable {
    Engine engine;

    @Override
    public void move() {
        System.out.println("Moving Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }
}