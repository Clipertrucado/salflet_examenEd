package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *contiene la logica de los metod declarados en la interfaz
 */
public class ficheroImplementacion implements ficheroInterfaz{

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void imprimirFichero() {
		// TODO Auto-generated method stub
		
		System.out.println("introduce la fecha que desea imprimir(dd-MM-yyyy)");
		String textoFecha = sc.next();
		String[] fechaBucar = textoFecha.split("-");
		
		for (var citas : controladores.inicioAplicacion.listaCita) {
			if (fechaBucar[0].equals(citas.getFechaCita().getDate())){
				
			}
		}
		
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\csi23-salflet\\eclipse-workspace\\salflet.examenEd\\src\\fichero\\informe-"));

			bw.write("Hola, mundo!");
			bw.newLine();
			bw.write("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
