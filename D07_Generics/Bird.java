public abstract class Bird implements Animal {

    public Bird(int i, int j) {
    }

    public Bird(double wingSpan, double flyingSpeed) {
    }

    public abstract void speak();

    public abstract void eat();

    public void fly() {
        System.out.println("I am flying...");
    }
}