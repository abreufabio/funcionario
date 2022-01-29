package model;

public class MedicoHospitalar extends Medico{
    
    private String hospital;
    private String telHospital;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getTelHospital() {
        return telHospital;
    }

    public void setTelHospital(String telHospital) {
        this.telHospital = telHospital;
    }

    @Override
    public String aferirPressao(String valor) {
        return super.aferirPressao(valor); 
    }
   
    //public String 
    
}
