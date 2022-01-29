package controller;

import model.onibus;

public class ControllerOnibus {

    public String RegistrarOperacaoOnibus(String patrimonio, String Chassi, String Placa, String Cor, String Marca, String Modelo,
            int ano, String Motor, String Destinacao, String Combustivel, String Tipo, boolean Blindagem, String Objetivo,
            String DataInicio, String DataFim, String HoraInicio, String HoraFim, int capacidade,String Ocorrencia) {

        String msg = "";

        onibus onibus = new onibus();
        onibus.setNrPatrimonio(patrimonio);
        onibus.setAno(ano);
        onibus.setBlindagem(false);
        onibus.setChassi(Chassi);
        onibus.setCombustivel(Combustivel);
        onibus.setCor(Cor);
        onibus.setDestinacao(Destinacao);
        onibus.setMarca(Marca);
        onibus.setMotor(Motor);
        onibus.setPlaca(Placa);
        onibus.setTipo(Tipo);
        onibus.setModelo(Modelo);
        onibus.setCapacidade(capacidade);
        
        
        msg = onibus.imprimirVeiculo();
        
        msg += onibus.regiOp(Destinacao, Objetivo, DataInicio, DataFim, HoraInicio, HoraFim, Ocorrencia);

        return msg;
    }

}
