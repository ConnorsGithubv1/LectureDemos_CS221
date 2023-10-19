public class DuckSim {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[6];

        ducks[0] = new MallardDuck();
        ducks[1] = new RedheadDuck();
        ducks[2] = new CanvasbackDuck();
        ducks[3] = new RubberDuck();
        ducks[4] = new DecoyDuck();
        ducks[5] = new PintailDuck();

        for (Duck duck : ducks) {
            System.out.println();
            duck.performQuack();
            duck.swim();
            duck.performFly();
            duck.display();
        }
        System.out.println("\n\nGag and ground the mallard!");
        ducks[0].setQuackBehavior(new Mute());
        ducks[0].setFlyBehavior(new FlyNoWay());
        System.out.println("Strap the rubber duck to a rocket!");
        ducks[3].setFlyBehavior(new RocketEngine());

        for (Duck duck : ducks) {
            System.out.println();
            duck.performQuack();
            duck.swim();
            duck.performFly();
            duck.display();
        }
    }
}
