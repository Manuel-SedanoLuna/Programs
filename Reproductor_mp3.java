
import java.util.*;
public class Reproductor_mp3 {
   private String[] playlist;
   private int posCancion;
   private String accion;
   
   
	public Reproductor_mp3(String[] playlist, int posCancion, String accion) {
		setPlaylist(playlist);
      setPosCancion(posCancion);
      setAccion(accion);
	}
	public void setPlaylist(String[] playlist) {
		this.playlist=playlist;
	}
   public String[] getPlaylist() {
	   return playlist;
	}
   public void setPosCancion(int posCancion) {
		this.posCancion=posCancion;
	}
   public int getPosCancion() {
	   return posCancion;
	}
   public String anterior() {
		String cancion;
      posCancion-=1;
      cancion=playlist[posCancion];
      return cancion;       
	}
   public void setAccion(String accion) {
		this.accion=accion;
	}
   public String getAccion() {
	   return accion;
	}

	public String siguiente() {
		String cancion;
      posCancion+=1;
      cancion=playlist[posCancion];
      return cancion;
	}
   public String toString() {
   String mensaje=" ";
   if(accion.equals("s"))
      mensaje="cancion a reproducir: "+siguiente();
   else
      mensaje="cancion a reproducir: "+anterior();
   return mensaje;     
   }
}
class Principal {
   public static void main (String args[]){
      String[] playlist={"Juanes-La camisa negra","AC/DC-Thunderstruck","Elefante-Mentirosa","Pink floyd- The final cut","SALES-Renee"};
      int posCancion=0;
      String accion="s";
      Reproductor_mp3 R1 = new Reproductor_mp3(playlist,posCancion,accion);
      R1.setAccion(accion="s");
      System.out.println(R1.setAccion(accion="s"));
   }
}