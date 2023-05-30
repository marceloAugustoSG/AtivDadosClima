package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import view.RegistrosView;

public class RegistrosPresenter {

    private static RegistrosPresenter instance = null;

    private RegistrosView view;

    private DefaultTableModel tblRegistros;

    private RegistrosPresenter() {

        view = new RegistrosView();

        view.setSize(500, 300);
        view.setLocation(370, 330);
        carregarTabela();
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

    private void carregarTabela() {
        tblRegistros = new DefaultTableModel(
                new Object[][][][]{},
                new String[]{"Data", "Temperatura", "Humidade", "Pressão"}
        );

        view.getTblRegistros().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblRegistros.setNumRows(0);
        view.getTblRegistros().setModel(tblRegistros);
    }
}
