package model;

import java.time.LocalDateTime;
import java.util.Date;

public class DadosClima {

    private Date data;
    private double temperatura;
    private double umidade;
    private double pressao;

    public DadosClima(Date data, double temperatura, double umidade, double pressao) {
        this.data = data;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public DadosClima(double temperatura, double umidade, double pressao) {

        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public DadosClima() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    @Override
    public String toString() {
        String dados = "Dados do clima: \n "
                + "Data:" + data + "\n"
                + "Temperatura:" + temperatura + ""
                + "Umidade:" + umidade + "\n"
                + "Pressão:" + pressao;
        return dados;
    }

}
