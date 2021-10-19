//
//José Manuel Sedano Luna
//621965
//permite al usuario elegir entre dos funciones
//
import java.io.*;
import java.util.*;
class ArreglosUnidim{
   public static void main(String arg[])
   {
      Scanner f = new Scanner (System.in);
      int x[] = new int [20];
      int y[] = new int [20];
      char z[] = new char [20];
      for(int i = 0; i<20; i++)
      {
        System.out.println("ingresa el numero entero para el primer arreglo en la posicion "+(i+1)+":");
        x[i] = f.nextInt(); 
        System.out.println("ingresa el numero entero para el segundo arreglo en la posicion "+(i+1)+":");
        y[i] = f.nextInt();
        if( x[i]%2==1 && y[i]%2==1 )
          z[i] = 'I';
        else
          if ( x[i]%2==0 && y[i]%2==0 ) 
              z[i] = 'P';
          else
              z[i] = 'N';         
      }
      for(int i = 0; i<20; i++)
      {
         System.out.println("El valor del tercer arreglo en la posicion " +(i+1)+" es: "+z[i]);
      } 
   }
}