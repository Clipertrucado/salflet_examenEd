package dtos;

import java.time.LocalDateTime;

public class pacienteDto {

	int idPaciente;
	String nombrePaciente = "aaaaaa";
	String dniPaciente = "aaaaaa";
	LocalDateTime fechaAltaPaciente;
	boolean validacionPaciente = false;

	/**
	 *constructor sin parametros
	 */
	public pacienteDto() {
		super();
	}

	/**
	 *metos get y set
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getDniPaciente() {
		return dniPaciente;
	}

	public void setDniPaciente(String dniPaciente) {
		this.dniPaciente = dniPaciente;
	}

	public LocalDateTime getFechaAltaPaciente() {
		return fechaAltaPaciente;
	}

	public void setFechaAltaPaciente(LocalDateTime fechaAltaPaciente) {
		this.fechaAltaPaciente = fechaAltaPaciente;
	}

	public boolean isValidacionPaciente() {
		return validacionPaciente;
	}

	public void setValidacionPaciente(boolean validacionPaciente) {
		this.validacionPaciente = validacionPaciente;
	}

	/**
	 *constructor por parametros
	 */
	public pacienteDto(int idPaciente, String nombrePaciente, String dniPaciente, LocalDateTime fechaAltaPaciente,
			String apellidoCliente) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente.concat(", ").concat(apellidoCliente);
		this.dniPaciente = dniPaciente;
		this.fechaAltaPaciente = fechaAltaPaciente;

	}

	/**
	 *metodo al que llamaremso para mostrar el contenido del paciente
	 */
	@Override
	public String toString() {
		return "pacienteDto [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", dniPaciente="
				+ dniPaciente + ", fechaAltaPaciente=" + fechaAltaPaciente + ", validacionPaciente="
				+ validacionPaciente + "]";
	}

}
