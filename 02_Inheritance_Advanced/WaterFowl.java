public abstract class WaterFowl extends Bird {
    protected WaterFowl(double wingSpan, double flyingSpeed) {
        super(wingSpan, flyingSpeed);
    }

    public void eat() {
        System.out.println("I eat bugs and aquatic plants.");
    }
    
    public void swim() {
        System.out.println("I am swimming!");
    }

}
