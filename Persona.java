/*
Jose Manuel Sedano Luna
mat. 621965

Objetivo: recibir el sexo, peso y estatura
y calcular IMC y peso ideal

*/
import java.util.*;
import java.io.*;
import java.text.*;
public class Persona {

	private double estatura;
	private float masa;
	private int sexo;
   
   // Método constructor
   public Persona(double estatura, float masa, int sexo) {
		this.estatura = estatura;
      this.masa = masa;
      this.sexo = sexo;
	}
   // Calcula la masa ideal
	public double masaIdeal() {
		double masaI = 0;
      if (sexo == 1)//mujer
         masaI = estatura*100-110;
      else
         masaI = estatura*100-100;
      return masaI;
	}
   // Calcula el IMC
	public double calcularImc() {
		return masa / Math.pow(estatura,2);
	}
   // Imprime los resultados
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
      return "Su IMC es: "+df.format(calcularImc())+".\nSu Peso ideal es: "+df.format(masaIdeal());
	}
}
class Principal{
   public static void main(String arg[]){
      String mensaje="estatura en metros (ejemplo: 1.60):";
      String pwd = "Netf!ix123";
      Principal.contraseña(pwd);
      float est,peso;
      int sex,x;
      x=0;
      est = pedirValor(mensaje,x);
      x++;
      mensaje="peso en kg (ejemplo: 60):";
      peso = pedirValor(mensaje,x);
      mensaje="SEXO (ejemplo: Mujer):";
      sex = pedirSexo(mensaje);
      Persona p1 = new Persona(est,peso,sex);
      System.out.println(p1);
   }
   // Método que valida la contraseña preestablecida
   public static void contraseña(String pwd){
      String contra;
      boolean resultado=false;
      Scanner s=new Scanner(System.in);
      do{
         System.out.println("Dar contrasenia:");
         contra = s.next();
         if(contra.equals(pwd)){
            resultado=true;
            System.out.println("Bienvenid@");
         }
         else
            System.out.println("Contrasenia incorrecta");   
      }while(resultado==false);      
   } 
   // Método donde pedimos y validamos los valores que da el usuario
   public static float pedirValor(String mensaje, int x){
     Scanner s=new Scanner(System.in);
     float valor;
     double inf, sup;
     boolean resultado;
     String val;
     if(x==0){
      inf=1;
      sup=2.5;
     }
     else{
      inf=20;
      sup=200;
     }
     
     do{        
        System.out.println("Dar "+mensaje);
        val=s.next();
        try {                       //checar si es numerico
            Float.parseFloat(val);
            valor=Float.parseFloat(val);
            resultado = true;
            if(valor<inf||valor>sup){
               resultado=false;
               System.out.println("El valor ingresado debe ser real\n");
            }
            else
               resultado=true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
            System.out.println("El valor ingresado debe ser numerico\n");   
        }
     }while(resultado==false);
    valor = Float.parseFloat(val);
    return valor;
   }
   // Método para validar que el sexo sea correcto
   public static int pedirSexo(String mensaje){
     Scanner s=new Scanner(System.in);
     int valor;
     char sex;
     boolean resultado=true;
     String val;
     do{        
        System.out.println("Dar "+mensaje);
        val=s.next();
        sex=val.charAt(0);
        val=Character.toString(sex);
        try {                      
            Integer.parseInt(val);
            System.out.println("El valor ingresado debe hombre o mujer\n");
            resultado = false;
        } catch (NumberFormatException excepcion) {
            resultado=true;     
        }
        if(!val.equalsIgnoreCase("h")&&!val.equalsIgnoreCase("m")){
         System.out.println("El valor ingresado debe hombre o mujer\n");
         resultado=false; 
         }
     }while(resultado==false);
     valor=0;
     if(val.equalsIgnoreCase("h"))
         valor=0;
        else
         if(val.equalsIgnoreCase("m"))
            valor=1; 
    return valor;
   }
}