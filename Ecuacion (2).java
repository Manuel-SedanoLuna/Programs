//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Ecuacion.java
//  @ Date : 
//  @ Author :
//    Objetivo: Generar las dos raices de una ecuacion cuadratica
//




public class Ecuacion {
   private double a; /* a. representa el valor del coeficiente cuadratico */ 
                     //cambiar el nombre de la variable b2 por b
   private double b; /* b. representa el valor del coeficiente lineal */ 
   private double c; /* c. representa el valor de la constante */ 
   
   
      public Ecuacion(double a,double b,double c){
      //mayusculas en los nombres de sets
      setA(a);
      setB(b);
      setC(c);   
   }
   //cambiar nombres de metodos
   public void setA(double a) {
  //c
   this.a=a;
   }
   
   public void setB(double b) {
   this.b=b;
   }
   
   public void setC(double c) {
   this.c=c;
   }
   
   public double getA() {
   return a;
   }
   
   public double getB() {
   return b;
   }
   
   public double getC() {
   return c;
   }


   public double calcular_Raiz1() {
      double d=((b*b)-(4*a*c));
      double r;
      if (d<0){
         r=0;
      System.out.println ("Error:discriminante negativo");
         }  
      else  r= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
     return r;
    }
   
   
   public double calcular_Raiz2() {
      double d=(b*b)-(4*a*c);
      double r;
      if (d<0){
       r=0;
      System.out.println ("Error: discriminante negativo");
       }
      else  r= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
     return r;
   }

   public String toString() {
   return "Las raices de la Ecuacion: "+getA()+"x^2 + "+getB()+"x + "+getC()+ " son: "+"r1="+calcular_Raiz1()+" r2="+calcular_Raiz2(); //getC tenia el + antes de parentesis     
   }
   
}

class Principal {
   public static void main (String args[]){
      
      Ecuacion Ec1=new Ecuacion(1,2,1);
         System.out.println(Ec1);
      Ecuacion Ec2=new Ecuacion(8,6,4);
         System.out.println(Ec2);
      Ecuacion Ec3=new Ecuacion(4,2,3);
         System.out.println(Ec3);
   }
}