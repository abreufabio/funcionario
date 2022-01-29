package controller;

import model.MedicoFamilia;
import model.MedicoHospitalar;


public class ApresentacaoMedico {
    public static void main(String[] args) {
        MedicoHospitalar medicoHospitalar = new MedicoHospitalar();
        medicoHospitalar.setCrm("123456");
        medicoHospitalar.setNome("Pedro");
        medicoHospitalar.setEmail("pedro405");
        medicoHospitalar.setTelefone("84234233");
        medicoHospitalar.setHospital("São Francisco");
        medicoHospitalar.setTelHospital("40028922");
        
        System.out.println();
        System.out.println("***Médico Hospitalar***");
        System.out.println("CRM: "+medicoHospitalar.getCrm());
        System.out.println("Nome: "+medicoHospitalar.getNome());
        System.out.println("Email: "+medicoHospitalar.getEmail());
        System.out.println("Telefone: "+medicoHospitalar.getTelefone());
        System.out.println("Hospital: "+medicoHospitalar.getHospital()); 
        System.out.println("Telefone do Hospital: "+medicoHospitalar.getTelHospital());
        
        System.out.println("Pressão: "+medicoHospitalar.aferirPressao("11/7"));
        
        MedicoFamilia medicoFamilia = new MedicoFamilia();
        medicoFamilia.setCrm("12312321");
        medicoFamilia.setNome("Pedro");
        medicoFamilia.setEmail("pedro405");
        medicoFamilia.setTelefone("84234233");
        medicoFamilia.setQtdPaciente(2);
        medicoFamilia.setRegiao("Nordeste");
        
        
        System.out.println();
        System.out.println("***Médico Família***");
        System.out.println("CRM: "+medicoFamilia.getCrm());
        System.out.println("Nome: "+medicoFamilia.getNome());
        System.out.println("Email: "+medicoFamilia.getEmail());
        System.out.println("Telefone: "+medicoFamilia.getTelefone());
        System.out.println("Quantidade: "+medicoFamilia.getQtdPaciente()); 
        System.out.println("Região: "+medicoFamilia.getRegiao());
        
        
        
    }
}
