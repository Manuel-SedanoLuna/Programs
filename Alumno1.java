//  @ Project : Untitled
//  @ File Name : Alumno1.java
//  @ Date : 9/3/2021
//  @ Author : CODERS
//  //Sofia Montoya 566646, Cristina Isabel 565371, Manuel Sedano 621965, Jesus Izaguirre
//

import java.io.*;
import java.util.*;
import java.text.*;

public class Alumno1 {
	private int matricula;
	private int creditos;
	public Alumno1(int matricula,int creditos) {
    setMatricula(matricula);
    setCreditos(creditos);
	}
	
	public float calcularColegiatura() {
    return 2300.00f*creditos;
	
	}
	
	public String toString() {
   DecimalFormat d=new DecimalFormat("0.00");
  return "\n\nMatricula: "+getMatricula()+"\t Con creditos: "+getCreditos()+"\t Pagara: $"+d.format(calcularColegiatura())+"\n\n";
	
	}
	
	public int getMatricula() {
    return matricula;
	}
	
	public int getCreditos() {
    return creditos;
	}
	
	public void setMatricula(int matricula) {
    this.matricula=matricula;
	}
	
	public void setCreditos(int creditos) {
    this.creditos=creditos;
	}
}

class Principal{
  public static void main(String args[]){
    for(int i =0;i<2;i++){
       String mensaje="Ingrese su matricula";
       int matricula=Principal.pedirDato(mensaje);
       mensaje="Ingrese los creditos que cursara";
       int creditos=Principal.pedirDato(mensaje);
       if(i==0){
         Alumno1 a1=new Alumno1(matricula,creditos);
         System.out.println(a1);
       }else{
           Alumno1 a2=new Alumno1(matricula,creditos);
           System.out.println(a2);      
       }
    }
  }
  public static int pedirDato(String mensaje){
    Scanner s=new Scanner(System.in);
    int dat;
    do{
      System.out.println(mensaje);
      dat=s.nextInt();
    }while(dat<=0);
    return dat;
  }
}

 