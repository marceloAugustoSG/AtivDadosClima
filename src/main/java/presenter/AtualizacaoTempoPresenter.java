package presenter;

import view.AtualizacaoTempoView;

public class AtualizacaoTempoPresenter {

    private static AtualizacaoTempoPresenter instance = null;

    private AtualizacaoTempoView view;

    private AtualizacaoTempoPresenter() {
        view = new AtualizacaoTempoView();
        view.setSize(350, 300);
        view.setLocation(10, 330);

        view.setVisible(true);
    }

    public static AtualizacaoTempoPresenter getInstance() {
        if (instance == null) {

            instance = new AtualizacaoTempoPresenter();

        }
        return instance;
    }

    public AtualizacaoTempoView getView() {
        return view;
    }

}
