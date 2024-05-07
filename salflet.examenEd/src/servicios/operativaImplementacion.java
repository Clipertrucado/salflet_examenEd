package servicios;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import dtos.citadto;
import dtos.pacienteDto;

/**
 * contiene la logica de los methodos declarados en la interfaz
 */
public class operativaImplementacion implements operativaInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void registroCliente() {

		pacienteDto paciente = crearPaciente();

		controladores.inicioAplicacion.listaPaciente.add(paciente);
	}

	/**
	 * encargado de pedir los datos del paciente
	 */
	private pacienteDto crearPaciente() {

		System.out.print("Ingresa el numero del DNI del paciente: ");
		int dniNumero = sc.nextInt();

		System.out.print("Ingresa la letra del DNI del paciente: ");
		String dniLetra = sc.next();

		String dni = dniNumero + dniLetra;

		System.out.println("Ingresa el nombre del paciente: ");
		String nombre = sc.next();

		System.out.println("Ingresa el apellido del paciente: ");
		String apellido = sc.next();

		LocalDateTime fechaAlta = LocalDateTime.now();

		pacienteDto paciente = new pacienteDto(generarId(), nombre, dni, fechaAlta, apellido);

		return paciente;
	}

	/**
	 * encargado de generar el id para el paciente
	 */
	private int generarId() {

		int id = 1;

		for (var paciente : controladores.inicioAplicacion.listaPaciente) {

			if (paciente.getIdPaciente() == id) {

				id = id + 1;

			}

		}

		return id;
	}

	@Override
	public void solicitudCita() {

		System.out.print("Ingresa el DNI del paciente: ");
		String dniBuscar = sc.next();

		for (var paciente : controladores.inicioAplicacion.listaPaciente) {

			if (paciente.getDniPaciente().equals(dniBuscar) && paciente.isValidacionPaciente() == true) {

				citadto cita = new citadto();
				boolean cerrarEspecialidades = true;

				do {

					int especialidades = menuEspecialidades();

					switch (especialidades) {
					case 1: {

						System.out.println("Ingresa la fecha de la cita(dd/MM/yyyy): ");

						String fechaString = sc.next();
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

						try {
							Date fecha = formato.parse(fechaString);

							cita.setFechaCita(fecha);

						} catch (ParseException e) {
							System.out.println("fecha introducida incorrecta");
						}

						cita.setEspecialidadCita("Psicología");
						cita.setIdCita(generarIdCita());
						controladores.inicioAplicacion.listaCita.add(cita);
						System.out.println(cita.toString());
						cerrarEspecialidades = false;
						break;
					}
					case 2: {
						System.out.println("Ingresa la fecha de la cita(dd/MM/yyyy): ");

						String fechaString = sc.next();
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

						try {
							Date fecha = formato.parse(fechaString);

							cita.setFechaCita(fecha);

						} catch (ParseException e) {
							System.out.println("fecha introducida incorrecta");
						}

						cita.setEspecialidadCita("Traumatología");
						cita.setIdCita(generarIdCita());
						controladores.inicioAplicacion.listaCita.add(cita);
						System.out.println(cita.toString());
						cerrarEspecialidades = false;

						break;
					}
					case 3: {
						System.out.println("Ingresa la fecha de la cita(dd/MM/yyyy): ");

						String fechaString = sc.next();
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

						try {
							Date fecha = formato.parse(fechaString);

							cita.setFechaCita(fecha);

						} catch (ParseException e) {
							System.out.println("fecha introducida incorrecta");
						}

						cita.setEspecialidadCita("Fisioterapia");
						cita.setIdCita(generarIdCita());
						controladores.inicioAplicacion.listaCita.add(cita);
						System.out.println(cita.toString());
						cerrarEspecialidades = false;

						break;
					}
					}

				} while (cerrarEspecialidades);

			}

		}
	}

	/**
	 * encargado de mostrar y pedir la especialidad
	 */
	private int menuEspecialidades() {

		System.out.println("-------------------");
		System.out.println("  ESPECIALIDADES");
		System.out.println("-------------------");
		System.out.println("1. Psicología");
		System.out.println("2. Traumatología");
		System.out.println("3. Fisioterapia");
		System.out.println("-------------------");

		return sc.nextInt();
	}

	/*
	 * private Date pedirFecha() { System.out.
	 * println("Ingresa la fecha y hora que desea la cita(dd/MM/yyyy hh:mm): ");
	 * 
	 * String fechaString = sc.next(); SimpleDateFormat formato = new
	 * SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	 * 
	 * try { Date fecha = formato.parse(fechaString);
	 * 
	 * return fecha;
	 * 
	 * } catch (ParseException e) {
	 * System.out.println("fecha introducida incorrecta"); } return null; }
	 */
	/**
	 * encargado de validar el estado de una cita
	 */
	private int generarIdCita() {

		int id = 1;

		for (var paciente : controladores.inicioAplicacion.listaCita) {

			if (paciente.getIdCita() == id) {

				id = id + 1;

			}

		}

		return id;
	}

	@Override
	public void validarPaciente() {
		for (var paciente : controladores.inicioAplicacion.listaPaciente) {
			if (paciente.isValidacionPaciente() == false) {
				System.out.println(paciente.getDniPaciente().concat(" - ").concat(paciente.getNombrePaciente()));
			}

		}

		System.out.println("ingresa el DNI del usuario que desea validar:");
		String dni = sc.next();

		boolean encontrar = false;
		for (var paciente : controladores.inicioAplicacion.listaPaciente) {
			if (paciente.isValidacionPaciente() == false && paciente.getDniPaciente().equals(dni)) {
				paciente.setValidacionPaciente(true);
				encontrar = true;
			}

		}
		if (encontrar) {
			System.out.println("El paciente se valido correctamente");
		} else {
			System.out.println("Paciente no encontrado o ya validado");
		}
	}

}
