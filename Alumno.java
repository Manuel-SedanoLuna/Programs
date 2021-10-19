
import java.util.*;

/**
 * 
 */
public class Alumno {

    public int matricula;
    public float cal1;
    public float cal2;
    public float cal3;
    //constructor
    public Alumno(int matricula, float cal1,float cal2,float cal3){
      this.matricula = matricula;
      this.cal1 = cal1;
      this.cal2 = cal2;
      this.cal3 = cal3;
    }
    
    public double calPromedio() {
        return (cal1+cal2+cal3)/3;
    }

    public String toString() {
        return "Matricula: "+matricula+"\t el promedio: "+calPromedio();
    }
}
class Principal{
   public static void main(String arg[]){
   Alumno a1 = new Alumno(100000,95.99f,99.99f,98.99f);
   System.out.println(a1);
   }
}