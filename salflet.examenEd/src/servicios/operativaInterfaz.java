package servicios;

/**
 *interfaz que contendra la cabecera de los metodos de la operativa
 */
public interface operativaInterfaz {

	/**
	 *encargado del registro de nuevos pacientes
	 */
	public void registroCliente();
	
	/**
	 *encargado del registro de nuevas citas
	 */
	public void solicitudCita();

	/**
	 *encargado de validar el estado de un paciente
	 */
	public void validarPaciente();
	
	
}
