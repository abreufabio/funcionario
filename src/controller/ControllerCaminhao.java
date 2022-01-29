package controller;

import model.caminhao;

public class ControllerCaminhao {

    public String RegistrarOperacaoCaminhao(String patrimonio, String Chassi, String Placa, String Cor, String Marca, String Modelo,
            int ano, String Motor, String Destinacao, String Combustivel, int NrEixos, boolean Blindagem, String Objetivo,
            String DataInicio, String DataFim, String HoraInicio, String HoraFim, int capacidade,String Ocorrencia) {

        String msg = "";

        caminhao caminhao = new caminhao();
        caminhao.setNrPatrimonio(patrimonio);
        caminhao.setAno(ano);
        caminhao.setChassi(Chassi);
        caminhao.setCombustivel(Combustivel);
        caminhao.setNrEixos(NrEixos);
        caminhao.setCor(Cor);
        caminhao.setDestinacao(Destinacao);
        caminhao.setMarca(Marca);
        caminhao.setMotor(Motor);
        caminhao.setPlaca(Placa);
        caminhao.setModelo(Modelo);
        caminhao.setCapacidade(capacidade);
        
        msg = caminhao.imprimirVeiculo();
        
        msg += caminhao.regiOp(Destinacao, Objetivo, DataInicio, DataFim, HoraInicio, HoraFim, Ocorrencia);

        return msg;
    }

}
