package es.studium.Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Modelo
{
	List<String> fichas = generarFichas();

	List<String> crearPartida(int numeroJugadores)
	{
		Collections.shuffle(fichas); // Mezclar las fichas

		List<List<String>> jugadores = repartirFichas(fichas, numeroJugadores, 7);

		for (int i = 0; i < numeroJugadores; i++)
		{
			System.out.println(numeroJugadores);
			fichas.add("Jugador " + (i + 1) + ": " + jugadores.get(i));
		}
		return fichas;
	}

	List<String> generarFichas()
	{
		List<String> fichas = new ArrayList<>();
		for (int i = 0; i <= 6; i++)
		{
			for (int j = i; j <= 6; j++)
			{
				String ficha = i + ":" + j;
				fichas.add(ficha);
			}
		}
		return fichas;
	}

	List<List<String>> repartirFichas(List<String> fichas, int numeroJugadores, int fichasPorJugador)
	{
		List<List<String>> jugadores = new ArrayList<>();
		List<String> pozo = new ArrayList<>();

		for (int i = 0; i < numeroJugadores; i++)
		{
			List<String> mano = new ArrayList<>();

			for (int j = 0; j < fichasPorJugador; j++)
			{
				System.out.println(j);
				mano.add(fichas.remove(0));
			}
			jugadores.add(mano);
			
		}

		return jugadores;
	}
}
