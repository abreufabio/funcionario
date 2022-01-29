
package model;


public class onibus extends Veiculo{
    private int capacidade;
    private String tipo;
    private boolean blindagem;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isBlindagem() {
        return blindagem;
    }

    public void setBlindagem(boolean blindagem) {
        this.blindagem = blindagem;
    }

    @Override
    public String regiOp(String responsavel, String objetivo, String dataInicio, String dataFim, String horaInicio, String horaFim, String ocorrencia) {
        return super.regiOp(responsavel, objetivo, dataInicio, dataFim, horaInicio, horaFim, ocorrencia); //To change body of generated methods, choose Tools | Templates.
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
        msg  += "\n Tipo: "+ tipo +
                "\n Blindagem: " + b +
                "\n Capacidade: "+ capacidade;
        return  msg;
    }

    

    
    
    
}
