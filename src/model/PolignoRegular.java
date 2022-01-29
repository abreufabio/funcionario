package model;


class PolignoRegular {
    
    protected int lado;
    protected int altura;

    
    public int getLado() {
        return lado;
    }

    
    public void setLado(int lado) {
        this.lado = lado;
    }

    
    public int getAltura() {
        return altura;
    }

    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public String mensagem(String texto){
        return texto;
    }
    
   
}
