package es.studium.Domino;

import java.util.Random;

public class Modelo
{
	static String[] mano1 = new String[7];
	static String[] mano2 = new String[7];
	static String[] mano3 = new String[7];
	static String[] mano4 = new String[7];
	static String[] allDomino =
	{ "00", "01", "02", "03", "04", "05", "06", "11", "12", "13", "14", "15", "16", "22", "23", "24", "25", "26", "33",
			"34", "35", "36", "44", "45", "46", "55", "56", "66" };
	static String[] pozo;
	static int turnos;

	static int repartirFichas()
	{
		Random random = new Random();
		int numAleatorio = random.nextInt(allDomino.length);
		return numAleatorio;
	}
}
