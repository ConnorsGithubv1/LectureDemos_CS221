public class Airplane implements Flyer {

    @Override
    public void fly() {
        System.out.println("I'm flying on jet fuel!");;
    }

    public String toString() {
        return "I am an airplane. Whoosh!";
    }
    
}
