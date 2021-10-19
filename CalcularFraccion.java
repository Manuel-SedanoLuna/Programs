/**
 * 621965
 José Manuel Sedano Luna
 */
 import java.util.*;

public class CalcularFraccion {

    
    private float numerador;
    private float denominador;
    //constructor
    public CalcularFraccion(float numerador, float denominador){
      setNumerador(numerador);
      setDenominador(denominador);
    }
    public void setNumerador(float numerador){
      this.numerador=numerador;
    }
    public void setDenominador(float denominador){
      this.denominador=denominador;
    }
    
    public float getNumerador(){
      return numerador;
    }
    public float getDenominador(){
      return denominador;
    }
    
    public double division() {
       return numerador/denominador;
    }
    public String toString(){
      return "Fraccion: "+numerador+"/"+denominador+"\t Igual a: "+division();
    }
}

class Principal{
   public static void main(String arg[]){
      float d1,n1,df;
      Scanner x = new Scanner (System.in);
      System.out.println("Dar el numerador: ");
      n1 = x.nextFloat();
      
      do{
         System.out.println("Dar el denominador: ");
         d1 = x.nextFloat();
         if (d1==0)
            System.out.println("Dar un numero diferente de 0");
      }while(d1==0);
      CalcularFraccion op1 = new CalcularFraccion(n1,d1);
      System.out.println(op1);
   }
}