package io.doom.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DoomDatesPrinter {

	public static void main(String[] args) {
		
		new DoomDatesPrinter().print68Dates();
	}
	
	private void print68Dates() {
		
		Calendar calendario = new GregorianCalendar(1900, GregorianCalendar.JANUARY, 1);
		Calendar dataFinal = new GregorianCalendar(2100, GregorianCalendar.DECEMBER, 31);
		
		while( calendario.before(dataFinal) ) {
			
			int dia = calendario.get(Calendar.DAY_OF_MONTH);
			int mes = calendario.get(Calendar.MONTH) + 1;
			int ano = calendario.get(Calendar.YEAR);
			
			String milenioSeculo = String.valueOf(ano).substring(0,2);
			String anoSimple = String.valueOf(ano).substring(2,4);
			
			int sum = dia + mes + Integer.parseInt(milenioSeculo) + Integer.parseInt(anoSimple);
			
			if (sum == 68) {
			
				System.out.println(String.format("%04d-%02d-%02d ==> soma = %s", ano, mes, dia, sum));
			}
			
			calendario.add(Calendar.DAY_OF_MONTH, 1);
			
		}		
	}
}
