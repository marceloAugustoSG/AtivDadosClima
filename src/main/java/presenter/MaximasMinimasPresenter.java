package presenter;

import view.MaximasMinimasView;

public class MaximasMinimasPresenter {

    private static MaximasMinimasPresenter instance = null;

    private MaximasMinimasView view;

    private MaximasMinimasPresenter() {
        view = new MaximasMinimasView();
        view.setSize(480, 300);
        view.setLocation(880, 330);
        view.setVisible(true);

    }

    public static MaximasMinimasPresenter getInstance() {

        if (instance == null) {

            instance = new MaximasMinimasPresenter();

        }
        return instance;
    }

    public MaximasMinimasView getView() {
        return view;
    }

}
