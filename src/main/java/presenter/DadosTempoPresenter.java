package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.DadosTempoView;

public class DadosTempoPresenter {

    private static DadosTempoPresenter instance = null;
    private final DadosTempoView view;

  private  DadosTempoPresenter() {

        view = new DadosTempoView();
        view.setSize(350, 300);
        view.setLocation(10, 10);
        view.setVisible(true);

        view.getBtnIncluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(view, "incluir");
            }
        });
    }

    public static DadosTempoPresenter getInstance() {
        if (instance == null) {
            instance = new DadosTempoPresenter();
        }
        return instance;
    }

    public DadosTempoView getView() {
        return view;
    }

}
