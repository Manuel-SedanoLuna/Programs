//Cristina, Sofía, Jesús, Manuel
//Obj: programa en el que se le pide un valor X al usuario y se hace una suma en serie

import java.io.*;
import java.util.*;
import java.text.*;
   class Ecuacion{
      public static void main (String args[]){
         float x;
         String mensaje="Ingrese un numero entre 0 y 1";
         x=Ecuacion.pedirX(mensaje);
         double acum=1;
         acum=Ecuacion.ciclarSerie(acum,x);
         mensaje="El resultado de la suma de la serie de "+x+" es ";
         Ecuacion.imprimirResultados(acum,mensaje);
      }
     
      public static float pedirX (String mensaje){ //Metodo que pide la x al usuario y valida el valor introducido
         Scanner s= new Scanner(System.in);
         float x;
         do{
            System.out.println(mensaje);
            x=s.nextFloat();
         } while(x<0 || x>1);
      return x;
      }
      public static int calcularFactorial(int n){//metodo para calcular el factorial del termino
         int f=1;
         for(int i=1; i<=n; i++)
            f=f*i;
      return f;
      }
      public static double calcularDivision(int nFact, float x, int n){//metodo para calcular el termino que será sumado en la serie
      return Math.pow(x,n)/nFact;
      }

      public static double acumularSuma(double xDiv, double acum){//metodo para acumular la suma
      return acum+=xDiv;
      }
      public static void imprimirResultados(double acum, String mensaje){//metodo para desplegar resultados
      DecimalFormat d=new DecimalFormat("0.000");
      System.out.println(mensaje+d.format(acum));
      }
      public static double ciclarSerie(double acum, float x){
         boolean continuacion=true;
         int n=1;
         while(continuacion){
               int nFact=Ecuacion.calcularFactorial(n);
               double xDiv=Ecuacion.calcularDivision(nFact,x,n);
               n++;
               if(xDiv>=10e-8)
                  acum=Ecuacion.acumularSuma(xDiv,acum);
               else
                  continuacion=false;
            }
     return acum;
      }
  }
//Firma de Honor: Damos nuestra palabra que hemos realizado esta actividad con integridad académica.