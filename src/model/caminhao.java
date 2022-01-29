
package model;


public class caminhao extends Veiculo{
    private int capacidade;
    private int nrEixos;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNrEixos() {
        return nrEixos;
    }

    public void setNrEixos(int nrEixos) {
        this.nrEixos = nrEixos;
    }

    @Override
    public String regiOp(String responsavel, String objetivo, String dataInicio, String dataFim, String horaInicio, String horaFim, String ocorrencia) {
        return super.regiOp(responsavel, objetivo, dataInicio, dataFim, horaInicio, horaFim, ocorrencia); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String imprimirVeiculo() {
        String msg = super.imprimirVeiculo();
        
        msg  += "\n Número de portas: "+ nrEixos+
                "\n Capacidade: "+ capacidade;
        return  msg;
    } 

    

    
    
    
    
}
