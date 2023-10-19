// import java.util.Random;

public class ForTheBirds {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        // Goose goose = new Goose();
        HummingBird hummingBird = new HummingBird();

        // RubberDuck rubberDuck = new RubberDuck();
        // System.out.println("\n" + rubberDuck);
        // rubberDuck.eat();
        // rubberDuck.speak();
        // rubberDuck.fly();
        // rubberDuck.swim();
        // rubberDuck.play();
        // Duck duck = new RubberDuck();
        // System.out.println("\nNow I'm a duck...\n" + duck);
        // duck.eat();
        // duck.speak();
        // duck.fly();
        // duck.swim();
        // // duck.play();
        // WaterFowl fowl = new RubberDuck();
        // System.out.println("\nNow I'm a water fowl...\n" + fowl);
        // fowl.eat();
        // fowl.speak();
        // fowl.fly();
        // fowl.swim();
        // // fowl.play();
        // Bird bird = new RubberDuck();
        // System.out.println("\nNow I'm a bird...\n" + bird);
        // bird.eat();
        // bird.speak();
        // bird.fly();
        // // bird.swim();
        // // bird.play();
        // Object obj = new RubberDuck();
        // System.out.println("\nNow I'm an object...\n" + obj);
        // // obj.eat();
        // // obj.speak();
        // // obj.fly();
        // // bird.swim();
        // // bird.play();

        Bird bird;
        bird = new RubberDuck();
        bird.speak();
        bird = null;
        bird = new Hawk();
        bird.speak();

        // Bird[] menagerie = new Bird[4];
        // menagerie[0] = hawk;
        // menagerie[1] = duck;
        // menagerie[2] = hummingBird;
        // menagerie[3] = parrot;
        // for (Bird bird : menagerie) {
        //     System.out.println(bird);
        //     bird.eat();
        //     bird.fly();
        //     bird.speak();
        //     if (bird instanceof Hawk) {
        //         ((Hawk)bird).hunt();
        //     }
        //     System.out.println();
        // }

    }
}
