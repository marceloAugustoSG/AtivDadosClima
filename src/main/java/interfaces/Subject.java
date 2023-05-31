package interfaces;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<IObserver> observers;

    public final void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public final void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    protected abstract void notifyObservers();

}
