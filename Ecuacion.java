import java.io.*;
import java.util.*;
   class Ecuacion{
    public static void main(String arg[])
    {
    
    }
      public static double calcularDivision(float x, int n){
         double xDiv = 0;
         int factorial = Ecuacion.factorial(n);
         double condicion = Math.pow(10,(-8));
         xDiv = Math.pow(x,n) / factorial;
         if (xDiv < condicion)
            xDiv = 0;
         return xDiv;
      }
      public static int factorial(int n)
   {
      int f=1;
      for(int i=1; i<=n; i++){
         f=f*i;
         System.out.println(f);
      }
      return f;
   }

   }