public class Calendario{
   //Atributos
   private int dia;
   private int mes;
   private int anio;
   //Método constructor
   public Calendario(int dia, int mes,int anio){
      setDia(dia);
      setMes(mes);
      setAnio(anio);   
   }
   //set y get dia
   public void setDia(int dia) {
		this.dia=dia;
	}
   public int getDia() {
	   return dia;
	}
   //set y get mes
   public void setMes(int mes) {
		this.mes=mes;
	}
   public int getMes() {
	   return mes;
	}
   //set y get anio   
   public void setAnio(int anio) {
		this.anio=anio;
	}
   public int getAnio() {
	   return anio;
	}
   public String toString() {
        return String.format("%02d", dia);
    }
}

class Principal{
   public static void main(String arg[]){
   Calendario c1 = new Calendario(20,12,2010);
   System.out.println(c1);
   }
}