package com.github.sanchezih.util.math;

/**
 * 
 * @author ihsanch
 *
 */
public class Matematica {

	/**
	 * Metodo que recibe un valor x y un valor p. El p% de x es sumado a x y el
	 * resultado es retornado.
	 * 
	 * @param x
	 * @param p
	 * @return
	 */
	public static double sumarPorcentaje(double x, double p) {
		return x + calcularPorcentaje(x, p);
	}

	/**
	 * Metodo que recibe un valor x y un valor p. El x% de p es retornado.
	 * 
	 * @param x
	 * @param b
	 * @return
	 */
	public static double calcularPorcentaje(double x, double p) {
		return (x * p) / 100;
	}

	/**
	 * 
	 * @param acu
	 * @param total
	 * @return
	 */
	public static double promedio(double acu, double total) {
		double porc = 0;
		if (total > 0) {
			porc = acu / total;
		}
		return porc;
	}

	/**
	 * 
	 * @param casos
	 * @param total
	 * @return
	 */
	public static double porcentaje(int casos, int total) {
		return promedio(casos, total);
	}
}
