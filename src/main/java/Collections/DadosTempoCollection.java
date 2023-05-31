package Collections;

import interfaces.IObserver;
import interfaces.Subject;
import java.util.ArrayList;
import java.util.Collections;
import model.DadosClima;

public class DadosTempoCollection extends Subject {

    private static DadosTempoCollection instance = null;
    private final ArrayList<DadosClima> dadosClimaCollection;

    private DadosTempoCollection() {
        observers = new ArrayList<>();
        dadosClimaCollection = new ArrayList<>();

    }

    public static DadosTempoCollection getInstance() {
        if (instance == null) {

            instance = new DadosTempoCollection();

        }
        return instance;
    }

    public void addDadoClima(DadosClima clima) {

        dadosClimaCollection.add(clima);

    }

    public void removerDadoClima(DadosClima clima) {

        dadosClimaCollection.remove(clima);

    }

    public boolean isEmpty() {

        return dadosClimaCollection.isEmpty();
    }

    public ArrayList<DadosClima> getDadosClimaCollection() {
        return dadosClimaCollection;
    }

    @Override

    protected void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(Collections.unmodifiableList(dadosClimaCollection));
        });
    }

    public ArrayList<IObserver> getObservers() {
        return observers;
    }

    public ArrayList<DadosClima> getClimaCollection() {
        return dadosClimaCollection;
    }

}
