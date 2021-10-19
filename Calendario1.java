/*José Manuel Sedano Luna
621965
Esta clase calcula la siguiente fecha dependiendo del tiempo de entrada
(Semanas, meses, años)
*/
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
class Calendario{
   
   public static void main(String arg[]){
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      int dia, mes, anio;
      anio=darAnio();
      mes=darMes();
      dia=darDia(mes, anio);
      LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
      LocalDate fechaFinal = LocalDate.of(anio, mes, dia);
      fechaFinal = calcFechaFinal(fechaFinal);
      System.out.println("Su fecha Final con el formato DD/MM/AAAA:");
      System.out.println(fechaFinal.format(formatador));
                  
   }
   //Metodo para validar si es numero o no para cualquier entrada
   public static int validarNum(int[] rango, String mensaje){
      String val;
      Scanner s=new Scanner(System.in);
      int valor;
      boolean resultado;
      do{        
        System.out.println("Dar "+mensaje);
        val=s.next();
        try {                       //checar si es numerico
            Integer.parseInt(val);
            valor=Integer.parseInt(val);
            resultado = true;
            if(valor<rango[0]||valor>rango[1]){
               resultado=false;
               System.out.println("El valor ingresado debe estar dentro del rango de "+rango[0]+" y "+rango[1]);
            }
            else
               resultado=true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
            System.out.println("El valor ingresado debe ser numerico\n");   
        }
     }while(resultado==false);
    valor = Integer.parseInt(val);
    return valor;   
   }
   //metodo para recibir años
   public static int darAnio(){
      int anio;
      int[] rango={2000,2099};
      String mensaje="anio de Inicio(2000-2099): ";
      return anio=validarNum(rango,mensaje);
   }
   //metodo para recibir meses
   public static int darMes(){
      int mes;
      int[] rango={1,12};
      String mensaje="mes de Inicio(1-12): ";
      return mes=validarNum(rango,mensaje);
   }
   //metodo para recibir dias
   public static int darDia(int mes, int anio){
      GregorianCalendar calendar = new GregorianCalendar();
      int dia;
      int[] rango = new int[2];
      rango[0]=1;
      if(mes==2){
         if (calendar.isLeapYear(anio))
            rango[1]=29;     
         else
            rango[1]=28;      
      }
      else{
         if(mes%2==0)
            rango[1]=31;            
         else
            rango[1]=30;            
      }  
      String mensaje="dia de Inicio(dependiendo el mes): ";
      return dia=validarNum(rango,mensaje);
   }
   //metodo para calcular el periodo de tiempo y la fecha final
   public static LocalDate calcFechaFinal(LocalDate fechaFinal){
      int accion,tiempo;
      String mensaje = "numero de la accion a realizar(1-3):";
      int[] rango={1,3};
      System.out.println("Menu");
      System.out.println("1. Agregar Semanas(max. 52)");
      System.out.println("2. Agregar Meses(max. 12)");
      System.out.println("3. Agregar Anios(max. 5)");
      accion=validarNum(rango,mensaje);
      
      rango[0]=0;
      if(accion==1)
         rango[1] = 52;
      else{
         if(accion==2)
            rango[1] = 12;
         else
            rango[1] = 5;
      }
      mensaje = "tiempo para agregar: ";
      tiempo = validarNum(rango,mensaje);
      if(accion==1)
         fechaFinal = fechaFinal.plusWeeks(tiempo);
      else{
         if(accion==2)
            fechaFinal = fechaFinal.plusMonths(tiempo);
         else
            fechaFinal = fechaFinal.plusYears(tiempo);
      }
      return fechaFinal;
   }
}