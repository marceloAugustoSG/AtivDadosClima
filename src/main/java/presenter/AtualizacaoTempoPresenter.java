package presenter;

import Collections.DadosTempoCollection;
import model.DadosClima;
import view.AtualizacaoTempoView;

public class AtualizacaoTempoPresenter {

    private static AtualizacaoTempoPresenter instance = null;
    private final DadosTempoCollection dados;

    private AtualizacaoTempoView view;

    private AtualizacaoTempoPresenter(DadosTempoCollection dados) {
        this.dados = dados;
        view = new AtualizacaoTempoView();
        view.setSize(350, 300);
        view.setLocation(10, 330);
        carregarJanela();
        view.setVisible(true);
    }

    public static AtualizacaoTempoPresenter getInstance(DadosTempoCollection dados) {
        if (instance == null) {

            instance = new AtualizacaoTempoPresenter(dados);

        }
        return instance;
    }

    private void carregarJanela() {

        if (dados.isEmpty()) {
            view.getTxtTemperatura().setText("TEMPERATURA");
            view.getTxtUmidade().setText("UMIDADE");
            view.getTxtPressao().setText("PRESSÃO");
            view.getTxtDataAtualizacao().setText("DD/MM/AAAA");

        } else {

            DadosClima ultimoDado = dados.getLast();
            String temperatura = String.valueOf(ultimoDado.getTemperatura());
            String umidade = String.valueOf(ultimoDado.getUmidade());
            String pressao = String.valueOf(ultimoDado.getPressao());

            view.getTxtTemperatura().setText(temperatura);
            view.getTxtUmidade().setText(umidade);
            view.getTxtPressao().setText(pressao);
        }
    }

    public AtualizacaoTempoView getView() {
        return view;
    }

}
