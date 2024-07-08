package com.github.sanchezih.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * Clase Fecha Java
 * 
 * @author ihsanch
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	/*----------------------------------------------------------------------------*/

	public Fecha() {
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/*----------------------------------------------------------------------------*/

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * Metodo que devuelve un numero que indica la diferencia de dias entre una
	 * fecha y hoy.
	 * 
	 * @return
	 */
	public long getCantidadDiasHastaHoy() {
		return ChronoUnit.DAYS.between(LocalDate.of(this.anio, this.mes, this.dia), LocalDate.now());
	}

	/**
	 * Metodo que devuelve la fecha de hoy.
	 * 
	 * @return
	 */
	public static Fecha hoy() {
		LocalDate currentDate = LocalDate.now();
		return new Fecha(currentDate.getDayOfMonth(), currentDate.getMonth().getValue(), currentDate.getYear());
	}

	/**
	 * Devuelve el anio actual en int
	 */
	public static int getAnioActual() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	/**
	 * Metodo toString para mostrar la fecha
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if (mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");
		sb.append(anio);
		return sb.toString();
	}

	/**
	 * 
	 * @param anio
	 * @return
	 */
	public static long aniosHastaHoy(int anio) {
		LocalDate pdate = LocalDate.of(anio, 01, 01);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(pdate, now);
		return diff.getYears();
	}

	/**
	 * Metodo que le suma una cantidad de dias a una fecha recibida como parametro
	 * 
	 * @return
	 */
	public Fecha sumarDias(int dias) {
		LocalDate res = LocalDate.of(this.getAnio(), this.getMes(), this.getDia()).plusDays(dias);
		return new Fecha(res.getDayOfMonth(), res.getMonth().getValue(), res.getYear());
	}

	/**
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return
	 */
	public static int diasTranscurridosEntreFechas(Fecha fecha1, Fecha fecha2) {
		return (int) ChronoUnit.DAYS.between(LocalDate.of(fecha1.anio, fecha1.mes, fecha1.dia),
				LocalDate.of(fecha2.anio, fecha2.mes, fecha2.dia));
	}

}