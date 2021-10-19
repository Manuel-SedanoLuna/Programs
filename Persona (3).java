/*
Programa que genera el RFC de una persona
*/
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.text.*;
public class Persona {
   private Nombre nombre;
   private Fecha fechaNac;
   public Persona(Nombre nombre, Fecha fechaNac){
      setNombre(nombre);
      setFechaNac(fechaNac);
   }
   public void setNombre(Nombre nombre){
      this.nombre=nombre;
   }
   public void setFechaNac(Fecha fechaNac){
      this.fechaNac=fechaNac;
   }
   public Nombre getNombre(){
      return nombre;
   }
   public Fecha getFechaNac(){
      return fechaNac;
   }
   public String RFC(){
      String hClave, clave,rfc;
      int numero = (int)(Math.random()*10);
      String[] abc={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      String anio=String.valueOf(fechaNac.getAaaa());
      clave = nombre.getApellido_p().substring(0,2)+nombre.getApellido_m().substring(0,1)+nombre.getNombre().substring(0,1)+anio.substring(2)+fechaNac.getMm()+fechaNac.getDd();
      hClave = abc[(int)(Math.random()*10)]+abc[(int)(Math.random()*10)]+(int)(Math.random()*10);
      return rfc=(clave+hClave).toUpperCase();
   }
}
class Nombre{
   private String nombre;
   private String apellido_p;
   private String apellido_m;
   public Nombre(String nombre,String apellido_p,String apellido_m){
      setNombre(nombre);
      setApellido_p(apellido_p);
      setApellido_m(apellido_m);  
   }
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   public String getNombre(){
      return nombre;
   }
   public void setApellido_p(String apellido_p){
      this.apellido_p = apellido_p;
   }
   public String getApellido_p(){
      return apellido_p;
   }
   public void setApellido_m(String apellido_m){
      this.apellido_m=apellido_m;
   }
   public String getApellido_m(){
      return apellido_m;
   }
   public String toString(){
      return nombre+" "+apellido_p+" "+apellido_m;
   }
}
class Fecha{
   private int dd;
   private int mm;
   private int aaaa;
   public Fecha(int dd, int mm, int aaaa){
      setDd(dd);
      setMm(mm);
      setAaaa(aaaa);
   }
   public void setDd(int dd){
      this.dd=dd;
   }
   public int getDd(){
      return dd;
   }
   public void setMm(int mm){
      this.mm=mm;
   }
   public int getMm(){
      return mm;
   }
   public void setAaaa(int aaaa){
      this.aaaa=aaaa;
   }
   public int getAaaa(){
      return aaaa;
   }
   public String toString(){
      return dd+"/"+mm+"/"+aaaa;
   }
}
class Principal{
 public static void main (String[] args){
   int fecha[]=new int[3];
   System.out.println("------DATOS DE LA PERSONA------");
   System.out.println("------NOMBRE------");
   Nombre n1 = new Nombre(pedirVal("Ingrese su nombre:"),pedirVal("Ingrese su apellido paterno:"),pedirVal("Ingrese su apellido materno:"));
   fecha=recibirFecha();
   Fecha f1 = new Fecha(fecha[2],fecha[1],fecha[0]);
   Persona p1 = new Persona(n1,f1); 
   imprimirRfc(p1);
 }
 public static void imprimirRfc(Persona p1){
   System.out.println(p1.RFC());  
 }
 public static int[] recibirFecha(){
   int anio,mes,dia;
   GregorianCalendar calendar = new GregorianCalendar();
   LocalDate fechaAct = LocalDate.now();
   int anioAct = fechaAct.getYear();
   
   int[] rango={1910,anioAct-17};
   System.out.println("------FECHA DE NACIMIENTO------");
   anio = pedirNum("Anio de nacimiento:",rango);
   rango[0]= 1;
   rango[1]=12;
   mes = pedirNum("Mes de nacimiemto:",rango);                      
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
   dia = pedirNum("Dia de nacimiento:",rango);
   int fecha[]={anio,mes,dia};
   return fecha;
 }
 public static String pedirVal(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      String val=s.nextLine();
      return val;
   }
 public static int pedirNum(String mensaje, int[] rango){
      Scanner s=new Scanner(System.in);
      int val;
      String valor;
      do{
         System.out.println(mensaje);
         valor=s.nextLine();            
         try {                       //checar si es numerico
            Integer.parseInt(valor);
            val=Integer.parseInt(valor);
            if(val<rango[0]||val>rango[1]){
               valor="00";
               System.out.println("Valor fuera de rango");
               if (valor.length()==4)
                  valor="0000";
            }
         } catch (NumberFormatException excepcion) {
            valor="00";
            System.out.println("Valor no numérico");
         if (valor.length()==4)
                  valor="0000"; 
        }
      }while(valor.equals("0000")||valor.equals("00"));          
      return val=Integer.parseInt(valor);
   }
}
