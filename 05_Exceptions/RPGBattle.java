import java.util.Random;

public class RPGBattle {
    public static void main(String[] args) {
        int vargusHitPoints = 37;
        System.out.println("Your character is getting attacked!");
        try {
            vargusHitPoints = remainingHitPoints(vargusHitPoints);
        } catch (ExceedsHitPoints exception) {
            System.out.println(exception.getMessage());
            vargusHitPoints = 0;
        }
        
        System.out.println("Your character has " + vargusHitPoints + " hp left.");
    }

    private static int remainingHitPoints(int currentHitPoints) {
        Random gen = new Random();
        int damage = gen.nextInt(100) + 1;
        if (damage >= currentHitPoints) {
            throw new ExceedsHitPoints("Your character is dead!");
        }
        return currentHitPoints - damage;
    }
    
}
