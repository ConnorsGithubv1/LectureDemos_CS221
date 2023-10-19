public class ElmerFudd implements Observer, DisplayAttitude {

    private final String DEFAULT_ATTITUDE;
    private String attitude;

    public ElmerFudd(Subject fishAndGame) {
        fishAndGame.registerObserver(this);
        attitude = DEFAULT_ATTITUDE = "I am wewaxing in my chaiw by the fiwe. Heh eh eh eh eh.";
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
                attitude = "Be wewy, wewy quiet. I'm hunting ducks. Heh eh eh eh eh.";
                break;
            case RABBIT:
                attitude = "Be wewy, wewy quiet. I'm hunting wabbits. Heh eh eh eh.";
                break;
            case NONE:
                attitude = DEFAULT_ATTITUDE;
                break;
        }
    }

    public String toString() {
        return "My name is Elmew Fudd.";
    }
    
}
