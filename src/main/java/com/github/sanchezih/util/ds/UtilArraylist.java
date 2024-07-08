package com.github.sanchezih.util.ds;

import java.util.ArrayList;

/**
 * 
 * @author ihsanch
 *
 */
public class UtilArraylist {

	/**
	 * 
	 * @param lista
	 */
	public static void listarElementos(ArrayList<?> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
