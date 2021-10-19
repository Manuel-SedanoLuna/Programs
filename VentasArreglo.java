//
//José Manuel Sedano Luna
//621965
//permite al usuario elegir entre dos funciones
//
import java.io.*;
import java.util.*;
import java.text.*;
class VentasArreglo{
   public static void main(String arg[])
   {
      Scanner f = new Scanner (System.in);
      double v[] = new double [10];
      double acum = 0;
      DecimalFormat d = new DecimalFormat("0.00");
      for(int i = 0; i<10; i++)
      {
        System.out.println("ingresa el valor de la venta mensual del almacen "+(i+1)+":");
        v[i] = f.nextInt(); 
        acum += v[i];         
      }
      double prom = acum/10;
      System.out.println("Almacen            Venta");
      for(int i = 0; i<10; i++)
         System.out.println("\t" +(i+1)+"\t\t\t\t\t"+" $"+d.format(v[i])); 
      System.out.println("Media de las ventas: $"+d.format(prom));
      System.out.println("\t Almacenes cuyas ventas fueron superiores" );
      System.out.println("\t a la media de las ventas" );
      System.out.println("Almacen            Venta");
      for(int i = 0; i<10; i++)
         if (v[i] > prom)
            System.out.println("\t" +(i+1)+"\t\t\t\t\t"+" $"+d.format(v[i]));
   }
}