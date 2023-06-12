package es.studium.Domino;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

public class Partida extends Frame
{
	private static final long serialVersionUID = 1L;
	
	String jugador1, jugador2, jugador3, jugador4;
	Image tablero;
	int ronda = 1;
	Image f00, f01, f02, f03, f04, f05, f06;
	Image f11, f12, f13, f14, f15, f16, f22, f23, f24, f25, f26;
	Image f33, f34, f35, f36, f44, f45, f46, f55, f56, f66;
	
	Image ficha11;
	Toolkit herramienta;
	List<String> manoJ1;
	List<String> manoJ2;
	List<String> manoJ3;
	List<String> manoJ4;
	
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
		cargarFichas();
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
		
		//if(manoJ1.get(0).equals("f00"))
		//{
			ficha11 = f00;
		//}
		// Dibujar Fichas Jugador 1
		if(ronda==1)
		{
			// Mostrar Fichas 1				
			g.drawImage(ficha11, 490, 73, null);
			g.drawImage(f46, 535, 73, null);
			g.drawImage(f46, 580, 73, null);
			g.drawImage(f46, 625, 73, null);
			g.drawImage(f46, 670, 73, null);
			g.drawImage(f46, 715, 73, null);
			g.drawImage(f46, 760, 73, null);
		
			// Mostrar Ocultas Fichas Resto
		}
		
	}
	
	public void cargarFichas() 
	{
		f00 = herramienta.getImage("./imagesFichas/f00.png");
		f01 = herramienta.getImage("./imagesFichas/f01.png");
		f02 = herramienta.getImage("./imagesFichas/f02.png");
		f03 = herramienta.getImage("./imagesFichas/f03.png");
		f04 = herramienta.getImage("./imagesFichas/f04.png");
		f05 = herramienta.getImage("./imagesFichas/f05.png");
		f06 = herramienta.getImage("./imagesFichas/f06.png");
		f11 = herramienta.getImage("./imagesFichas/f11.png");
		f12 = herramienta.getImage("./imagesFichas/f12.png");
		f13 = herramienta.getImage("./imagesFichas/f13.png");
		f14 = herramienta.getImage("./imagesFichas/f14.png");
		f15 = herramienta.getImage("./imagesFichas/f15.png");
		f16 = herramienta.getImage("./imagesFichas/f16.png");
		f22 = herramienta.getImage("./imagesFichas/f22.png");
		f23 = herramienta.getImage("./imagesFichas/f23.png");
		f24 = herramienta.getImage("./imagesFichas/f24.png");
		f25 = herramienta.getImage("./imagesFichas/f25.png");
		f26 = herramienta.getImage("./imagesFichas/f26.png");
		f33 = herramienta.getImage("./imagesFichas/f33.png");
		f34 = herramienta.getImage("./imagesFichas/f34.png");
		f35 = herramienta.getImage("./imagesFichas/f35.png");
		f36 = herramienta.getImage("./imagesFichas/f36.png");
		f44 = herramienta.getImage("./imagesFichas/f44.png");
		f45 = herramienta.getImage("./imagesFichas/f45.png");
		f46 = herramienta.getImage("./imagesFichas/f46.png");
		f55 = herramienta.getImage("./imagesFichas/f55.png");
		f56 = herramienta.getImage("./imagesFichas/f56.png");
		f66 = herramienta.getImage("./imagesFichas/f66.png");
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
	public void leerJ1(List<String> m1)
	{
		manoJ1 = m1;
	}
}
