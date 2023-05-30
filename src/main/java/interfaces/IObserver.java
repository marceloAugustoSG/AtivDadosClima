/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.DadosClima;

/**
 *
 * @author Marcelo Augusto
 */
public interface IObserver {

    public void update(List<DadosClima> dados);

}
