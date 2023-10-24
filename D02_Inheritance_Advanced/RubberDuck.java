public class RubberDuck extends Duck {
    
    public void fly() { }

    public void eat() { }

    public void swim() {
        System.out.println("Float and bob on the water.");
    }

    public void speak() {
        System.out.println("Squeak!");
    }

    public void play() {
        System.out.println("I am a toy!");
    }

    public String toString() {
        return "Rubber Duck... all you need to know.";
    }
}
