
package model;


public class motocicleta extends Veiculo{
    private boolean bagageiro;

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    @Override
    public String regiOp(String responsavel, String objetivo, String dataInicio, String dataFim, String horaInicio, String horaFim, String ocorrencia) {
        return super.regiOp(responsavel, objetivo, dataInicio, dataFim, horaInicio, horaFim, ocorrencia); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
