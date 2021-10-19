//Proyecto Final
//Autores:
//
//José Manuel Sedano Luna-----621965
//Juan Pablo
package ProyectoFinalProgra.src;
import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AnalisisDeDatos {
    public static void main(String []args){
        int[] tamanoDatos = new int[2];
        String nombreArchivo = "evaluacion_respuestas.xlsx";
        String rutaArchivo = "C:\\Users\\Nayar\\Downloads\\UDEM\\" + nombreArchivo;
        AnalisisDeDatos.impresion(rutaArchivo);
        tamanoDatos = AnalisisDeDatos.tamaniodatos(rutaArchivo);
        System.out.println(tamanoDatos[0]);
        System.out.println(tamanoDatos[1]);

    }
    public static void impresion(String rutaArchivo) {
        try (FileInputStream file = new FileInputStream((rutaArchivo))) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                //se obtiene las celdas por fila
                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                int b = row.getRowNum();
                //se recorre cada celda
                int c = 0;
                while (cellIterator.hasNext()) {
                    // se obtiene la celda en específico y se la imprime
                    cell = cellIterator.next();
                    if (b > 0 && c < 15)
                        System.out.print(cell.getNumericCellValue() + " | ");
                    else
                        System.out.print(cell.getStringCellValue() + " | ");
                    c++;
                }
                System.out.println(" ");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
    public static int [] tamaniodatos(String rutaArchivo){
        int tamano[] = new int[2];
        try (FileInputStream file = new FileInputStream((rutaArchivo))) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            XSSFSheet sheet = worbook.getSheetAt(0);
            Row header = sheet.getRow(0);
            tamano[1]=sheet.getLastRowNum()-1;
            tamano[0]=header.getLastCellNum()-2;
            } catch (IOException e) {
                e.getMessage();
            }
        return tamano;
        }
    }
