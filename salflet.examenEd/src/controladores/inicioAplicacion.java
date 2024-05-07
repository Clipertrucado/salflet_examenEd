package controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dtos.citadto;
import dtos.pacienteDto;
import servicios.ficheroImplementacion;
import servicios.ficheroInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;
import servicios.operativaImplementacion;
import servicios.operativaInterfaz;

/**
 *clase principal de la aplicacion
 */
public class inicioAplicacion {

	public static List<pacienteDto> listaPaciente = new ArrayList<pacienteDto>();
	public static List<citadto> listaCita = new ArrayList<citadto>();
	
	/**
	 *metodo que contine el flujo principal 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idPaciente = 1;
		String nombrePaciente = "ser";
		String dniPaciente = "1234V";
		LocalDateTime fechaAltaPaciente = LocalDateTime.now();
		boolean validacionPaciente = true;
		
		pacienteDto paciente = new pacienteDto(idPaciente, nombrePaciente, dniPaciente, fechaAltaPaciente, dniPaciente);
		paciente.setValidacionPaciente(true);
		listaPaciente.add(paciente);
		
		
		
		
		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz oi = new operativaImplementacion();
		ficheroInterfaz fi = new ficheroImplementacion();
		
		boolean cerrar = true;
		
		do {
			
			int seleccion = mi.menuSeleccion();
			
			switch (seleccion) {
				case 0: {
					cerrar = false;
					break;
					}
				case 1: {
				
					boolean cerrarEmpleado = true;
					
					do {
						int Empleado = mi.menuEpleadoSeleccion();
						
						
						switch (Empleado) {
							case 0: {
								cerrarEmpleado = false;
								break;
								}
							case 1: {
								oi.validarPaciente();
								break;
							}
							case 2: {
								for (var cita : listaCita) {
									System.out.println(cita.toString());
								}
								break;
							}
						}

					} while (cerrarEmpleado);
					
					break;
				}
				
				case 2: {
					boolean cerrarCliente = true;
					do {
						
						int cliente = mi.menuClienteSeleccion();
						
						switch (cliente) {
							case 0: {
								cerrarCliente = false;
								break;
								}
							case 1: {
								oi.registroCliente();
								break;
							}
							case 2: {
								oi.solicitudCita();
								break;
							}
						}

					} while (cerrarCliente);
					
				break;
				}
			}

		} while (cerrar);
	}
}
