/*
 IMPORTANTE
 */
package model;

/**
 *
 * @author 06607289150
 */
 class Medico {
    
    
    protected String crm;
    protected String nome;
    protected String email;
    protected String telefone;
    

   
    public String getCrm() {
        return crm;
    }
  
    public void setCrm(String crm) {
        this.crm = crm;
    }
  
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
   
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String aferirPressao(String valor){
        
        return valor;
    }
    
    
}
