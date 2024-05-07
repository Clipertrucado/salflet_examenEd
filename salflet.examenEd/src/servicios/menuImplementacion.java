package servicios;

import java.util.Scanner;

/**
 *interfaz que contendra la cabecera de los metodos del menu
 */
public class menuImplementacion implements menuInterfaz{
	
	Scanner sc = new Scanner(System.in);
	@Override
	public int menuSeleccion() {
		
		System.out.println("--------------");
		System.out.println("     MENU");
		System.out.println("--------------");
		System.out.println("1. Empleado");
		System.out.println("2. Cliente");
		System.out.println("0. Cerrar");
		System.out.println("--------------");
		
		return sc.nextInt();
	}
	@Override
	public int menuEpleadoSeleccion() {
		System.out.println("-------------------");
		System.out.println("     EMPLEADO");
		System.out.println("-------------------");
		System.out.println("1. Validar cliente");
		System.out.println("2. Imprimir cita");
		System.out.println("0. Cerrar");
		System.out.println("-------------------");
		
		return sc.nextInt();
	}
	@Override
	public int menuClienteSeleccion() {
		System.out.println("-------------------");
		System.out.println("      CLIENTE");
		System.out.println("-------------------");
		System.out.println("1. Registro cliente");
		System.out.println("2. Solicitud cita");
		System.out.println("3. Consultar citas");
		System.out.println("0. Cerrar");
		System.out.println("-------------------");
		
		return sc.nextInt();
	}

}
