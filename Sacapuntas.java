
import java.util.*;

public class Sacapuntas {
    private String color ;
    private String tamanio;
    private String marca;
    private String tiempoUso;
   
    public Sacapuntas(String color, String tamanio, String marca, String tiempoUso){
      this.color = color;
      this.tamanio = tamanio;
      this.marca = marca;
      this.tiempoUso = tiempoUso;  
    }
}

class Principal{
   public static void main(String args[]){
      Sacapuntas sacapuntas = new Sacapuntas("verde","pequeño","generico","6 meses");
   }
}