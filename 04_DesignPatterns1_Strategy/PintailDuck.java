public class PintailDuck extends Duck {

    public PintailDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like a pintail duck.");;
    }
    
}
