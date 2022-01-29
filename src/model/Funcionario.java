package model;

import java.text.DecimalFormat;


public class Funcionario {
    
    private int matricula;
    private String nome;
    private String email;
    private String cargo;
    private double salario;
    private String endereco;
    
    public void setMatricula(int mat){ /*Cada set de matricula tem que ter um get de matrícula*/
        this.matricula = mat;
    }
    public void setNome(String nom){
        this.nome = nom;
    }
    public void setEmail(String em){
        this.email = em;
    }
    public void setCargo(String car){
        this.cargo = car;
    }
    public void setSalario(double sal){
        this.salario = sal;
    }
    public void setEndereco(String ende){
        this.endereco = ende;
    }
    
    
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }
    public String getEmail(){
        return email;
    }
    public double getSalario(){
        return salario;
    }
    public String getEndereco(){
        return endereco;
    }
    
    public String mostraFuncionario(){ /*Ordem: privacidade / o que eu quero que retorne e o nome*/
        DecimalFormat df = new DecimalFormat("R$ ##,###.00");
        String sal = df.format(salario);
        return "Matricula: " + matricula + "\nNome: " + nome + 
                "\nE-Mail: " + email + "\nCargo: " + cargo +
                "\nSalário: " + sal + "\nEndereço: " + endereco;
    }

 
}

    