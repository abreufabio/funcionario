package controller;

import model.carro;

public class ControllerCarro {

    public String RegistrarOperacaoCarro(String patrimonio, String Chassi, String Placa, String Cor, String Marca, String Modelo,
            int ano, String Motor, String Destinacao, String Combustivel, int NumeroPortas, boolean Blindagem, String Objetivo,String responsavel,
            String DataInicio, String DataFim, String HoraInicio, String HoraFim, int capacidade,String Ocorrencia) {

        String msg = "";

        carro carro = new carro();
        carro.setNrPatrimonio(patrimonio);
        carro.setAno(ano);
        carro.setBlindagem(false);
        carro.setChassi(Chassi);
        carro.setCombustivel(Combustivel);
        carro.setCor(Cor);
        carro.setDestinacao(Destinacao);
        carro.setMarca(Marca);
        carro.setMotor(Motor);
        carro.setPlaca(Placa);
        carro.setNrPortas(NumeroPortas);
        carro.setCapacidade(capacidade);
        carro.setModelo(Modelo);
        
        
        msg = carro.imprimirVeiculo();
        
        msg += carro.regiOp(responsavel, Objetivo, DataInicio, DataFim, HoraInicio, HoraFim, Ocorrencia);

        return msg;
    }

}
