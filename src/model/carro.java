
package model;

import java.time.format.DateTimeFormatter;
import java.util.Date;


public class carro extends Veiculo{
    private int nrPortas;
    private boolean blindagem;
    private int capacidade;
    

    public int getNrPortas() {
        return nrPortas;
    }

    public void setNrPortas(int nrPortas) {
        this.nrPortas = nrPortas;
    }

    public boolean isBlindagem() {
        return blindagem;
    }

    public void setBlindagem(boolean blindagem) {
        this.blindagem = blindagem;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String regiOp(String responsavel, String objetivo, String dataInicio, String dataFim, String horaInicio, String horaFim, String ocorrencia) {
        return super.regiOp(responsavel, objetivo, dataInicio, dataFim, horaInicio, horaFim, ocorrencia); 
    }

    @Override
    public String imprimirVeiculo() {
        String msg = super.imprimirVeiculo();
        String b = "";
        if(blindagem == true){
            b = "Sim";
        }else{
            b = "Não";
        }
        msg  += "\n Número de portas: "+ nrPortas+
                "\n Blindagem: " + b+
                "\n Capacidade: "+ capacidade;
        return  msg;
    }

    

    

    
    
    
}
