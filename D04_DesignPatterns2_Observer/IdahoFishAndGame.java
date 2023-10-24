import java.util.ArrayList;

public class IdahoFishAndGame implements Subject {
    private ArrayList<Observer> observers;
    private HuntingSeason currentSeason;

    public IdahoFishAndGame() {
        this.observers = new ArrayList<Observer>();
        this.currentSeason = HuntingSeason.NONE;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentSeason);
        }
    }

    public void setHuntingSeason(HuntingSeason season) {
        if (this.currentSeason != season) {
            this.currentSeason = season;
            notifyObservers();
        }
    }
    
}
