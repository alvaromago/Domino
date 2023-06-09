package es.studium.Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Modelo
{
	List<String> fichas = generarFichas();
	Clip click;
	List<String> manoJ1;
	List<String> manoJ2;
	List<String> manoJ3;
	List<String> manoJ4;
	List<String> pozo;
	
	void reproducirSonido(String rutaSonido) {
	    try
	    {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(rutaSonido).getAbsoluteFile());
	        click = AudioSystem.getClip();
	        click.open(audioInputStream);
	        click.start();
	    } 
	    catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) 
	    {
	        e.printStackTrace();
	    }
	}

	List<String> crearPartida(int numeroJugadores)
	{
		Collections.shuffle(fichas); // Mezclar las fichas

		List<List<String>> jugadores = repartirFichas(fichas, numeroJugadores, 7);

		for (int i = 0; i < numeroJugadores; i++)
		{
			fichas.add("" + jugadores.get(i));
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
				String ficha = i + "" + j;
				fichas.add(ficha);
			}
		}
		return fichas;
	}

	List<List<String>> repartirFichas(List<String> fichas, int numeroJugadores, int fichasPorJugador)
	{
		List<List<String>> jugadores = new ArrayList<>();
		pozo = new ArrayList<>();

		for (int i = 0; i < numeroJugadores; i++)
	    {
	        List<String> mano = new ArrayList<>();
	        
	        for (int j = 0; j < fichasPorJugador; j++)
	        {
	            if (fichas.isEmpty()) {
	                break; // Si no hay más fichas, salimos del bucle interno
	            }
	            
	            mano.add(fichas.remove(0));
	        }
	        
	        jugadores.add(mano);
	    }

	    // Si quedan fichas sin repartir, al pozo
	    while (!fichas.isEmpty()) {
	        pozo.add(fichas.remove(0));
	    }

	    // Agregar el pozo a la lista de jugadores si es necesario
	    if (numeroJugadores < 4) {
	        jugadores.add(pozo);
	    }
	    
	    if(jugadores.size() == 3)
	    {	    	
	    	manoJ1 = jugadores.get(0);
	    	manoJ2 = jugadores.get(1);
	    }
	    else if(jugadores.size() == 4)
	    {
	    	manoJ1 = jugadores.get(0);
	    	manoJ2 = jugadores.get(1);
	    	manoJ3 = jugadores.get(2);
	    	manoJ4 = jugadores.get(3);
	    }
	    return jugadores;
	}

}
