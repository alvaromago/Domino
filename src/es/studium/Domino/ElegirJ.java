package es.studium.Domino;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

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
	Image aceptar;
	Toolkit herramienta;
	
	ElegirJ()
	{
		setSize(250, 350);
		setTitle("Eligiendo jugadores...");
		// Activamos la herramienta
		herramienta = getToolkit();
		aceptar = herramienta.getImage("Aceptar.png");
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
		// Dibujar botones
		g.drawImage(aceptar, 50, 300, 150, 35, this);
	}
}
