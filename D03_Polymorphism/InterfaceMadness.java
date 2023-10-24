public class InterfaceMadness {
    public static void main(String[] args) {
        Speaker speaker;
        Flyer flyer;
        Duck duck = new Duck();

        speaker = new Teacher();
        System.out.println(speaker);
        speaker.speak();

        System.out.println();

        speaker = duck;
        System.out.println(speaker);
        speaker.speak();

        System.out.println();

        flyer = new Airplane();
        System.out.println(flyer);
        flyer.fly();

        System.out.println();
        flyer = duck;
        System.out.println(flyer);
        flyer.fly();


    }
}
