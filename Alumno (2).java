/*José Manuel Sedano Luna
621965
Este programa determina la calificacion de un alumno en letra
dependiendo de un promedio de 3 calificaciones y un rango predeterminado
*/
import java.io.*;
import java.util.*;
   class Alumno{
    public static void main(String arg[])
    {
    float calif1, calif2, calif3, promedioFinal;
    char califAlumno=' ';
    Scanner x = new Scanner (System.in);
    System.out.println("Dar calificacion 1:"+"\n");
    calif1 = x.nextFloat();
    System.out.println("Dar calificacion 2:"+"\n");
    calif2 = x.nextFloat();
    System.out.println("Dar calificacion 3:"+"\n");
    calif3 = x.nextFloat();
    promedioFinal = (calif1+calif2+calif3)/3;
    if (promedioFinal >= 90)
      califAlumno = 'A';
    else
    	if (promedioFinal >= 80)
         califAlumno = 'B';
      else
       	if (promedioFinal >= 70)
            califAlumno = 'C';
         else  
            califAlumno = 'D';
    
    System.out.println("La calificacion final del alumno es: "+califAlumno);
    }
   }