
package model;


public class Retangulo extends PolignoRegular{
    
    private int perimetroRetangulo;

    
    public int getPerimetroRetangulo() {
        return perimetroRetangulo;
    }

    
    public void setPerimetroRetangulo(int perimetroRetangulo) {
        this.perimetroRetangulo = perimetroRetangulo;
    }

    
    
    public int areaRetangulo(){
        
        return lado*altura;
    }
            
   public int perRet(){
       return (lado*2)+(altura*2);
   }
}
