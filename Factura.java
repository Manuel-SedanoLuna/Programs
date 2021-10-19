import java.io.*;
import java.util.*;
import java.text.*;


class Cliente{
   private Nombre nombre;
   private Direccion direccion;
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
   private long clave;
   private float precU;
   private byte cant;
  
   public Detalle(String deta, long clave, float precU, byte cant){
      setDeta(deta);
      setClave(clave);
      setPrecU(precU);
      setCant(cant);
   }
   
   public void setDeta(String deta){
      this.deta=deta;
   }
    
    public void setClave(long clave){
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
    
   public long getClave(){
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
   private float descuento;
    
   public Factura (Detalle detalle1, Detalle detalle2, Detalle detalle3, short folio, float descuento){
      setDetalle1(detalle1);
      setDetalle2(detalle2);
      setDetalle3(detalle3);
      setFolio(folio);
      setDescuento(descuento);
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
   
   public void setDescuento(float descuento){
      this.descuento=descuento;
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
   
   public float getDescuento(){
      return descuento;
   }

   public double calcularSubtotal(){
      return detalle1.calcularTP()+detalle2.calcularTP()+detalle3.calcularTP()-descuento;
   }
   
   public double calcularIva(){
     return calcularSubtotal()*0.16;
   }
   
   public double calcularTotal(){
      return calcularSubtotal()+calcularIva();
   }
    public String toString (){
     return  "";

   }

}


class Principal{
 public static void main (String[] args){
      

      //Llenado del nombre
      System.out.println("------DATOS DEL CLIENTE------");
      Nombre nombre1 = new Nombre(pedirVal("Ingrese su nombre"),pedirVal("Ingrese su primer apellido"),pedirVal("Ingrese su segundo apellido"));

      //Llenado de la dirección
      Direccion dirDom1 = new Direccion(pedirVal("Ingrese la calle del cliente"),pedirL("Ingresar numero de domicilio del cliente"),pedirVal("Ingrese la colonia del cliente"),pedirVal("Ingrese la ciudad del cliente"),pedirL("Ingresar el codigo postal del cliente"));

      //Llenado de la clase Cliente
      Cliente cliente1 = new Cliente(nombre1,dirDom1, pedirVal("Ingrese el RFC del cliente"));
      System.out.println("\n------DATOS DE LA EMPRESA------");
      //Llenado direccion empresa
      Direccion dirEm = new Direccion(pedirVal("Ingrese la calle de la empresa"),pedirL("Ingresar numero de la empresa"),pedirVal("Ingrese la colonia de la empresa"),pedirVal("Ingrese la ciudad de la empresa"),pedirL("Ingresar el codigo postal de la empresa"));
      //Llenado datos empresa
      Empresa emp= new Empresa(pedirVal("Ingrese el nombre de la empresa"), dirEm);
      System.out.println("\n------DATOS DE LOS PRODUCTOS------");
      
      long claveN=pedirL("Ingrese la clave del producto 1");
      //Llenado detalle 1
      Detalle detalle1=new Detalle(pedirVal("Ingrese la descripción del producto 1"),claveN, pedirF("Ingrese el precio unitario del producto 1"), pedirB("Ingrese la cantidad del producto 1"));
      claveN=pedirL("Ingrese la clave del producto 2");
      while(detalle1.getClave()==claveN){
         claveN=pedirL("Codigo similar al primer producto, ingrese uno nuevo");
      }
      //Llenado detalle 2
      Detalle detalle2=new Detalle(pedirVal("Ingrese la descripción del producto 2"),claveN, pedirF("Ingrese el precio unitario del producto 2"), pedirB("Ingrese la cantidad del producto 2"));
      claveN=pedirL("Ingrese la clave del producto 3");
      while(claveN==detalle2.getClave()|claveN==detalle1.getClave()){
         claveN=pedirL("Codigo similar productos anteriores, ingrese uno nuevo");
      }
      //Llenado detalle 3
      Detalle detalle3=new Detalle(pedirVal("Ingrese la descripción del producto 3"),claveN, pedirF("Ingrese el precio unitario del producto 3"), pedirB("Ingrese la cantidad del producto 3"));
      /*//Llenado detalle 1
      Detalle detalle1=new Detalle(pedirVal("Ingrese la descripción del producto 1"),pedirL("Ingrese la clave del producto 1"), pedirF("Ingrese el precio unitario del producto 1"), pedirB("Ingrese la cantidad del producto 1"));
      //Llenado detalle 2
      Detalle detalle2=new Detalle(pedirVal("Ingrese la descripción del producto 2"),pedirL("Ingrese la clave del producto 2"), pedirF("Ingrese el precio unitario del producto 2"), pedirB("Ingrese la cantidad del producto 2"));
      //Llenado detalle 3
      Detalle detalle3=new Detalle(pedirVal("Ingrese la descripción del producto 3"),pedirL("Ingrese la clave del producto 3"), pedirF("Ingrese el precio unitario del producto 3"), pedirB("Ingrese la cantidad del producto 3"));
      */
      float descuento=pedirF("Ingrese la cantidad ($) de descuento en su totalidad. En caso de no haber, ingrese 0");
    
      //Llenado factura
      Factura f1= new Factura(detalle1,detalle2,detalle3,pedirSh("Ingrese el folio de la factura"),descuento);
      
      //Impresión de factura
      imprimirFactura(f1,cliente1,emp,detalle1,detalle2,detalle3);
      
  
   }
   //Imprime factura
   public static void imprimirFactura(Factura f1,Cliente cliente1, Empresa emp, Detalle detalle1, Detalle detalle2, Detalle detalle3){
      DecimalFormat y = new DecimalFormat("0.00");
      System.out.println("\n\nNúmero de factura: "+f1.getFolio());
      System.out.println("\nDatos del cliente:");
      System.out.println("RFC: "+cliente1.getRfc()+"\nNombre: "+cliente1.getNombre().toString()+"\nDomicilio: "+cliente1.getDireccion().toString());
      System.out.println("\nDatos de la empresa:"+"\nNombre de la empresa: "+emp.getNombre()+"\nDirección: "+emp.getDireccion());
      System.out.println("\nProductos comprados:\n");
      System.out.printf("%-10s %-8s %-40s %20s %12s","Cantidad","Clave","Descripcion","Precio Unitario","Importe");
      System.out.println("");
      System.out.printf("%-10s %-8s %-40.38s %20s %12s",detalle1.getCant(),detalle1.getClave(),detalle1.getDeta(),"$"+y.format(detalle1.getPrecU()),"$"+y.format(detalle1.getPrecU()*detalle1.getCant()));
      System.out.println("");
      System.out.printf("%-10s %-8s %-40.38s %20s %12s",detalle2.getCant(),detalle2.getClave(),detalle2.getDeta(),"$"+y.format(detalle2.getPrecU()),"$"+y.format(detalle2.getPrecU()*detalle2.getCant()));
      System.out.println("");
      System.out.printf("%-10s %-8s %-40.38s %20s %12s",detalle3.getCant(),detalle3.getClave(),detalle3.getDeta(),"$"+y.format(detalle3.getPrecU()),"$"+y.format(detalle3.getPrecU()*detalle3.getCant()));
      System.out.println("\n\n");
      System.out.printf("%75s %12s","Descuento","$"+y.format(f1.getDescuento()));
      System.out.println("");
      System.out.printf("%75s %12s","Subtotal","$"+y.format(f1.calcularSubtotal()));
      System.out.println("");
      System.out.printf("%75s %12s","IVA","$"+y.format(f1.calcularIva()));
      System.out.println("");
      System.out.printf("%75s %12s","Total","$"+y.format(f1.calcularTotal()));      
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
      boolean resultado;
      String val;
      do{        
         val=s.next();
         try {                       //checar si es numerico
            Float.parseFloat(val);
            resultado = true;
         } catch (NumberFormatException excepcion) {
            resultado = false;   
         }
         if(resultado==false)
            System.out.println("El valor ingresado debe ser numerico\n");
      }while(resultado==false);
      float valor = Float.parseFloat(val);
      return valor;
   }
   //Pide byte
   public static byte pedirB(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      boolean resultado;
      String val;
      do{        
         val=s.next();
         try {                       //checar si es numerico
            Byte.parseByte(val);
            resultado = true;
         } catch (NumberFormatException excepcion) {
            resultado = false;   
         }
         if(resultado==false)
            System.out.println("El valor ingresado debe ser numerico\n");
      }while(resultado==false);
      byte valor = Byte.parseByte(val);
      return valor;
   }
      //Pide long
   public static long pedirL(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      boolean resultado;
      String val;
      do{        
         val=s.next();
         try {                       //checar si es numerico
            Long.parseLong(val);
            resultado = true;
         } catch (NumberFormatException excepcion) {
            resultado = false;   
         }
         if(resultado==false)
            System.out.println("El valor ingresado debe ser numerico\n");
      }while(resultado==false);
      long valor = Long.parseLong(val);
      return valor;
   }
   //Pide short
   public static short pedirSh(String mensaje){
      Scanner s=new Scanner(System.in);
      System.out.println(mensaje);
      boolean resultado;
      String val;
      do{        
         val=s.next();
         try {                       //checar si es numerico
            Short.parseShort(val);
            resultado = true;
         } catch (NumberFormatException excepcion) {
            resultado = false;   
         }
         if(resultado==false)
            System.out.println("El valor ingresado debe ser numerico\n");
      }while(resultado==false);
      short valor = Short.parseShort(val);
      return valor;
   }   
  }