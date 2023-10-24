public class HummingBird extends Bird {
    public HummingBird() {
        super(0.33, 75.0);
    }

    public String toString() {
        return "I am a hummingbird" + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("I eat nectar!");;
    }

    @Override
    public void speak() {
        System.out.println("Chirp chirp chirp");
    }
}
