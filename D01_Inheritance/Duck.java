public class Duck extends WaterFowl {

    public Duck() {
        super(3, 50);
    }

    public void speak() {
        System.out.println("Quack!");
    }

    public String toString() {
        return "I am a duck" + super.toString();
    }
}