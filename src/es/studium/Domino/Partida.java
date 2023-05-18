package es.studium.Domino;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class Partida extends Frame
{
	private static final long serialVersionUID = 1L;
	
	Dialog dlgElegirJ = new Dialog(this, "Elegir Jugadores", true);
	Dialog dlg2J = new Dialog(this, "Dos Jugadores", true);
	Dialog dlg3J = new Dialog(this, "Tres Jugadores", true);
	Dialog dlg4Jugadores = new Dialog(this, "Cuatro Jugadores", true);
	Choice choJugadores = new Choice();
	Label lblJ1 = new Label("Nombre Jugador 1");
	Label lblJ2 = new Label("Nombre Jugador 2");
	Label lblJ3 = new Label("Nombre Jugador 3");
	Label lblJ4 = new Label("Nombre Jugador 4");
	TextField txtJ1 = new TextField(15);
	TextField txtJ2 = new TextField(15);
	TextField txtJ3 = new TextField(15);
	TextField txtJ4 = new TextField(15);
	
	Partida()
	{
		setTitle("Jugando...");
		setSize(1000, 600);
		setResizable(false);
		setBackground(new Color(171, 139, 98)); // Para el choice
		setLocationRelativeTo(null);
		setVisible(false);
		
		choJugadores.add("Número de jugadores...");
		choJugadores.add("Dos jugadores");
		choJugadores.add("Tres jugadores");
		choJugadores.add("Cuatro jugadores");
	}
	
	public void paint(Graphics g)
	{
		Color color1 = new Color(181, 230, 29);
		g.setColor(color1);
		g.drawRect(20, 120, 80, 25);
	}
}
