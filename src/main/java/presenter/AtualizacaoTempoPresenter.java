package presenter;

import Collections.DadosTempoCollection;
import interfaces.IObserver;
import java.util.List;
import model.DadosClima;
import view.AtualizacaoTempoView;

public class AtualizacaoTempoPresenter implements IObserver {

    private static AtualizacaoTempoPresenter instance = null;
    private final DadosTempoCollection dados;

    private AtualizacaoTempoView view;

    private AtualizacaoTempoPresenter(DadosTempoCollection dados) {
        this.dados = dados;
        view = new AtualizacaoTempoView();
        view.setSize(350, 300);
        view.setLocation(10, 330);

        view.setVisible(true);
    }

    public static AtualizacaoTempoPresenter getInstance(DadosTempoCollection dados) {
        if (instance == null) {

            instance = new AtualizacaoTempoPresenter(dados);

        }
        return instance;
    }

    private void resetWindow() {

        view.getTxtDataAtualizacao().setText("DD/MM/AAAA");
        view.getTxtTemperatura().setText("TEMPERATURA");
        view.getTxtUmidade().setText("HUMIDADE");
        view.getTxtPressao().setText("PRESSÃO");

    }

    public AtualizacaoTempoView getView() {
        return view;
    }

    @Override
    public void update(List<DadosClima> dados) {
        if (dados.isEmpty()) {
            resetWindow();
        } else {
            DadosClima ultimo = dados.get(dados.size() - 1);

//            view.getLbDate().setText(DateUtil.dateToString(last.getRegistrationDate().getDate()));
            view.getTxtTemperatura().setText(ultimo.getTemperatura() + "º C");
            view.getTxtUmidade().setText(ultimo.getUmidade() + "%");
            view.getTxtPressao().setText(ultimo.getPressao() + " mb");
        }
    }

}
