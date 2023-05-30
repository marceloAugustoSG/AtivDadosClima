package Collections;

import java.util.ArrayList;
import model.DadosClima;

public class DadosTempoCollection {

    private static DadosTempoCollection instance = null;
    private final ArrayList<DadosClima> dadosClimaCollection;

    private DadosTempoCollection() {
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

    public DadosClima getLast() {

        return dadosClimaCollection.get(dadosClimaCollection.size() - 1);

    }

    public boolean isEmpty() {

        return dadosClimaCollection.isEmpty();
    }

    public ArrayList<DadosClima> getDadosClimaCollection() {
        return dadosClimaCollection;
    }

}
