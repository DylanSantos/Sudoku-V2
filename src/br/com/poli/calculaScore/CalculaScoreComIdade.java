/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poli.calculaScore;

import br.com.poli.interfaces.CalculaScore;
import br.com.poli.principal.Partida;

public class CalculaScoreComIdade implements CalculaScore{

    @Override
    public void calcula(Partida partida) {
        partida.getQuantidadeErros();
        partida.getQuantidadeMaximaErrosDificuldade(); //A quantidade maxima de erros define a Dificuldade da Partida
        partida.getTempoFinal();
        partida.getTempoInicial();
        //pessoa.idade();

        
    }
    
}
