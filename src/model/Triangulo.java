
package model;

public class Triangulo extends PolignoRegular{
    private int perimetroRetangulo;

    /**
     * @return the perimetroRetangulo
     */
    public int getPerimetroRetangulo() {
        return perimetroRetangulo;
    }

    /**
     * @param perimetroRetangulo the perimetroRetangulo to set
     */
    public void setPerimetroRetangulo(int perimetroRetangulo) {
        this.perimetroRetangulo = perimetroRetangulo;
    }
    
    public int areaTriangulo(){
        return (lado*altura)/2;
    }
    
    public int perTri(){
        return lado*3;
    }
}
