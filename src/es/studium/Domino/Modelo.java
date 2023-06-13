package es.studium.Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.TextArea;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo
{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/diseniojuego";
	String login = "userDomino"; // Usuario MySQL
	String password = "domino"; // Clave correspondiente
	String sentencia = "";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	
	Modelo()
	{
		connection = this.conectar();
	}
	
	List<String> fichas = generarFichas();
	Clip click;
	List<String> manoJ1;
	List<String> manoJ2;
	List<String> manoJ3;
	List<String> manoJ4;
	List<String> pozo;
	
	public Connection conectar()
	{
		try
		{
			// Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			// Establecer la conexión con la BD
			return(DriverManager.getConnection(url, login, password));
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-" + cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-" + sqle.getMessage());
		}
		return null;
	}
	
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
	                break; // Si no hay m�s fichas, salimos del bucle interno
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

	public void rellenarRanking2(TextArea txaListado2)
	{
		String sentencia = "select nombreJugador, numTurno from jugadores where numJugadores = 2 order by 2;";
		try
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultado = statement.executeQuery(sentencia);
			while (resultado.next())
			{
				txaListado2.append(resultado.getString("nombreJugador") + " - ");
				txaListado2.append(resultado.getString("numTurno") + "\n");
			}
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 3-" + sqle.getMessage());
		} 
	}

	public void rellenarRanking3(TextArea txaListado3)
	{
		String sentencia = "select nombreJugador, numTurno from jugadores where numJugadores = 3 order by 2;";
		try
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultado = statement.executeQuery(sentencia);
			while (resultado.next())
			{
				txaListado3.append(resultado.getString("nombreJugador") + " - ");
				txaListado3.append(resultado.getString("numTurno") + "\n");
			}
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 4-" + sqle.getMessage());
		}		
	}

	public void rellenarRanking4(TextArea txaListado4)
	{
		String sentencia = "select nombreJugador, numTurno from jugadores where numJugadores = 4 order by 2;";
		try
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultado = statement.executeQuery(sentencia);
			while (resultado.next())
			{
				txaListado4.append(resultado.getString("nombreJugador") + " - ");
				txaListado4.append(resultado.getString("numTurno") + "\n");
			}
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 5-" + sqle.getMessage());
		}		
	}

}
