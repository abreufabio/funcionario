
package model;


public class Quadrado extends PolignoRegular{
    
    private int perimetroQuadrado;

   
    public int getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

 
    public void setPerimetroQuadrado(int perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }

    @Override
    public String mensagem(String texto) {
        return super.mensagem(texto); 
    }
    
    public int perimetroQuad(){
        return lado*4;
    }
    
    public int areaQuadrado(){
        
        return lado * lado;
    }
     
}
