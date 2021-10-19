import java.io.*;
import java.util.*;
class Frase{
   private String t;
   
   public Frase(String t)
   {
     setT(t);
   }
   public void setT(String t)
   {
     this.t=t;
   }
   public String getT()
   {
     return t;
   }
   // Contar vocales del texto
   public int calcularVocales() {
      int cantVocales = 0;
      for(int i = 0; i < t.length(); i++) {
         char letra = t.substring(i, (i+1)).toLowerCase().charAt(0);
         if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            cantVocales++;
      }
      return cantVocales;
   }}
public int definirCantPala(){
      StringTokenizer k=new StringTokenizer(t," ");
      return k.countTokens();
   }
public String cambiarMayuscula() {
      return t.toUpperCase();
   }

public String remplazarTexto(String y, String x){
        
         return t.replaceAll(y,x);
        
    }



   
   
   public String toString()
   {
     return "el texto original es:"+t;
   }
