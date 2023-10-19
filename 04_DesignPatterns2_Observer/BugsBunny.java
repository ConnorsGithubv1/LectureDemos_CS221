public class BugsBunny implements Observer, DisplayAttitude{

    private final String DEFAULT_ATTITUDE;
    private String attitude;

    public BugsBunny(Subject fishAndGame) {
        fishAndGame.registerObserver(this);
        attitude = DEFAULT_ATTITUDE = "Ehhh... what's up, doc?";
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println(attitude);
    }

    @Override
    public void update(HuntingSeason season) {
        switch (season) {
            case DUCK:
                attitude = "Guess my signs worked. Ain't I a stinker.";
                break;
            case RABBIT:
                attitude = "I better get those \"Duck Season\" signs up.";
                break;
            case NONE:
                attitude = DEFAULT_ATTITUDE;
                break;
        }
    }

    public String toString() {
        return "My name is Bugs Bunny";
    }
    
}
