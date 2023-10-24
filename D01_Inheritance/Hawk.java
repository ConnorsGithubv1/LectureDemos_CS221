public class Hawk extends Bird {

    public Hawk() {
        super(4, 120);
    }

    public void speak() {
        System.out.println("Screech!");
    }

    public void hunt() {
        System.out.println("I hunt other birds!");
    }
    public String toString() {
        return "I am a hawk" + super.toString();
    }

    public void eat() {
        System.out.println("I eat meat!");
    }

}