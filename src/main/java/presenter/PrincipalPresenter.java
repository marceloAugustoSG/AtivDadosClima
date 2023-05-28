package presenter;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import view.PrincipalView;

public class PrincipalPresenter {

    private PrincipalView view;
    private DadosTempoPresenter dadosTempo;
    private DadosMediosPresenter dadosMedios;
    private AtualizacaoTempoPresenter atualizacaoTempo;
    private RegistrosPresenter registrosPresenter;
    private MaximasMinimasPresenter maximasMinimasPresenter;

    private ArrayList<JInternalFrame> janelasInternas;

    public PrincipalPresenter() {
        view = new PrincipalView();
        janelasInternas = new ArrayList<>();

        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        addInternalFrame();
        view.setVisible(true);
    }

    private void addInternalFrame() {
        dadosTempo = DadosTempoPresenter.getInstance();
        dadosMedios = DadosMediosPresenter.getInstance();
        atualizacaoTempo = AtualizacaoTempoPresenter.getInstance();
        registrosPresenter = RegistrosPresenter.getInstance();
        maximasMinimasPresenter = MaximasMinimasPresenter.getInstance();;

        janelasInternas.add(dadosTempo.getView());
        janelasInternas.add(dadosMedios.getView());
        janelasInternas.add(atualizacaoTempo.getView());
        janelasInternas.add(registrosPresenter.getView());
        janelasInternas.add(maximasMinimasPresenter.getView());

        janelasInternas.forEach(janela -> {
            view.add(janela);
            janela.setVisible(true);

        });

    }

}