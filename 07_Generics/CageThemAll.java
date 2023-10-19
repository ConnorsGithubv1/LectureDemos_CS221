public class CageThemAll {
    public static void main(String[] args) {

        // CageForCanary canaryCage = new CageForCanary(new Canary());
        // System.out.println("Who's in the canary cage: " + canaryCage);
        // canaryCage.examineCage().sing();

        // CageForHawk hawkCage = new CageForHawk(new Hawk());
        // System.out.println("Who's in the hawk cage: " + hawkCage);
        // hawkCage.examineCage().hunt();

        // Cage canaryCage = new Cage(new Canary());
        // System.out.println("Who's in the canary cage: " + canaryCage);
        // ((Canary)canaryCage.examineCage()).sing();

        // System.out.println();

        // Cage hawkCage = new Cage(new Hawk());
        // System.out.println("Who's in the hawk cage: " + hawkCage);
        // ((Hawk)hawkCage.examineCage()).hunt();

        // System.out.println();

        // Cage ratCage = new Cage(new Rat());
        // System.out.println("Who's in the rat cage: " + ratCage);
        // ((Rat)ratCage.examineCage()).explore();

        // System.out.println();

        // Cage dungeonCell = new Cage(new Adventurer());
        // System.out.println("Who's in the dungeon cell: " + dungeonCell);
        // ((Adventurer)dungeonCell.examineCage()).goalInLife();

        // hawkCage.swapInCage(canaryCage.examineCage());
        // dungeonCell.swapInCage(ratCage.examineCage());
        // ratCage.swapInCage("Hello World!");
        // System.out.println(ratCage);

        Cage<Canary> canaryCage = new Cage<Canary>(new Canary());
        System.out.println("Who's in the canary cage: " + canaryCage);
        canaryCage.examineCage().sing();

        System.out.println();

        Cage<Hawk> hawkCage = new Cage<Hawk>(new Hawk());
        System.out.println("Who's in the hawk cage: " + hawkCage);
        hawkCage.examineCage().hunt();

        System.out.println();

        Cage<Rat> ratCage = new Cage<Rat>(new Rat());
        System.out.println("Who's in the rat cage: " + ratCage);
        ratCage.examineCage().explore();

        System.out.println();

        Cage<Adventurer> dungeonCell = new Cage<Adventurer>(new Adventurer());
        System.out.println("Who's in the dungeon cell: " + dungeonCell);
        dungeonCell.examineCage().goalInLife();

        // hawkCage.swapInCage(canaryCage.examineCage());
        // dungeonCell.swapInCage(ratCage.examineCage());
        // ratCage.swapInCage("Hello World!");
        // System.out.println(ratCage);
        
    }
}
