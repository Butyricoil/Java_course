package interfaces;

public class Dog extends Animal implements AbleaToRun {

    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }

    public void run() {
        System.out.println("собака бежит!");
    }
}
