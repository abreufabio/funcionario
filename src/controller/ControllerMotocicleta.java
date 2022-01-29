package controller;

import model.motocicleta;

public class ControllerMotocicleta {

    public String RegistrarOperacaoMotocicleta(String patrimonio, String Chassi, String Placa, String Cor, String Marca, String Modelo,
            int ano, String Motor, String Destinacao, String Combustivel, boolean Blindagem, String Objetivo,
            String DataInicio, String DataFim, String HoraInicio, String HoraFim,String Ocorrencia) {

        String msg = "";

        motocicleta motocicleta = new motocicleta();
        motocicleta.setNrPatrimonio(patrimonio);
        motocicleta.setAno(ano);
        motocicleta.setChassi(Chassi);
        motocicleta.setCombustivel(Combustivel);
        motocicleta.setCor(Cor);
        motocicleta.setDestinacao(Destinacao);
        motocicleta.setMarca(Marca);
        motocicleta.setMotor(Motor);
        motocicleta.setPlaca(Placa);
        motocicleta.setModelo(Modelo);
        
        
        msg = motocicleta.imprimirVeiculo();
        
        msg += motocicleta.regiOp(Destinacao, Objetivo, DataInicio, DataFim, HoraInicio, HoraFim, Ocorrencia);

        return msg;
    }

}
