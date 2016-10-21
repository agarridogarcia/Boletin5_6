
package boletin5_6;

import javax.swing.JOptionPane;


public class Boletin5_6 {

  
    public static void main(String[] args) {
        Ventas venta1=new Ventas();
        double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca o número de artigos vendidos"));
        venta1.amosar(n1);
    }
    
}
