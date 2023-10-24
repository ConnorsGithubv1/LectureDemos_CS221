public class DaffyDuck implements Observer, DisplayAttitude {

    private final String DEFAULT_ATTITUDE;
    private String attitude;
    private Subject fishAndGame;

    public DaffyDuck(Subject fishAndGame) {
        this.fishAndGame = fishAndGame;
        fishAndGame.registerObserver(this);
        attitude = DEFAULT_ATTITUDE = "Hmmmm.... I wonder why the lake is so quiet.";
    }

    public void getMeOuttaHere() {
        fishAndGame.removeObserver(this);
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
                attitude = "You're despicable! It is really \"Rabbit Season\".";
                break;
            case RABBIT:
                attitude = "Not very sporting for Bugs but at least it's not \"Duck Season\".";
                break;
            case NONE:
                attitude = DEFAULT_ATTITUDE;
                break;
        }
    }

    public String toString() {
        return "My name is Daffy Duck.";
    }
    
}
