package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.RegistrosView;

public class RegistrosPresenter {

    private static RegistrosPresenter instance = null;

    private RegistrosView view;

    private RegistrosPresenter() {

        view = new RegistrosView();

        view.setSize(500, 300);
        view.setLocation(370, 330);
        view.setVisible(true);

        view.getBtnRemover().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(view, "Remover");

            }
        });

    }

    public static RegistrosPresenter getInstance() {
        if (instance == null) {
            instance = new RegistrosPresenter();

        }
        return instance;
    }

    public RegistrosView getView() {

        return view;
    }

}
