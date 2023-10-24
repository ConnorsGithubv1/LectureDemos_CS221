public class HummingBird extends Bird {
    public HummingBird() {
        super(0.33, 75.0);
    }

    public String toString() {
        return "I am a hummingbird" + super.toString();
    }


    public void eat() {
        System.out.println("I eat nectar!");;
    }


    public void speak() {
        System.out.println("Chirp chirp chirp");
    }
}
