package dtos;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *clase que usaremos para crear nuestas citas
 */
public class citadto {

	int idCita;
	String EspecialidadCita = "aaaaa";
	Date fechaCita;
	
	/**
	 *metos get y set
	 */
	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getEspecialidadCita() {
		return EspecialidadCita;
	}

	public void setEspecialidadCita(String especialidadCita) {
		EspecialidadCita = especialidadCita;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	/**
	 *constructor por parametros
	 */
	public citadto(int idCita, String especialidadCita, Date fechaCita) {
		super();
		this.idCita = idCita;
		EspecialidadCita = especialidadCita;
		this.fechaCita = fechaCita;
	}

	/**
	 *constructor sin parametros
	 */
	public citadto() {
		super();
	}
	
	/**
	 *metodo al que llamaremso para mostrar el contenido de la cita
	 */
	@Override
	public String toString() {
		return "citadto [idCita=" + idCita + ", EspecialidadCita=" + EspecialidadCita + ", fechaCita=" + fechaCita
				+ "]";
	}
	
	
}
