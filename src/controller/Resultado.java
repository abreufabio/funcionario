
package controller;

import javax.swing.JOptionPane;
import model.Quadrado;
import model.Retangulo;
import model.Triangulo;



public class Resultado extends Quadrado{
    public static void main(String[] args) {
        Quadrado area = new Quadrado();
        Retangulo area2 = new Retangulo();
        Triangulo area3 = new Triangulo();
        
        area.setLado(3);
        
        area2.setAltura(4);
        area2.setLado(5);
        
        area3.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"))); 
        area3.setLado(Integer.parseInt(JOptionPane.showInputDialog("Digite a lado")));
        
        System.out.println("Área do Quadrado: "+ area.areaQuadrado()+"\nPerímetro: "+area.perimetroQuad());
        System.out.println("\nÁrea do Retangulo: "+ area2.areaRetangulo()+ "\nPerímetro: "+area2.perRet());
        System.out.println("\nTriangulo: "+ area3.areaTriangulo()+ "\nPerímetro: "+ area3.perTri());
    }
}
