public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay(), new Mute());
    }

    @Override
    public void display() {
        System.out.println("Looks like a decoy duck.");;
    }
    
    public void swim() {
        System.out.println("Float and bob on the water.");
    }

}
