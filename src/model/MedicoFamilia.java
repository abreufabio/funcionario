
package model;


public class MedicoFamilia extends Medico{
    private String regiao;
    private int qtdPaciente;


    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public int getQtdPaciente() {
        return qtdPaciente;
    }

    public void setQtdPaciente(int qtdPaciente) {
        this.qtdPaciente = qtdPaciente;
    }
    
    @Override
    public String aferirPressao(String valor) {
        return super.aferirPressao(valor); 
    }
  
    
}
