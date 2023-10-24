public class CanvasbackDuck extends Duck {

    public CanvasbackDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like a canvasback duck.");;
    }
    
}
