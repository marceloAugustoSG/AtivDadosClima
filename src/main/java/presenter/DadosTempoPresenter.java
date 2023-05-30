package presenter;

import Collections.DadosTempoCollection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DadosClima;
import view.DadosTempoView;

public class DadosTempoPresenter {

    private static DadosTempoPresenter instance = null;
    private final DadosTempoView view;
    private final DadosTempoCollection dados;

    private DadosTempoPresenter(DadosTempoCollection dados) {

        view = new DadosTempoView();
        view.setSize(350, 300);
        view.setLocation(10, 10);
        this.dados = dados;
        view.setVisible(true);

        view.getBtnIncluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    incluir();
                } catch (ParseException ex) {
                    Logger.getLogger(DadosTempoPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(view, "Dados salvos com sucesso!");
                limparCampos();
            }
        });

        view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

    }

    public static DadosTempoPresenter getInstance(DadosTempoCollection dados) {
        if (instance == null) {
            instance = new DadosTempoPresenter(dados);
        }
        return instance;
    }

    private void incluir() throws ParseException {
        String data = view.getTxtDataCreate().getText();

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data.toString());
        Double temperatura = Double.parseDouble(view.getTxtTemperaturaCreate().getText());
        Double umidade = Double.parseDouble(view.getTxtUmidadeCreate().getText());
        Double pressao = Double.parseDouble(view.getTxtPressaoCreate().getText());
        DadosClima clima = new DadosClima(date, temperatura, umidade, pressao);
        dados.addDadoClima(clima);
        JOptionPane.showMessageDialog(view, clima.toString());
    }

    private void limparCampos() {
        view.getTxtDataCreate().setText("");
        view.getTxtPressaoCreate().setText("");
        view.getTxtTemperaturaCreate().setText("");
        view.getTxtUmidadeCreate().setText("");
    }

    public DadosTempoView getView() {
        return view;
    }

}
