package presenter;

import view.DadosMediosView;

public class DadosMediosPresenter {

    private static DadosMediosPresenter instance = null;

    private final DadosMediosView view;

   private DadosMediosPresenter() {
        this.view = new DadosMediosView();
        view.setSize(350, 300);
        view.setLocation(370, 10);
        view.setVisible(true);
    }

    public static DadosMediosPresenter getInstance() {
        if (instance == null) {
            instance = new DadosMediosPresenter();
        }
        return instance;
    }

    public DadosMediosView getView() {
        return view;
    }

}
