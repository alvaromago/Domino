package es.studium.Domino;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;
	
	Image fondo, nuevaPartida, ayuda, ranking, salir;
	Toolkit herramienta;
	
	public MenuPrincipal()
	{
		setTitle("Dominó");
		setSize(1000, 600);
		// Activamos la herramienta
		herramienta = getToolkit();
		fondo = herramienta.getImage("./imagesMenus/Inicio.jpg");
		nuevaPartida = herramienta.getImage("./imagesMenus/NuevaPartida G.png");
		ranking = herramienta.getImage("./imagesMenus/Ranking G.png");
		ayuda = herramienta.getImage("./imagesMenus/Ayuda G.png");
		salir = herramienta.getImage("./imagesMenus/Salir.png");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		// Dibujar el fondo
		g.drawImage(fondo, 0, 0, 1000, 600, this);
		// Dibujar botones
		g.drawImage(nuevaPartida, 400, 150, 225, 65, this);
		g.drawImage(ranking, 400, 270, 225, 65, this);
		g.drawImage(ayuda, 400, 390, 225, 65, this);
		g.drawImage(salir, 720, 390, 100, 100, this);
	}
}
