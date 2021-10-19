import java.io.*;
import java.util.*;
import java.text.*;


class Cliente{
   private Nombre nombre;
   private Fecha fecha;
   private Direccion direccion;
   private String telefono;
   private String correo;
   private String rfc;

   public Cliente(Nombre nombre, Direccion direccion, String rfc){
      setNombre(nombre);
      setDireccion(direccion);
      setRfc(rfc);
   }

   public void setNombre(Nombre nombre){
   this.nombre=nombre;
   }

   public void setDireccion(Direccion direccion){
   this.direccion=direccion;
   }

   public void setRfc(String rfc){
   this.rfc=rfc;
   }
   public Nombre getNombre(){
      return nombre;
   }

   public Direccion getDireccion(){
      return direccion;
   }

   public String getRfc(){
      return rfc;
   }

}

class Nombre{
   private String primerNombre;
   private String apellido1;
   private String apellido2;
   public Nombre(String primerNombre, String apellido1, String apellido2){
      setPrimerNombre(primerNombre);
      setApellido1 (apellido1);
      setApellido2(apellido2);
   }
   public void setPrimerNombre(String primerNombre){
      this.primerNombre=primerNombre;
   }
   public void setApellido1(String apellido1){
      this.apellido1=apellido1;
   }
   public void setApellido2(String apellido2){
      this.apellido2=apellido2;
   }
   public String getPrimerNombre(){
      return primerNombre;
   }
   public String getApellido1(){
      return apellido1;
   }
   public String getApellido2(){
      return apellido2;
   }
   public String toString(){
      return primerNombre+" "+apellido1+" "+apellido2;
   }
}

class Direccion{
   private String calle;
   private long numero;
   private String colonia;
   private String ciudad;
   private long cp;
   
   public Direccion(String calle, long numero, String colonia, String ciudad, long cp){
      setCalle(calle);
      setNumero(numero);
      setColonia(colonia);
      setCiudad(ciudad);
      setCp(cp);
   }
   
   public void setCalle(String calle){
      this.calle=calle;
   }
   
   public void setNumero(long numero){
      this.numero=numero;
   }
   
   public void setColonia(String colonia){
      this.colonia=colonia;
   }
   
   public void setCiudad(String ciudad){
      this.ciudad=ciudad;
   }
   
   public void setCp(long cp){
      this.cp=cp;
   }
   
   public String getCalle(){       
      return calle;
   }
       
    public long getNumero(){
      return numero;    
    }
    
    public String getColonia(){
       return colonia;
    }        
    public String getCiudad(){
      return ciudad;
   }
   
   public long getCp(){
      return cp;
   }
   
   public String toString(){
      return getCalle()+" "+getNumero()+", Col. "+getColonia()+", "+getCiudad()+", CP "+getCp();
   }

}

class Detalle{
   private String deta;
   private String clave;
   private float precU;
   private byte cant;
  
   public Detalle(String deta, String clave, float precU, byte cant){
      setDeta(deta);
      setClave(clave);
      setPrecU(precU);
      setCant(cant);
   }
   
   public void setDeta(String deta){
      this.deta=deta;
   }
    
    public void setClave(String clave){
      this.clave=clave;
   }
   
    public void setPrecU(float precU){
      this.precU=precU;
   }
   
   public void setCant(byte cant){
      this.cant=cant;
   }
   
   public String getDeta(){
      return deta;
   }
    
   public String getClave(){
      return clave;
   }
   
   public float getPrecU(){
      return precU;
   }
   
   public byte getCant(){
      return cant;
   }
   
   public double calcularTP(){
      double totalP=getPrecU()*getCant();
      return totalP;
   }
   public String toString (){
      return "";
   }

}

class Empresa{
   private String nombre;
   private Direccion direccion;
  
   public Empresa(String nombre, Direccion direccion){
      setNombre(nombre);
      setDireccion(direccion);
   }
   
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   
   public void setDireccion(Direccion direccion){
      this.direccion=direccion;
   }
    public String getNombre(){
      return nombre;
   }
   
   public Direccion getDireccion(){
      return direccion;
   }

}

class Factura{
   private Detalle detalle1;
   private Detalle detalle2;
   private Detalle detalle3;
   private short folio;
    
   public Factura (Detalle detalle1, Detalle detalle2, Detalle detalle3, short folio){
      setDetalle1(detalle1);
      setDetalle2(detalle2);
      setDetalle3(detalle3);
      setFolio(folio);
   }
      
   public void setDetalle1(Detalle detalle1){
      this.detalle1=detalle1;
   }
   
    public void setDetalle2(Detalle detalle2){
      this.detalle2=detalle2;
   }
   
   public void setDetalle3(Detalle detalle3){
      this.detalle3=detalle3;
   }

   
   public void setFolio(short folio){
      this.folio=folio;
   }
      
   public Detalle getDetalle1(){
      return detalle1;
   }
   
    public Detalle getDetalle2(){
      return detalle2;
   }
   
     public Detalle getDetalle3(){
      return detalle3;
   }

    public short getFolio(){
      return folio;
   }

   public double calcularSubtotal(){
      return detalle1.calcularTP()+detalle2.calcularTP()+detalle3.calcularTP();
   }
   
   public double calcularIva(){
     return calcularSubtotal()*0.16;
   }
   
   public double calcularTotal (){
      return calcularSubtotal()+calcularIva();
   }
    public String toString (){
     return  "";

   }

}


class Principal{
 public static void main (String[] args){
      

      //Llenado del nombre
      Nombre nombre1 = new Nombre(pedirVal("Ingrese su nombre"),pedirVal("Ingrese su primer apellido"),pedirVal("Ingrese su segundo apellido"));

      //Llenado de la dirección
      Direccion dirDom1 = new Direccion(pedirVal("Ingrese la calle del cliente"),pedirL("Ingresar numero de domicilio del cliente"),pedirVal("Ingrese la colonia del cliente"),pedirVal("Ingrese la ciudad del cliente"),pedirL("Ingresar el codigo postal del cliente"));

      //Llenado de la clase Cliente
      Cliente cliente1 = new Cliente(nombre1,dirDom1, pedirVal("Ingrese el RFC del cliente"));
  
      //Llenado detalle 1
      Detalle detalle1=new Detalle(pedirVal("Ingrese el detalle del producto 1"),pedirVal("Ingrese la clave del producto 1"), pedirF("Ingrese el precio unitario del producto 1"), pedirB("Ingrese la cantidad del producto 1"));
      //Llenado detalle 2
      Detalle detalle2=new Detalle(pedirVal("Ingrese el detalle del producto 2"),pedirVal("Ingrese la clave del producto 2"), pedirF("Ingrese el precio unitario del producto 2"), pedirB("Ingrese la cantidad del producto 2"));
      //Llenado detalle 3
      Detalle detalle3=new Detalle(pedirVal("Ingrese el detalle del producto 3"),pedirVal("Ingrese la clave del producto 3"), pedirF("Ingrese el precio unitario del producto 3"), pedirB("Ingrese la cantidad del producto 3"));
      //Llenado direccion empresa
      Direccion dirEm = new Direccion(pedirVal("Ingrese la calle de la empresa"),pedirL("Ingresar numero de la empresa"),pedirVal("Ingrese la colonia de la empresa"),pedirVal("Ingrese la ciudad de la empresa"),pedirL("Ingresar el codigo postal de la empresa"));
      //Llenado datos empresa
      Empresa emp= new Empresa(pedirVal("Ingrese el nombre de la empresa"), dirEm);
      //Llenado factura
      Factura f1= new Factura(detalle1,detalle2,detalle3,pedirSh("Ingrese el folio de la factura"));
      f1.calcularSubtotal();
      f1.calcularIva();
      f1.calcularTotal();
      System.out.println(f1.calcularTotal());
      System.out.println(f1);
   }
   //Pide String
    public static String pedirVal(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      String val=s.nextLine();
      return val;
   }
   //Pide float
    public static float pedirF(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      float val=s.nextFloat();
      return val;
   }
   //Pide byte
    public static byte pedirB(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      byte val=s.nextByte();
      return val;
   }
   //Pide long
   public static long pedirL(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      long val=s.nextLong();
      return val;
   }
   //Pide short
   public static short pedirSh(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      short val=s.nextShort();
      return val;
   }
   
  }