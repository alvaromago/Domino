package es.studium.Domino;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Partida extends Frame
{
	private static final long serialVersionUID = 1L;
	
	String jugador1, jugador2, jugador3, jugador4;
	Image tablero;
	int ronda = 0;
	Image f00, f01, f02, f03, f04, f05, f06;
	Image f11, f12, f13, f14, f15, f16, f22, f23, f24, f25, f26;
	Image f33, f34, f35, f36, f44, f45, f46, f55, f56, f66;
	Toolkit herramienta;
	
	Partida()
	{
		setTitle("Jugando...");
		setSize(1300, 800);
		setBackground(new Color(171, 139, 98));
		herramienta = getToolkit();
		tablero = herramienta.getImage("./imagesMenus/Tablero.jpg");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		// Dibujamos el tablero
		g.drawImage(tablero, 0, 0, 1300, 800, this);
		// Dibujamos el n�mero de turnos
		Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("Turno: " + ronda, 25, 70);
		g.drawString(nombreJugador1(jugador1), 600, 65);
		g.drawString(nombreJugador2(jugador2), 40, 200);
		g.drawString(nombreJugador3(jugador3), 1170, 200);
		g.drawString(nombreJugador4(jugador4), 600, 770);
		
		
	}
	
	public void cargarCartas() 
	{
		f00 = herramienta.getImage("./imagesFichas/00.png");
		f01 = herramienta.getImage("./imagesFichas/01.png");
		f02 = herramienta.getImage("./imagesFichas/02.png");
		f03 = herramienta.getImage("./imagesFichas/03.png");
		f04 = herramienta.getImage("./imagesFichas/04.png");
		f05 = herramienta.getImage("./imagesFichas/05.png");
		f06 = herramienta.getImage("./imagesFichas/06.png");
		f11 = herramienta.getImage("./imagesFichas/11.png");
		f12 = herramienta.getImage("./imagesFichas/12.png");
		f13 = herramienta.getImage("./imagesFichas/13.png");
		f14 = herramienta.getImage("./imagesFichas/14.png");
		f15 = herramienta.getImage("./imagesFichas/15.png");
		f16 = herramienta.getImage("./imagesFichas/16.png");
		f22 = herramienta.getImage("./imagesFichas/22.png");
		f23 = herramienta.getImage("./imagesFichas/23.png");
		f24 = herramienta.getImage("./imagesFichas/24.png");
		f25 = herramienta.getImage("./imagesFichas/25.png");
		f26 = herramienta.getImage("./imagesFichas/26.png");
		f33 = herramienta.getImage("./imagesFichas/33.png");
		f34 = herramienta.getImage("./imagesFichas/34.png");
		f35 = herramienta.getImage("./imagesFichas/35.png");
		f36 = herramienta.getImage("./imagesFichas/36.png");
		f44 = herramienta.getImage("./imagesFichas/44.png");
		f45 = herramienta.getImage("./imagesFichas/45.png");
		f46 = herramienta.getImage("./imagesFichas/46.png");
		f55 = herramienta.getImage("./imagesFichas/55.png");
		f56 = herramienta.getImage("./imagesFichas/56.png");
		f66 = herramienta.getImage("./imagesFichas/66.png");
	}
	
	public String nombreJugador1(String nombrejugador1)
	{
		jugador1 = nombrejugador1;
		return jugador1;
	}
	
	public String nombreJugador2(String nombrejugador2)
	{
		jugador2 = nombrejugador2;
		return jugador2;
	}
	
	public String nombreJugador3(String nombrejugador3)
	{
		jugador3 = nombrejugador3;
		return jugador3;
	}
	
	public String nombreJugador4(String nombrejugador4)
	{
		jugador4 = nombrejugador4;
		return jugador4;
	}
	
	public void numTurno()
	{
		ronda++;
		repaint();
	}
}
