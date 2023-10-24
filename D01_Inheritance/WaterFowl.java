public class WaterFowl extends Bird {
    public WaterFowl(double wingSpan, double flyingSpeed) {
        super(wingSpan, flyingSpeed);
    }
    
    public void swim() {
        System.out.println("I am swimming!");
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }

    public void eat() {
        System.out.println("I eat bugs and aquatic plants.");
    }
    
}
