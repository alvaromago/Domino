package es.studium.Domino;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class ElegirJ extends Frame
{
	private static final long serialVersionUID = 1L;

	Choice choJugadores = new Choice();
	Label lblJ1 = new Label("Nombre Jugador 1");
	Label lblJ2 = new Label("Nombre Jugador 2");
	Label lblJ3 = new Label("Nombre Jugador 3");
	Label lblJ4 = new Label("Nombre Jugador 4");
	TextField txtJ1 = new TextField(15);
	TextField txtJ2 = new TextField(15);
	TextField txtJ3 = new TextField(15);
	TextField txtJ4 = new TextField(15);
	
	ElegirJ()
	{
		setSize(250, 350);
		setTitle("Eligiendo jugadores...");
		setBackground(new Color(171, 139, 98));
		setLayout(new FlowLayout());
		choJugadores.add("Número de jugadores...");
		choJugadores.add("Dos jugadores");
		choJugadores.add("Tres jugadores");
		choJugadores.add("Cuatro jugadores");
		this.add(choJugadores);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void paint(Graphics g)
	{
		Color color1 = new Color(181, 230, 29);
		g.setColor(color1);
		g.drawRect(50, 300, 150, 35);
	}
}
