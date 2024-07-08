package com.github.sanchezih.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.sanchezih.util.Fecha;

public class FechaTest {

	@DisplayName("Validar ...")
	@Test
	public void test1() {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();

		Assertions.assertEquals(Fecha.hoy().toString(), formatter.format(date));
	}
}
