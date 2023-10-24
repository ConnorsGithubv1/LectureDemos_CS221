// import java.util.Random;

public class ForTheBirds {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Goose goose = new Goose();
        RubberDuck rubberDuck = new RubberDuck();
        HummingBird hummingBird = new HummingBird();
        // Bird bird = new Bird();
        // WaterFowl waterFowl = new WaterFowl(1.0, 1.0);
        // Random gen = new Random();

        System.out.println(hawk);
        hawk.eat();
        hawk.fly();
        hawk.speak();
        hawk.hunt();


        // System.out.println("\n" + bird);
        // bird.eat();
        // bird.fly();
        // bird.speak();

        // System.out.println("\n" + waterFowl);
        // waterFowl.eat();
        // waterFowl.fly();
        // waterFowl.speak();
        // waterFowl.swim();

        System.out.println("\n" + duck);
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();

        System.out.println("\n" + parrot);
        parrot.eat();
        parrot.fly();
        parrot.speak();

        System.out.println("\n" + goose);
        goose.eat();
        goose.fly();
        goose.speak();
        goose.swim();

        System.out.println("\n" + rubberDuck);
        rubberDuck.eat();
        rubberDuck.fly();
        rubberDuck.speak();
        rubberDuck.swim();
        rubberDuck.play();

        // System.out.println("\n" + gen.toString());

        System.out.println("\n" + hummingBird);
        hummingBird.eat();
        hummingBird.fly();
        hummingBird.speak();

    }
}
