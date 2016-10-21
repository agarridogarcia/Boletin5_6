
package boletin5_6;

public class Ventas {
    private double num1;
    //const.
    public Ventas(){
         num1=0;
        
        
    }
    public Ventas(double n1){
         num1=n1;
    }
    public void amosar(double n1){
        if (n1<=100)
            System.out.println("O artigo é de baixo consumo");
        else if (n1>100&&n1<500)
            System.out.println("O artigo é de consumo medio");
        else if (n1>500&&n1<1000)
            System.out.println("O artigo é de alto consumo");
        else
            System.out.println("O artigo é de primeira necesidade");
    }
    
    
}
