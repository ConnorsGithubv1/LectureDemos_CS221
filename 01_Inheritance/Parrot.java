public class Parrot extends Bird {

    public Parrot() {
        super(4, 25);
    }
    
    public void speak() {
        System.out.println("Polly want a cracker!");
    }

    public String toString() {
        return "I am a parrot" + super.toString();
    }
}
