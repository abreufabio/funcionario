package model;

import java.time.format.DateTimeFormatter;
import java.util.*;


 class Veiculo {
    protected String nrPatrimonio;
    protected String chassi;
    protected String placa;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String motor;
    protected String destinacao;
    protected String combustivel;
    
     public String getNrPatrimonio() {
        return nrPatrimonio;
    }
     
    public void setNrPatrimonio(String nrPatrimonio) {
        this.nrPatrimonio = nrPatrimonio;
    }
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getDestinacao() {
        return destinacao;
    }

    public void setDestinacao(String destinacao) {
        this.destinacao = destinacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    public String regiOp(String responsavel, String objetivo, String dataInicio, String dataFim, String horaInicio, 
            String horaFim, String ocorrencia){
        ocorrencia = ocorrencia.trim();
        String msg = "";
        if(!ocorrencia.equalsIgnoreCase("Não há ocorrência.") && !ocorrencia.trim().equalsIgnoreCase("")){
            msg = "\n\n\n*** Registro de ocorrencia";
        }else{
            msg = "\n\n Registro de ocorrencia";
        }
        return msg + "\nObjetivo da operação: "+ objetivo+
                "\nResponsavel: "+ responsavel+
                "\nData Inicio: "+ dataInicio+
                "\nData fim: "+ dataFim+
                "\nInicio op: "+ horaInicio+
                "\nFim op: "+ horaFim+
                "\nOcorrencias: "+ocorrencia;
    }
    
    public String imprimirVeiculo(){
        
    return "\nNr Patrimonio: " + nrPatrimonio +
        "\nPlaca: " + placa +
        "\nChassi: " +  chassi +
        "\nCor: " + cor +
        "\nMarca: " + marca +
        "\nModelo: " + modelo +
        "\nAno: "+ ano +
        "\nMotor: "+ motor+
        "\nCombustível: " + combustivel+ 
        "\nDesintação: " + destinacao;

}
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

    


    

    

    
    
    
}
