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
	Image f00, f01, f02, f03, f04, f05, f06, f11, f12, f13, f14, f15, f16, f22, f23, f24, f25, f26, f33, f34, f35, f36, f44, f45, f46, f55, f56, f66, fWhite;
	Image j11, j12, j13, j14, j15, j16, j17;
	Image j21, j22, j23, j24, j25, j26, j27;
	Image j31, j32, j33, j34, j35, j36, j37;
	Image j41, j42, j43, j44, j45, j46, j47;
	Image p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14;
	Toolkit herramienta;
	List<String> manoJ1;
	List<String> manoJ2;
	List<String> manoJ3;
	List<String> manoJ4;
	List<String> pozo;
	
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
        g.drawString("Pozo: ", 25, 700);
		g.drawString(nombreJugador1(jugador1), 600, 65);
		g.drawString(nombreJugador3(jugador3), 40, 200);
		g.drawString(nombreJugador4(jugador4), 1170, 200);
		g.drawString(nombreJugador2(jugador2), 600, 780);
		
		 													/*FICHAS JUGADOR 1*/
		// Ficha 1 Jugador 1
		if(manoJ1.get(0).equals("00"))
		{
			j11 = f00;
		}
		else if(manoJ1.get(0).equals("01"))
		{
			j11 = f01;
		}
		else if(manoJ1.get(0).equals("02"))
		{
			j11 = f02;
		}
		else if(manoJ1.get(0).equals("03"))
		{
			j11 = f03;
		}
		else if(manoJ1.get(0).equals("04"))
		{
			j11 = f04;
		}
		else if(manoJ1.get(0).equals("05"))
		{
			j11 = f05;
		}
		else if(manoJ1.get(0).equals("06"))
		{
			j11 = f06;
		}
		else if(manoJ1.get(0).equals("11"))
		{
			j11 = f11;
		}
		else if(manoJ1.get(0).equals("12"))
		{
			j11 = f12;
		}
		else if(manoJ1.get(0).equals("13"))
		{
			j11 = f13;
		}
		else if(manoJ1.get(0).equals("14"))
		{
			j11 = f14;
		}
		else if(manoJ1.get(0).equals("15"))
		{
			j11 = f15;
		}
		else if(manoJ1.get(0).equals("16"))
		{
			j11 = f16;
		}
		else if(manoJ1.get(0).equals("22"))
		{
			j11 = f22;
		}
		else if(manoJ1.get(0).equals("23"))
		{
			j11 = f23;
		}
		else if(manoJ1.get(0).equals("24"))
		{
			j11 = f24;
		}
		else if(manoJ1.get(0).equals("25"))
		{
			j11 = f25;
		}
		else if(manoJ1.get(0).equals("26"))
		{
			j11 = f26;
		}
		else if(manoJ1.get(0).equals("33"))
		{
			j11 = f33;
		}
		else if(manoJ1.get(0).equals("34"))
		{
			j11 = f34;
		}
		else if(manoJ1.get(0).equals("35"))
		{
			j11 = f35;
		}
		else if(manoJ1.get(0).equals("36"))
		{
			j11 = f36;
		}
		else if(manoJ1.get(0).equals("44"))
		{
			j11 = f44;
		}
		else if(manoJ1.get(0).equals("45"))
		{
			j11 = f45;
		}
		else if(manoJ1.get(0).equals("46"))
		{
			j11 = f46;
		}
		else if(manoJ1.get(0).equals("55"))
		{
			j11 = f55;
		}
		else if(manoJ1.get(0).equals("56"))
		{
			j11 = f56;
		}
		else if(manoJ1.get(0).equals("66"))
		{
			j11 = f66;
		}
		// Ficha 2 Jugador 1
		if(manoJ1.get(1).equals("00"))
		{
			j12 = f00;
		}
		else if(manoJ1.get(1).equals("01"))
		{
			j12 = f01;
		}
		else if(manoJ1.get(1).equals("02"))
		{
			j12 = f02;
		}
		else if(manoJ1.get(1).equals("03"))
		{
			j12 = f03;
		}
		else if(manoJ1.get(1).equals("04"))
		{
			j12 = f04;
		}
		else if(manoJ1.get(1).equals("05"))
		{
			j12 = f05;
		}
		else if(manoJ1.get(1).equals("06"))
		{
			j12 = f06;
		}
		else if(manoJ1.get(1).equals("11"))
		{
			j12 = f11;
		}
		else if(manoJ1.get(1).equals("12"))
		{
			j12 = f12;
		}
		else if(manoJ1.get(1).equals("13"))
		{
			j12 = f13;
		}
		else if(manoJ1.get(1).equals("14"))
		{
			j12 = f14;
		}
		else if(manoJ1.get(1).equals("15"))
		{
			j12 = f15;
		}
		else if(manoJ1.get(1).equals("16"))
		{
			j12 = f16;
		}
		else if(manoJ1.get(1).equals("22"))
		{
			j12 = f22;
		}
		else if(manoJ1.get(1).equals("23"))
		{
			j12 = f23;
		}
		else if(manoJ1.get(1).equals("24"))
		{
			j12 = f24;
		}
		else if(manoJ1.get(1).equals("25"))
		{
			j12 = f25;
		}
		else if(manoJ1.get(1).equals("26"))
		{
			j12 = f26;
		}
		else if(manoJ1.get(1).equals("33"))
		{
			j12 = f33;
		}
		else if(manoJ1.get(1).equals("34"))
		{
			j12 = f34;
		}
		else if(manoJ1.get(1).equals("35"))
		{
			j12 = f35;
		}
		else if(manoJ1.get(1).equals("36"))
		{
			j12 = f36;
		}
		else if(manoJ1.get(1).equals("44"))
		{
			j12 = f44;
		}
		else if(manoJ1.get(1).equals("45"))
		{
			j12 = f45;
		}
		else if(manoJ1.get(1).equals("46"))
		{
			j12 = f46;
		}
		else if(manoJ1.get(1).equals("55"))
		{
			j12 = f55;
		}
		else if(manoJ1.get(1).equals("56"))
		{
			j12 = f56;
		}
		else if(manoJ1.get(1).equals("66"))
		{
			j12 = f66;
		}
		// Ficha 3 Jugador 1
		if(manoJ1.get(2).equals("00"))
		{
			j13 = f00;
		}
		else if(manoJ1.get(2).equals("01"))
		{
			j13 = f01;
		}
		else if(manoJ1.get(2).equals("02"))
		{
			j13 = f02;
		}
		else if(manoJ1.get(2).equals("03"))
		{
			j13 = f03;
		}
		else if(manoJ1.get(2).equals("04"))
		{
			j13 = f04;
		}
		else if(manoJ1.get(2).equals("05"))
		{
			j13 = f05;
		}
		else if(manoJ1.get(2).equals("06"))
		{
			j13 = f06;
		}
		else if(manoJ1.get(2).equals("11"))
		{
			j13 = f11;
		}
		else if(manoJ1.get(2).equals("12"))
		{
			j13 = f12;
		}
		else if(manoJ1.get(2).equals("13"))
		{
			j13 = f13;
		}
		else if(manoJ1.get(2).equals("14"))
		{
			j13 = f14;
		}
		else if(manoJ1.get(2).equals("15"))
		{
			j13 = f15;
		}
		else if(manoJ1.get(2).equals("16"))
		{
			j13 = f16;
		}
		else if(manoJ1.get(2).equals("22"))
		{
			j13 = f22;
		}
		else if(manoJ1.get(2).equals("23"))
		{
			j13 = f23;
		}
		else if(manoJ1.get(2).equals("24"))
		{
			j13 = f24;
		}
		else if(manoJ1.get(2).equals("25"))
		{
			j13 = f25;
		}
		else if(manoJ1.get(2).equals("26"))
		{
			j13 = f26;
		}
		else if(manoJ1.get(2).equals("33"))
		{
			j13 = f33;
		}
		else if(manoJ1.get(2).equals("34"))
		{
			j13 = f34;
		}
		else if(manoJ1.get(2).equals("35"))
		{
			j13 = f35;
		}
		else if(manoJ1.get(2).equals("36"))
		{
			j13 = f36;
		}
		else if(manoJ1.get(2).equals("44"))
		{
			j13 = f44;
		}
		else if(manoJ1.get(2).equals("45"))
		{
			j13 = f45;
		}
		else if(manoJ1.get(2).equals("46"))
		{
			j13 = f46;
		}
		else if(manoJ1.get(2).equals("55"))
		{
			j13 = f55;
		}
		else if(manoJ1.get(2).equals("56"))
		{
			j13 = f56;
		}
		else if(manoJ1.get(2).equals("66"))
		{
			j13 = f66;
		}
		// Ficha 4 Jugador 1
		if(manoJ1.get(3).equals("00"))
		{
			j14 = f00;
		}
		else if(manoJ1.get(3).equals("01"))
		{
			j14 = f01;
		}
		else if(manoJ1.get(3).equals("02"))
		{
			j14 = f02;
		}
		else if(manoJ1.get(3).equals("03"))
		{
			j14 = f03;
		}
		else if(manoJ1.get(3).equals("04"))
		{
			j14 = f04;
		}
		else if(manoJ1.get(3).equals("05"))
		{
			j14 = f05;
		}
		else if(manoJ1.get(3).equals("06"))
		{
			j14 = f06;
		}
		else if(manoJ1.get(3).equals("11"))
		{
			j14 = f11;
		}
		else if(manoJ1.get(3).equals("12"))
		{
			j14 = f12;
		}
		else if(manoJ1.get(3).equals("13"))
		{
			j14 = f13;
		}
		else if(manoJ1.get(3).equals("14"))
		{
			j14 = f14;
		}
		else if(manoJ1.get(3).equals("15"))
		{
			j14 = f15;
		}
		else if(manoJ1.get(3).equals("16"))
		{
			j14 = f16;
		}
		else if(manoJ1.get(3).equals("22"))
		{
			j14 = f22;
		}
		else if(manoJ1.get(3).equals("23"))
		{
			j14 = f23;
		}
		else if(manoJ1.get(3).equals("24"))
		{
			j14 = f24;
		}
		else if(manoJ1.get(3).equals("25"))
		{
			j14 = f25;
		}
		else if(manoJ1.get(3).equals("26"))
		{
			j14 = f26;
		}
		else if(manoJ1.get(3).equals("33"))
		{
			j14 = f33;
		}
		else if(manoJ1.get(3).equals("34"))
		{
			j14 = f34;
		}
		else if(manoJ1.get(3).equals("35"))
		{
			j14 = f35;
		}
		else if(manoJ1.get(3).equals("36"))
		{
			j14 = f36;
		}
		else if(manoJ1.get(3).equals("44"))
		{
			j14 = f44;
		}
		else if(manoJ1.get(3).equals("45"))
		{
			j14 = f45;
		}
		else if(manoJ1.get(3).equals("46"))
		{
			j14 = f46;
		}
		else if(manoJ1.get(3).equals("55"))
		{
			j14 = f55;
		}
		else if(manoJ1.get(3).equals("56"))
		{
			j14 = f56;
		}
		else if(manoJ1.get(3).equals("66"))
		{
			j14 = f66;
		}
		// Ficha 5 Jugador 1
		if(manoJ1.get(4).equals("00"))
		{
			j15 = f00;
		}
		else if(manoJ1.get(4).equals("01"))
		{
			j15 = f01;
		}
		else if(manoJ1.get(4).equals("02"))
		{
			j15 = f02;
		}
		else if(manoJ1.get(4).equals("03"))
		{
			j15 = f03;
		}
		else if(manoJ1.get(4).equals("04"))
		{
			j15 = f04;
		}
		else if(manoJ1.get(4).equals("05"))
		{
			j15 = f05;
		}
		else if(manoJ1.get(4).equals("06"))
		{
			j15 = f06;
		}
		else if(manoJ1.get(4).equals("11"))
		{
			j15 = f11;
		}
		else if(manoJ1.get(4).equals("12"))
		{
			j15 = f12;
		}
		else if(manoJ1.get(4).equals("13"))
		{
			j15 = f13;
		}
		else if(manoJ1.get(4).equals("14"))
		{
			j15 = f14;
		}
		else if(manoJ1.get(4).equals("15"))
		{
			j15 = f15;
		}
		else if(manoJ1.get(4).equals("16"))
		{
			j15 = f16;
		}
		else if(manoJ1.get(4).equals("22"))
		{
			j15 = f22;
		}
		else if(manoJ1.get(4).equals("23"))
		{
			j15 = f23;
		}
		else if(manoJ1.get(4).equals("24"))
		{
			j15 = f24;
		}
		else if(manoJ1.get(4).equals("25"))
		{
			j15 = f25;
		}
		else if(manoJ1.get(4).equals("26"))
		{
			j15 = f26;
		}
		else if(manoJ1.get(4).equals("33"))
		{
			j15 = f33;
		}
		else if(manoJ1.get(4).equals("34"))
		{
			j15 = f34;
		}
		else if(manoJ1.get(4).equals("35"))
		{
			j15 = f35;
		}
		else if(manoJ1.get(4).equals("36"))
		{
			j15 = f36;
		}
		else if(manoJ1.get(4).equals("44"))
		{
			j15 = f44;
		}
		else if(manoJ1.get(4).equals("45"))
		{
			j15 = f45;
		}
		else if(manoJ1.get(4).equals("46"))
		{
			j15 = f46;
		}
		else if(manoJ1.get(4).equals("55"))
		{
			j15 = f55;
		}
		else if(manoJ1.get(4).equals("56"))
		{
			j15 = f56;
		}
		else if(manoJ1.get(4).equals("66"))
		{
			j15 = f66;
		}
		// Ficha 6 Jugador 1
		if(manoJ1.get(5).equals("00"))
		{
			j16 = f00;
		}
		else if(manoJ1.get(5).equals("01"))
		{
			j16 = f01;
		}
		else if(manoJ1.get(5).equals("02"))
		{
			j16 = f02;
		}
		else if(manoJ1.get(5).equals("03"))
		{
			j16 = f03;
		}
		else if(manoJ1.get(5).equals("04"))
		{
			j16 = f04;
		}
		else if(manoJ1.get(5).equals("05"))
		{
			j16 = f05;
		}
		else if(manoJ1.get(5).equals("06"))
		{
			j16 = f06;
		}
		else if(manoJ1.get(5).equals("11"))
		{
			j16 = f11;
		}
		else if(manoJ1.get(5).equals("12"))
		{
			j16 = f12;
		}
		else if(manoJ1.get(5).equals("13"))
		{
			j16 = f13;
		}
		else if(manoJ1.get(5).equals("14"))
		{
			j16 = f14;
		}
		else if(manoJ1.get(5).equals("15"))
		{
			j16 = f15;
		}
		else if(manoJ1.get(5).equals("16"))
		{
			j16 = f16;
		}
		else if(manoJ1.get(5).equals("22"))
		{
			j16 = f22;
		}
		else if(manoJ1.get(5).equals("23"))
		{
			j16 = f23;
		}
		else if(manoJ1.get(5).equals("24"))
		{
			j16 = f24;
		}
		else if(manoJ1.get(5).equals("25"))
		{
			j16 = f25;
		}
		else if(manoJ1.get(5).equals("26"))
		{
			j16 = f26;
		}
		else if(manoJ1.get(5).equals("33"))
		{
			j16 = f33;
		}
		else if(manoJ1.get(5).equals("34"))
		{
			j16 = f34;
		}
		else if(manoJ1.get(5).equals("35"))
		{
			j16 = f35;
		}
		else if(manoJ1.get(5).equals("36"))
		{
			j16 = f36;
		}
		else if(manoJ1.get(5).equals("44"))
		{
			j16 = f44;
		}
		else if(manoJ1.get(5).equals("45"))
		{
			j16 = f45;
		}
		else if(manoJ1.get(5).equals("46"))
		{
			j16 = f46;
		}
		else if(manoJ1.get(5).equals("55"))
		{
			j16 = f55;
		}
		else if(manoJ1.get(5).equals("56"))
		{
			j16 = f56;
		}
		else if(manoJ1.get(5).equals("66"))
		{
			j16 = f66;
		}
		// Ficha 7 Jugador 1
		if(manoJ1.get(6).equals("00"))
		{
			j17 = f00;
		}
		else if(manoJ1.get(6).equals("01"))
		{
			j17 = f01;
		}
		else if(manoJ1.get(6).equals("02"))
		{
			j17 = f02;
		}
		else if(manoJ1.get(6).equals("03"))
		{
			j17 = f03;
		}
		else if(manoJ1.get(6).equals("04"))
		{
			j17 = f04;
		}
		else if(manoJ1.get(6).equals("05"))
		{
			j17 = f05;
		}
		else if(manoJ1.get(6).equals("06"))
		{
			j17 = f06;
		}
		else if(manoJ1.get(6).equals("11"))
		{
			j17 = f11;
		}
		else if(manoJ1.get(6).equals("12"))
		{
			j17 = f12;
		}
		else if(manoJ1.get(6).equals("13"))
		{
			j17 = f13;
		}
		else if(manoJ1.get(6).equals("14"))
		{
			j17 = f14;
		}
		else if(manoJ1.get(6).equals("15"))
		{
			j17 = f15;
		}
		else if(manoJ1.get(6).equals("16"))
		{
			j17 = f16;
		}
		else if(manoJ1.get(6).equals("22"))
		{
			j17 = f22;
		}
		else if(manoJ1.get(6).equals("23"))
		{
			j17 = f23;
		}
		else if(manoJ1.get(6).equals("24"))
		{
			j17 = f24;
		}
		else if(manoJ1.get(6).equals("25"))
		{
			j17 = f25;
		}
		else if(manoJ1.get(6).equals("26"))
		{
			j17 = f26;
		}
		else if(manoJ1.get(6).equals("33"))
		{
			j17 = f33;
		}
		else if(manoJ1.get(6).equals("34"))
		{
			j17 = f34;
		}
		else if(manoJ1.get(6).equals("35"))
		{
			j17 = f35;
		}
		else if(manoJ1.get(6).equals("36"))
		{
			j17 = f36;
		}
		else if(manoJ1.get(6).equals("44"))
		{
			j17 = f44;
		}
		else if(manoJ1.get(6).equals("45"))
		{
			j17 = f45;
		}
		else if(manoJ1.get(6).equals("46"))
		{
			j17 = f46;
		}
		else if(manoJ1.get(6).equals("55"))
		{
			j17 = f55;
		}
		else if(manoJ1.get(6).equals("56"))
		{
			j17 = f56;
		}
		else if(manoJ1.get(6).equals("66"))
		{
			j17 = f66;
		}
		                               						/*FICHAS JUGADOR 2*/
		// Ficha 1 Jugador 2
		if(manoJ2.get(0).equals("00"))
		{
			j21 = f00;
		}
		else if(manoJ2.get(0).equals("01"))
		{
			j21 = f01;
		}
		else if(manoJ2.get(0).equals("02"))
		{
			j21 = f02;
		}
		else if(manoJ2.get(0).equals("03"))
		{
			j21 = f03;
		}
		else if(manoJ2.get(0).equals("04"))
		{
			j21 = f04;
		}
		else if(manoJ2.get(0).equals("05"))
		{
			j21 = f05;
		}
		else if(manoJ2.get(0).equals("06"))
		{
			j21 = f06;
		}
		else if(manoJ2.get(0).equals("11"))
		{
			j21 = f11;
		}
		else if(manoJ2.get(0).equals("12"))
		{
			j21 = f12;
		}
		else if(manoJ2.get(0).equals("13"))
		{
			j21 = f13;
		}
		else if(manoJ2.get(0).equals("14"))
		{
			j21 = f14;
		}
		else if(manoJ2.get(0).equals("15"))
		{
			j21 = f15;
		}
		else if(manoJ2.get(0).equals("16"))
		{
			j21 = f16;
		}
		else if(manoJ2.get(0).equals("22"))
		{
			j21 = f22;
		}
		else if(manoJ2.get(0).equals("23"))
		{
			j21 = f23;
		}
		else if(manoJ2.get(0).equals("24"))
		{
			j21 = f24;
		}
		else if(manoJ2.get(0).equals("25"))
		{
			j21 = f25;
		}
		else if(manoJ2.get(0).equals("26"))
		{
			j21 = f26;
		}
		else if(manoJ2.get(0).equals("33"))
		{
			j21 = f33;
		}
		else if(manoJ2.get(0).equals("34"))
		{
			j21 = f34;
		}
		else if(manoJ2.get(0).equals("35"))
		{
			j21 = f35;
		}
		else if(manoJ2.get(0).equals("36"))
		{
			j21 = f36;
		}
		else if(manoJ2.get(0).equals("44"))
		{
			j21 = f44;
		}
		else if(manoJ2.get(0).equals("45"))
		{
			j21 = f45;
		}
		else if(manoJ2.get(0).equals("46"))
		{
			j21 = f46;
		}
		else if(manoJ2.get(0).equals("55"))
		{
			j21 = f55;
		}
		else if(manoJ2.get(0).equals("56"))
		{
			j21 = f56;
		}
		else if(manoJ2.get(0).equals("66"))
		{
			j21 = f66;
		}
		// Ficha 2 Jugador 2
		if(manoJ2.get(1).equals("00"))
		{
			j22 = f00;
		}
		else if(manoJ2.get(1).equals("01"))
		{
			j22 = f01;
		}
		else if(manoJ2.get(1).equals("02"))
		{
			j22 = f02;
		}
		else if(manoJ2.get(1).equals("03"))
		{
			j22 = f03;
		}
		else if(manoJ2.get(1).equals("04"))
		{
			j22 = f04;
		}
		else if(manoJ2.get(1).equals("05"))
		{
			j22 = f05;
		}
		else if(manoJ2.get(1).equals("06"))
		{
			j22 = f06;
		}
		else if(manoJ2.get(1).equals("11"))
		{
			j22 = f11;
		}
		else if(manoJ2.get(1).equals("12"))
		{
			j22 = f12;
		}
		else if(manoJ2.get(1).equals("13"))
		{
			j22 = f13;
		}
		else if(manoJ2.get(1).equals("14"))
		{
			j22 = f14;
		}
		else if(manoJ2.get(1).equals("15"))
		{
			j22 = f15;
		}
		else if(manoJ2.get(1).equals("16"))
		{
			j22 = f16;
		}
		else if(manoJ2.get(1).equals("22"))
		{
			j22 = f22;
		}
		else if(manoJ2.get(1).equals("23"))
		{
			j22 = f23;
		}
		else if(manoJ2.get(1).equals("24"))
		{
			j22 = f24;
		}
		else if(manoJ2.get(1).equals("25"))
		{
			j22 = f25;
		}
		else if(manoJ2.get(1).equals("26"))
		{
			j22 = f26;
		}
		else if(manoJ2.get(1).equals("33"))
		{
			j22 = f33;
		}
		else if(manoJ2.get(1).equals("34"))
		{
			j22 = f34;
		}
		else if(manoJ2.get(1).equals("35"))
		{
			j22 = f35;
		}
		else if(manoJ2.get(1).equals("36"))
		{
			j22 = f36;
		}
		else if(manoJ2.get(1).equals("44"))
		{
			j22 = f44;
		}
		else if(manoJ2.get(1).equals("45"))
		{
			j22 = f45;
		}
		else if(manoJ2.get(1).equals("46"))
		{
			j22 = f46;
		}
		else if(manoJ2.get(1).equals("55"))
		{
			j22 = f55;
		}
		else if(manoJ2.get(1).equals("56"))
		{
			j22 = f56;
		}
		else if(manoJ2.get(1).equals("66"))
		{
			j22 = f66;
		}
		// Ficha 3 Jugador 2
		if(manoJ2.get(2).equals("00"))
		{
			j23 = f00;
		}
		else if(manoJ2.get(2).equals("01"))
		{
			j23 = f01;
		}
		else if(manoJ2.get(2).equals("02"))
		{
			j23 = f02;
		}
		else if(manoJ2.get(2).equals("03"))
		{
			j23 = f03;
		}
		else if(manoJ2.get(2).equals("04"))
		{
			j23 = f04;
		}
		else if(manoJ2.get(2).equals("05"))
		{
			j23 = f05;
		}
		else if(manoJ2.get(2).equals("06"))
		{
			j23 = f06;
		}
		else if(manoJ2.get(2).equals("11"))
		{
			j23 = f11;
		}
		else if(manoJ2.get(2).equals("12"))
		{
			j23 = f12;
		}
		else if(manoJ2.get(2).equals("13"))
		{
			j23 = f13;
		}
		else if(manoJ2.get(2).equals("14"))
		{
			j23 = f14;
		}
		else if(manoJ2.get(2).equals("15"))
		{
			j23 = f15;
		}
		else if(manoJ2.get(2).equals("16"))
		{
			j23 = f16;
		}
		else if(manoJ2.get(2).equals("22"))
		{
			j23 = f22;
		}
		else if(manoJ2.get(2).equals("23"))
		{
			j23 = f23;
		}
		else if(manoJ2.get(2).equals("24"))
		{
			j23 = f24;
		}
		else if(manoJ2.get(2).equals("25"))
		{
			j23 = f25;
		}
		else if(manoJ2.get(2).equals("26"))
		{
			j23 = f26;
		}
		else if(manoJ2.get(2).equals("33"))
		{
			j23 = f33;
		}
		else if(manoJ2.get(2).equals("34"))
		{
			j23 = f34;
		}
		else if(manoJ2.get(2).equals("35"))
		{
			j23 = f35;
		}
		else if(manoJ2.get(2).equals("36"))
		{
			j23 = f36;
		}
		else if(manoJ2.get(2).equals("44"))
		{
			j23 = f44;
		}
		else if(manoJ2.get(2).equals("45"))
		{
			j23 = f45;
		}
		else if(manoJ2.get(2).equals("46"))
		{
			j23 = f46;
		}
		else if(manoJ2.get(2).equals("55"))
		{
			j23 = f55;
		}
		else if(manoJ2.get(2).equals("56"))
		{
			j23 = f56;
		}
		else if(manoJ2.get(2).equals("66"))
		{
			j23 = f66;
		}
		// Ficha 4 Jugador 2
		if(manoJ2.get(3).equals("00"))
		{
			j24 = f00;
		}
		else if(manoJ2.get(3).equals("01"))
		{
			j24 = f01;
		}
		else if(manoJ2.get(3).equals("02"))
		{
			j24 = f02;
		}
		else if(manoJ2.get(3).equals("03"))
		{
			j24 = f03;
		}
		else if(manoJ2.get(3).equals("04"))
		{
			j24 = f04;
		}
		else if(manoJ2.get(3).equals("05"))
		{
			j24 = f05;
		}
		else if(manoJ2.get(3).equals("06"))
		{
			j24 = f06;
		}
		else if(manoJ2.get(3).equals("11"))
		{
			j24 = f11;
		}
		else if(manoJ2.get(3).equals("12"))
		{
			j24 = f12;
		}
		else if(manoJ2.get(3).equals("13"))
		{
			j24 = f13;
		}
		else if(manoJ2.get(3).equals("14"))
		{
			j24 = f14;
		}
		else if(manoJ2.get(3).equals("15"))
		{
			j24 = f15;
		}
		else if(manoJ2.get(3).equals("16"))
		{
			j24 = f16;
		}
		else if(manoJ2.get(3).equals("22"))
		{
			j24 = f22;
		}
		else if(manoJ2.get(3).equals("23"))
		{
			j24 = f23;
		}
		else if(manoJ2.get(3).equals("24"))
		{
			j24 = f24;
		}
		else if(manoJ2.get(3).equals("25"))
		{
			j24 = f25;
		}
		else if(manoJ2.get(3).equals("26"))
		{
			j24 = f26;
		}
		else if(manoJ2.get(3).equals("33"))
		{
			j24 = f33;
		}
		else if(manoJ2.get(3).equals("34"))
		{
			j24 = f34;
		}
		else if(manoJ2.get(3).equals("35"))
		{
			j24 = f35;
		}
		else if(manoJ2.get(3).equals("36"))
		{
			j24 = f36;
		}
		else if(manoJ2.get(3).equals("44"))
		{
			j24 = f44;
		}
		else if(manoJ2.get(3).equals("45"))
		{
			j24 = f45;
		}
		else if(manoJ2.get(3).equals("46"))
		{
			j24 = f46;
		}
		else if(manoJ2.get(3).equals("55"))
		{
			j24 = f55;
		}
		else if(manoJ2.get(3).equals("56"))
		{
			j24 = f56;
		}
		else if(manoJ2.get(3).equals("66"))
		{
			j24 = f66;
		}
		// Ficha 5 Jugador 2
		if(manoJ2.get(4).equals("00"))
		{
			j25 = f00;
		}
		else if(manoJ2.get(4).equals("01"))
		{
			j25 = f01;
		}
		else if(manoJ2.get(4).equals("02"))
		{
			j25 = f02;
		}
		else if(manoJ2.get(4).equals("03"))
		{
			j25 = f03;
		}
		else if(manoJ2.get(4).equals("04"))
		{
			j25 = f04;
		}
		else if(manoJ2.get(4).equals("05"))
		{
			j25 = f05;
		}
		else if(manoJ2.get(4).equals("06"))
		{
			j25 = f06;
		}
		else if(manoJ2.get(4).equals("11"))
		{
			j25 = f11;
		}
		else if(manoJ2.get(4).equals("12"))
		{
			j25 = f12;
		}
		else if(manoJ2.get(4).equals("13"))
		{
			j25 = f13;
		}
		else if(manoJ2.get(4).equals("14"))
		{
			j25 = f14;
		}
		else if(manoJ2.get(4).equals("15"))
		{
			j25 = f15;
		}
		else if(manoJ2.get(4).equals("16"))
		{
			j25 = f16;
		}
		else if(manoJ2.get(4).equals("22"))
		{
			j25 = f22;
		}
		else if(manoJ2.get(4).equals("23"))
		{
			j25 = f23;
		}
		else if(manoJ2.get(4).equals("24"))
		{
			j25 = f24;
		}
		else if(manoJ2.get(4).equals("25"))
		{
			j25 = f25;
		}
		else if(manoJ2.get(4).equals("26"))
		{
			j25 = f26;
		}
		else if(manoJ2.get(4).equals("33"))
		{
			j25 = f33;
		}
		else if(manoJ2.get(4).equals("34"))
		{
			j25 = f34;
		}
		else if(manoJ2.get(4).equals("35"))
		{
			j25 = f35;
		}
		else if(manoJ2.get(4).equals("36"))
		{
			j25 = f36;
		}
		else if(manoJ2.get(4).equals("44"))
		{
			j25 = f44;
		}
		else if(manoJ2.get(4).equals("45"))
		{
			j25 = f45;
		}
		else if(manoJ2.get(4).equals("46"))
		{
			j25 = f46;
		}
		else if(manoJ2.get(4).equals("55"))
		{
			j25 = f55;
		}
		else if(manoJ2.get(4).equals("56"))
		{
			j25 = f56;
		}
		else if(manoJ2.get(4).equals("66"))
		{
			j25 = f66;
		}
		// Ficha 6 Jugador 2
		if(manoJ2.get(5).equals("00"))
		{
			j26 = f00;
		}
		else if(manoJ2.get(5).equals("01"))
		{
			j26 = f01;
		}
		else if(manoJ2.get(5).equals("02"))
		{
			j26 = f02;
		}
		else if(manoJ2.get(5).equals("03"))
		{
			j26 = f03;
		}
		else if(manoJ2.get(5).equals("04"))
		{
			j26 = f04;
		}
		else if(manoJ2.get(5).equals("05"))
		{
			j26 = f05;
		}
		else if(manoJ2.get(5).equals("06"))
		{
			j26 = f06;
		}
		else if(manoJ2.get(5).equals("11"))
		{
			j26 = f11;
		}
		else if(manoJ2.get(5).equals("12"))
		{
			j26 = f12;
		}
		else if(manoJ2.get(5).equals("13"))
		{
			j26 = f13;
		}
		else if(manoJ2.get(5).equals("14"))
		{
			j26 = f14;
		}
		else if(manoJ2.get(5).equals("15"))
		{
			j26 = f15;
		}
		else if(manoJ2.get(5).equals("16"))
		{
			j26 = f16;
		}
		else if(manoJ2.get(5).equals("22"))
		{
			j26 = f22;
		}
		else if(manoJ2.get(5).equals("23"))
		{
			j26 = f23;
		}
		else if(manoJ2.get(5).equals("24"))
		{
			j26 = f24;
		}
		else if(manoJ2.get(5).equals("25"))
		{
			j26 = f25;
		}
		else if(manoJ2.get(5).equals("26"))
		{
			j26 = f26;
		}
		else if(manoJ2.get(5).equals("33"))
		{
			j26 = f33;
		}
		else if(manoJ2.get(5).equals("34"))
		{
			j26 = f34;
		}
		else if(manoJ2.get(5).equals("35"))
		{
			j26 = f35;
		}
		else if(manoJ2.get(5).equals("36"))
		{
			j26 = f36;
		}
		else if(manoJ2.get(5).equals("44"))
		{
			j26 = f44;
		}
		else if(manoJ2.get(5).equals("45"))
		{
			j26 = f45;
		}
		else if(manoJ2.get(5).equals("46"))
		{
			j26 = f46;
		}
		else if(manoJ2.get(5).equals("55"))
		{
			j26 = f55;
		}
		else if(manoJ2.get(5).equals("56"))
		{
			j26 = f56;
		}
		else if(manoJ2.get(5).equals("66"))
		{
			j26 = f66;
		}
		// Ficha 7 Jugador 2
		if(manoJ2.get(6).equals("00"))
		{
			j27 = f00;
		}
		else if(manoJ2.get(6).equals("01"))
		{
			j27 = f01;
		}
		else if(manoJ2.get(6).equals("02"))
		{
			j27 = f02;
		}
		else if(manoJ2.get(6).equals("03"))
		{
			j27 = f03;
		}
		else if(manoJ2.get(6).equals("04"))
		{
			j27 = f04;
		}
		else if(manoJ2.get(6).equals("05"))
		{
			j27 = f05;
		}
		else if(manoJ2.get(6).equals("06"))
		{
			j27 = f06;
		}
		else if(manoJ2.get(6).equals("11"))
		{
			j27 = f11;
		}
		else if(manoJ2.get(6).equals("12"))
		{
			j27 = f12;
		}
		else if(manoJ2.get(6).equals("13"))
		{
			j27 = f13;
		}
		else if(manoJ2.get(6).equals("14"))
		{
			j27 = f14;
		}
		else if(manoJ2.get(6).equals("15"))
		{
			j27 = f15;
		}
		else if(manoJ2.get(6).equals("16"))
		{
			j27 = f16;
		}
		else if(manoJ2.get(6).equals("22"))
		{
			j27 = f22;
		}
		else if(manoJ2.get(6).equals("23"))
		{
			j27 = f23;
		}
		else if(manoJ2.get(6).equals("24"))
		{
			j27 = f24;
		}
		else if(manoJ2.get(6).equals("25"))
		{
			j27 = f25;
		}
		else if(manoJ2.get(6).equals("26"))
		{
			j27 = f26;
		}
		else if(manoJ2.get(6).equals("33"))
		{
			j27 = f33;
		}
		else if(manoJ2.get(6).equals("34"))
		{
			j27 = f34;
		}
		else if(manoJ2.get(6).equals("35"))
		{
			j27 = f35;
		}
		else if(manoJ2.get(6).equals("36"))
		{
			j27 = f36;
		}
		else if(manoJ2.get(6).equals("44"))
		{
			j27 = f44;
		}
		else if(manoJ2.get(6).equals("45"))
		{
			j27 = f45;
		}
		else if(manoJ2.get(6).equals("46"))
		{
			j27 = f46;
		}
		else if(manoJ2.get(6).equals("55"))
		{
			j27 = f55;
		}
		else if(manoJ2.get(6).equals("56"))
		{
			j27 = f56;
		}
		else if(manoJ2.get(6).equals("66"))
		{
			j27 = f66;
		}
															/*FICHAS JUGADOR 3*/
		if(manoJ3 != null)
		{
			// Ficha 1 Jugador 3
			if(manoJ3.get(0).equals("00"))
			{
				j31 = f00;
			}
			else if(manoJ3.get(0).equals("01"))
			{
				j31 = f01;
			}
			else if(manoJ3.get(0).equals("02"))
			{
				j31 = f02;
			}
			else if(manoJ3.get(0).equals("03"))
			{
				j31 = f03;
			}
			else if(manoJ3.get(0).equals("04"))
			{
				j31 = f04;
			}
			else if(manoJ3.get(0).equals("05"))
			{
				j31 = f05;
			}
			else if(manoJ3.get(0).equals("06"))
			{
				j31 = f06;
			}
			else if(manoJ3.get(0).equals("11"))
			{
				j31 = f11;
			}
			else if(manoJ3.get(0).equals("12"))
			{
				j31 = f12;
			}
			else if(manoJ3.get(0).equals("13"))
			{
				j31 = f13;
			}
			else if(manoJ3.get(0).equals("14"))
			{
				j31 = f14;
			}
			else if(manoJ3.get(0).equals("15"))
			{
				j31 = f15;
			}
			else if(manoJ3.get(0).equals("16"))
			{
				j31 = f16;
			}
			else if(manoJ3.get(0).equals("22"))
			{
				j31 = f22;
			}
			else if(manoJ3.get(0).equals("23"))
			{
				j31 = f23;
			}
			else if(manoJ3.get(0).equals("24"))
			{
				j31 = f24;
			}
			else if(manoJ3.get(0).equals("25"))
			{
				j31 = f25;
			}
			else if(manoJ3.get(0).equals("26"))
			{
				j31 = f26;
			}
			else if(manoJ3.get(0).equals("33"))
			{
				j31 = f33;
			}
			else if(manoJ3.get(0).equals("34"))
			{
				j31 = f34;
			}
			else if(manoJ3.get(0).equals("35"))
			{
				j31 = f35;
			}
			else if(manoJ3.get(0).equals("36"))
			{
				j31 = f36;
			}
			else if(manoJ3.get(0).equals("44"))
			{
				j31 = f44;
			}
			else if(manoJ3.get(0).equals("45"))
			{
				j31 = f45;
			}
			else if(manoJ3.get(0).equals("46"))
			{
				j31 = f46;
			}
			else if(manoJ3.get(0).equals("55"))
			{
				j31 = f55;
			}
			else if(manoJ3.get(0).equals("56"))
			{
				j31 = f56;
			}
			else if(manoJ3.get(0).equals("66"))
			{
				j31 = f66;
			}
			// Ficha 2 Jugador 3
			if(manoJ3.get(1).equals("00"))
			{
				j32 = f00;
			}
			else if(manoJ3.get(1).equals("01"))
			{
				j32 = f01;
			}
			else if(manoJ3.get(1).equals("02"))
			{
				j32 = f02;
			}
			else if(manoJ3.get(1).equals("03"))
			{
				j32 = f03;
			}
			else if(manoJ3.get(1).equals("04"))
			{
				j32 = f04;
			}
			else if(manoJ3.get(1).equals("05"))
			{
				j32 = f05;
			}
			else if(manoJ3.get(1).equals("06"))
			{
				j32 = f06;
			}
			else if(manoJ3.get(1).equals("11"))
			{
				j32 = f11;
			}
			else if(manoJ3.get(1).equals("12"))
			{
				j32 = f12;
			}
			else if(manoJ3.get(1).equals("13"))
			{
				j32 = f13;
			}
			else if(manoJ3.get(1).equals("14"))
			{
				j32 = f14;
			}
			else if(manoJ3.get(1).equals("15"))
			{
				j32 = f15;
			}
			else if(manoJ3.get(1).equals("16"))
			{
				j32 = f16;
			}
			else if(manoJ3.get(1).equals("22"))
			{
				j32 = f22;
			}
			else if(manoJ3.get(1).equals("23"))
			{
				j32 = f23;
			}
			else if(manoJ3.get(1).equals("24"))
			{
				j32 = f24;
			}
			else if(manoJ3.get(1).equals("25"))
			{
				j32 = f25;
			}
			else if(manoJ3.get(1).equals("26"))
			{
				j32 = f26;
			}
			else if(manoJ3.get(1).equals("33"))
			{
				j32 = f33;
			}
			else if(manoJ3.get(1).equals("34"))
			{
				j32 = f34;
			}
			else if(manoJ3.get(1).equals("35"))
			{
				j32 = f35;
			}
			else if(manoJ3.get(1).equals("36"))
			{
				j32 = f36;
			}
			else if(manoJ3.get(1).equals("44"))
			{
				j32 = f44;
			}
			else if(manoJ3.get(1).equals("45"))
			{
				j32 = f45;
			}
			else if(manoJ3.get(1).equals("46"))
			{
				j32 = f46;
			}
			else if(manoJ3.get(1).equals("55"))
			{
				j32 = f55;
			}
			else if(manoJ3.get(1).equals("56"))
			{
				j32 = f56;
			}
			else if(manoJ3.get(1).equals("66"))
			{
				j32 = f66;
			}
			// Ficha 3 Jugador 3
			if(manoJ3.get(2).equals("00"))
			{
				j33 = f00;
			}
			else if(manoJ3.get(2).equals("01"))
			{
				j33 = f01;
			}
			else if(manoJ3.get(2).equals("02"))
			{
				j33 = f02;
			}
			else if(manoJ3.get(2).equals("03"))
			{
				j33 = f03;
			}
			else if(manoJ3.get(2).equals("04"))
			{
				j33 = f04;
			}
			else if(manoJ3.get(2).equals("05"))
			{
				j33 = f05;
			}
			else if(manoJ3.get(2).equals("06"))
			{
				j33 = f06;
			}
			else if(manoJ3.get(2).equals("11"))
			{
				j33 = f11;
			}
			else if(manoJ3.get(2).equals("12"))
			{
				j33 = f12;
			}
			else if(manoJ3.get(2).equals("13"))
			{
				j33 = f13;
			}
			else if(manoJ3.get(2).equals("14"))
			{
				j33 = f14;
			}
			else if(manoJ3.get(2).equals("15"))
			{
				j33 = f15;
			}
			else if(manoJ3.get(2).equals("16"))
			{
				j33 = f16;
			}
			else if(manoJ3.get(2).equals("22"))
			{
				j33 = f22;
			}
			else if(manoJ3.get(2).equals("23"))
			{
				j33 = f23;
			}
			else if(manoJ3.get(2).equals("24"))
			{
				j33 = f24;
			}
			else if(manoJ3.get(2).equals("25"))
			{
				j33 = f25;
			}
			else if(manoJ3.get(2).equals("26"))
			{
				j33 = f26;
			}
			else if(manoJ3.get(2).equals("33"))
			{
				j33 = f33;
			}
			else if(manoJ3.get(2).equals("34"))
			{
				j33 = f34;
			}
			else if(manoJ3.get(2).equals("35"))
			{
				j33 = f35;
			}
			else if(manoJ3.get(2).equals("36"))
			{
				j33 = f36;
			}
			else if(manoJ3.get(2).equals("44"))
			{
				j33 = f44;
			}
			else if(manoJ3.get(2).equals("45"))
			{
				j33 = f45;
			}
			else if(manoJ3.get(2).equals("46"))
			{
				j33 = f46;
			}
			else if(manoJ3.get(2).equals("55"))
			{
				j33 = f55;
			}
			else if(manoJ3.get(2).equals("56"))
			{
				j33 = f56;
			}
			else if(manoJ3.get(2).equals("66"))
			{
				j33 = f66;
			}
			// Ficha 4 Jugador 3
			if(manoJ3.get(3).equals("00"))
			{
				j34 = f00;
			}
			else if(manoJ3.get(3).equals("01"))
			{
				j34 = f01;
			}
			else if(manoJ3.get(3).equals("02"))
			{
				j34 = f02;
			}
			else if(manoJ3.get(3).equals("03"))
			{
				j34 = f03;
			}
			else if(manoJ3.get(3).equals("04"))
			{
				j34 = f04;
			}
			else if(manoJ3.get(3).equals("05"))
			{
				j34 = f05;
			}
			else if(manoJ3.get(3).equals("06"))
			{
				j34 = f06;
			}
			else if(manoJ3.get(3).equals("11"))
			{
				j34 = f11;
			}
			else if(manoJ3.get(3).equals("12"))
			{
				j34 = f12;
			}
			else if(manoJ3.get(3).equals("13"))
			{
				j34 = f13;
			}
			else if(manoJ3.get(3).equals("14"))
			{
				j34 = f14;
			}
			else if(manoJ3.get(3).equals("15"))
			{
				j34 = f15;
			}
			else if(manoJ3.get(3).equals("16"))
			{
				j34 = f16;
			}
			else if(manoJ3.get(3).equals("22"))
			{
				j34 = f22;
			}
			else if(manoJ3.get(3).equals("23"))
			{
				j34 = f23;
			}
			else if(manoJ3.get(3).equals("24"))
			{
				j34 = f24;
			}
			else if(manoJ3.get(3).equals("25"))
			{
				j34 = f25;
			}
			else if(manoJ3.get(3).equals("26"))
			{
				j34 = f26;
			}
			else if(manoJ3.get(3).equals("33"))
			{
				j34 = f33;
			}
			else if(manoJ3.get(3).equals("34"))
			{
				j34 = f34;
			}
			else if(manoJ3.get(3).equals("35"))
			{
				j34 = f35;
			}
			else if(manoJ3.get(3).equals("36"))
			{
				j34 = f36;
			}
			else if(manoJ3.get(3).equals("44"))
			{
				j34 = f44;
			}
			else if(manoJ3.get(3).equals("45"))
			{
				j34 = f45;
			}
			else if(manoJ3.get(3).equals("46"))
			{
				j34 = f46;
			}
			else if(manoJ3.get(3).equals("55"))
			{
				j34 = f55;
			}
			else if(manoJ3.get(3).equals("56"))
			{
				j34 = f56;
			}
			else if(manoJ3.get(3).equals("66"))
			{
				j34 = f66;
			}
			// Ficha 5 Jugador 3
			if(manoJ3.get(4).equals("00"))
			{
				j35 = f00;
			}
			else if(manoJ3.get(4).equals("01"))
			{
				j35 = f01;
			}
			else if(manoJ3.get(4).equals("02"))
			{
				j35 = f02;
			}
			else if(manoJ3.get(4).equals("03"))
			{
				j35 = f03;
			}
			else if(manoJ3.get(4).equals("04"))
			{
				j35 = f04;
			}
			else if(manoJ3.get(4).equals("05"))
			{
				j35 = f05;
			}
			else if(manoJ3.get(4).equals("06"))
			{
				j35 = f06;
			}
			else if(manoJ3.get(4).equals("11"))
			{
				j35 = f11;
			}
			else if(manoJ3.get(4).equals("12"))
			{
				j35 = f12;
			}
			else if(manoJ3.get(4).equals("13"))
			{
				j35 = f13;
			}
			else if(manoJ3.get(4).equals("14"))
			{
				j35 = f14;
			}
			else if(manoJ3.get(4).equals("15"))
			{
				j35 = f15;
			}
			else if(manoJ3.get(4).equals("16"))
			{
				j35 = f16;
			}
			else if(manoJ3.get(4).equals("22"))
			{
				j35 = f22;
			}
			else if(manoJ3.get(4).equals("23"))
			{
				j35 = f23;
			}
			else if(manoJ3.get(4).equals("24"))
			{
				j35 = f24;
			}
			else if(manoJ3.get(4).equals("25"))
			{
				j35 = f25;
			}
			else if(manoJ3.get(4).equals("26"))
			{
				j35 = f26;
			}
			else if(manoJ3.get(4).equals("33"))
			{
				j35 = f33;
			}
			else if(manoJ3.get(4).equals("34"))
			{
				j35 = f34;
			}
			else if(manoJ3.get(4).equals("35"))
			{
				j35 = f35;
			}
			else if(manoJ3.get(4).equals("36"))
			{
				j35 = f36;
			}
			else if(manoJ3.get(4).equals("44"))
			{
				j35 = f44;
			}
			else if(manoJ3.get(4).equals("45"))
			{
				j35 = f45;
			}
			else if(manoJ3.get(4).equals("46"))
			{
				j35 = f46;
			}
			else if(manoJ3.get(4).equals("55"))
			{
				j35 = f55;
			}
			else if(manoJ3.get(4).equals("56"))
			{
				j35 = f56;
			}
			else if(manoJ3.get(4).equals("66"))
			{
				j35 = f66;
			}
			// Ficha 6 Jugador 3
			if(manoJ3.get(5).equals("00"))
			{
				j36 = f00;
			}
			else if(manoJ3.get(5).equals("01"))
			{
				j36 = f01;
			}
			else if(manoJ3.get(5).equals("02"))
			{
				j36 = f02;
			}
			else if(manoJ3.get(5).equals("03"))
			{
				j36 = f03;
			}
			else if(manoJ3.get(5).equals("04"))
			{
				j36 = f04;
			}
			else if(manoJ3.get(5).equals("05"))
			{
				j36 = f05;
			}
			else if(manoJ3.get(5).equals("06"))
			{
				j36 = f06;
			}
			else if(manoJ3.get(5).equals("11"))
			{
				j36 = f11;
			}
			else if(manoJ3.get(5).equals("12"))
			{
				j36 = f12;
			}
			else if(manoJ3.get(5).equals("13"))
			{
				j36 = f13;
			}
			else if(manoJ3.get(5).equals("14"))
			{
				j36 = f14;
			}
			else if(manoJ3.get(5).equals("15"))
			{
				j36 = f15;
			}
			else if(manoJ3.get(5).equals("16"))
			{
				j36 = f16;
			}
			else if(manoJ3.get(5).equals("22"))
			{
				j36 = f22;
			}
			else if(manoJ3.get(5).equals("23"))
			{
				j36 = f23;
			}
			else if(manoJ3.get(5).equals("24"))
			{
				j36 = f24;
			}
			else if(manoJ3.get(5).equals("25"))
			{
				j36 = f25;
			}
			else if(manoJ3.get(5).equals("26"))
			{
				j36 = f26;
			}
			else if(manoJ3.get(5).equals("33"))
			{
				j36 = f33;
			}
			else if(manoJ3.get(5).equals("34"))
			{
				j36 = f34;
			}
			else if(manoJ3.get(5).equals("35"))
			{
				j36 = f35;
			}
			else if(manoJ3.get(5).equals("36"))
			{
				j36 = f36;
			}
			else if(manoJ3.get(5).equals("44"))
			{
				j36 = f44;
			}
			else if(manoJ3.get(5).equals("45"))
			{
				j36 = f45;
			}
			else if(manoJ3.get(5).equals("46"))
			{
				j36 = f46;
			}
			else if(manoJ3.get(5).equals("55"))
			{
				j36 = f55;
			}
			else if(manoJ3.get(5).equals("56"))
			{
				j36 = f56;
			}
			else if(manoJ3.get(5).equals("66"))
			{
				j36 = f66;
			}
			// Ficha 7 Jugador 3
			if(manoJ3.get(6).equals("00"))
			{
				j37 = f00;
			}
			else if(manoJ3.get(6).equals("01"))
			{
				j37 = f01;
			}
			else if(manoJ3.get(6).equals("02"))
			{
				j37 = f02;
			}
			else if(manoJ3.get(6).equals("03"))
			{
				j37 = f03;
			}
			else if(manoJ3.get(6).equals("04"))
			{
				j37 = f04;
			}
			else if(manoJ3.get(6).equals("05"))
			{
				j37 = f05;
			}
			else if(manoJ3.get(6).equals("06"))
			{
				j37 = f06;
			}
			else if(manoJ3.get(6).equals("11"))
			{
				j37 = f11;
			}
			else if(manoJ3.get(6).equals("12"))
			{
				j37 = f12;
			}
			else if(manoJ3.get(6).equals("13"))
			{
				j37 = f13;
			}
			else if(manoJ3.get(6).equals("14"))
			{
				j37 = f14;
			}
			else if(manoJ3.get(6).equals("15"))
			{
				j37 = f15;
			}
			else if(manoJ3.get(6).equals("16"))
			{
				j37 = f16;
			}
			else if(manoJ3.get(6).equals("22"))
			{
				j37 = f22;
			}
			else if(manoJ3.get(6).equals("23"))
			{
				j37 = f23;
			}
			else if(manoJ3.get(6).equals("24"))
			{
				j37 = f24;
			}
			else if(manoJ3.get(6).equals("25"))
			{
				j37 = f25;
			}
			else if(manoJ3.get(6).equals("26"))
			{
				j37 = f26;
			}
			else if(manoJ3.get(6).equals("33"))
			{
				j37 = f33;
			}
			else if(manoJ3.get(6).equals("34"))
			{
				j37 = f34;
			}
			else if(manoJ3.get(6).equals("35"))
			{
				j37 = f35;
			}
			else if(manoJ3.get(6).equals("36"))
			{
				j37 = f36;
			}
			else if(manoJ3.get(6).equals("44"))
			{
				j37 = f44;
			}
			else if(manoJ3.get(6).equals("45"))
			{
				j37 = f45;
			}
			else if(manoJ3.get(6).equals("46"))
			{
				j37 = f46;
			}
			else if(manoJ3.get(6).equals("55"))
			{
				j37 = f55;
			}
			else if(manoJ3.get(6).equals("56"))
			{
				j37 = f56;
			}
			else if(manoJ3.get(6).equals("66"))
			{
				j37 = f66;
			}
		}
														/*FICHAS JUGADOR 4*/
		if(manoJ4 != null)
		{
			// Ficha 1 Jugador 4
			if (manoJ4.get(0).equals("00"))
			{
				j41 = f00;
			} 
			else if (manoJ4.get(0).equals("01"))
			{
				j41 = f01;
			} 
			else if (manoJ4.get(0).equals("02"))
			{
				j41 = f02;
			} 
			else if (manoJ4.get(0).equals("03"))
			{
				j41 = f03;
			} 
			else if (manoJ4.get(0).equals("04"))
			{
				j41 = f04;
			} 
			else if (manoJ4.get(0).equals("05"))
			{
				j41 = f05;
			} 
			else if (manoJ4.get(0).equals("06"))
			{
				j41 = f06;
			} 
			else if (manoJ4.get(0).equals("11"))
			{
				j41 = f11;
			} 
			else if (manoJ4.get(0).equals("12"))
			{
				j41 = f12;
			} 
			else if (manoJ4.get(0).equals("13"))
			{
				j41 = f13;
			} 
			else if (manoJ4.get(0).equals("14"))
			{
				j41 = f14;
			} 
			else if (manoJ4.get(0).equals("15"))
			{
				j41 = f15;
			} 
			else if (manoJ4.get(0).equals("16"))
			{
				j41 = f16;
			} 
			else if (manoJ4.get(0).equals("22"))
			{
				j41 = f22;
			} 
			else if (manoJ4.get(0).equals("23"))
			{
				j41 = f23;
			} 
			else if (manoJ4.get(0).equals("24"))
			{
				j41 = f24;
			} 
			else if (manoJ4.get(0).equals("25"))
			{
				j41 = f25;
			} 
			else if (manoJ4.get(0).equals("26"))
			{
				j41 = f26;
			} 
			else if (manoJ4.get(0).equals("33"))
			{
				j41 = f33;
			} 
			else if (manoJ4.get(0).equals("34"))
			{
				j41 = f34;
			} 
			else if (manoJ4.get(0).equals("35"))
			{
				j41 = f35;
			} 
			else if (manoJ4.get(0).equals("36"))
			{
				j41 = f36;
			} 
			else if (manoJ4.get(0).equals("44"))
			{
				j41 = f44;
			} 
			else if (manoJ4.get(0).equals("45"))
			{
				j41 = f45;
			} 
			else if (manoJ4.get(0).equals("46"))
			{
				j41 = f46;
			} 
			else if (manoJ4.get(0).equals("55"))
			{
				j41 = f55;
			} 
			else if (manoJ4.get(0).equals("56"))
			{
				j41 = f56;
			} 
			else if (manoJ4.get(0).equals("66"))
			{
				j41 = f66;
			}
			// Ficha 2 Jugador 4
			if(manoJ4.get(1).equals("00"))
			{
				j42 = f00;
			}
			else if(manoJ4.get(1).equals("01"))
			{
				j42 = f01;
			}
			else if(manoJ4.get(1).equals("02"))
			{
				j42 = f02;
			}
			else if(manoJ4.get(1).equals("03"))
			{
				j42 = f03;
			}
			else if(manoJ4.get(1).equals("04"))
			{
				j42 = f04;
			}
			else if(manoJ4.get(1).equals("05"))
			{
				j42 = f05;
			}
			else if(manoJ4.get(1).equals("06"))
			{
				j42 = f06;
			}
			else if(manoJ4.get(1).equals("11"))
			{
				j42 = f11;
			}
			else if(manoJ4.get(1).equals("12"))
			{
				j42 = f12;
			}
			else if(manoJ4.get(1).equals("13"))
			{
				j42 = f13;
			}
			else if(manoJ4.get(1).equals("14"))
			{
				j42 = f14;
			}
			else if(manoJ4.get(1).equals("15"))
			{
				j42 = f15;
			}
			else if(manoJ4.get(1).equals("16"))
			{
				j42 = f16;
			}
			else if(manoJ4.get(1).equals("22"))
			{
				j42 = f22;
			}
			else if(manoJ4.get(1).equals("23"))
			{
				j42 = f23;
			}
			else if(manoJ4.get(1).equals("24"))
			{
				j42 = f24;
			}
			else if(manoJ4.get(1).equals("25"))
			{
				j42 = f25;
			}
			else if(manoJ4.get(1).equals("26"))
			{
				j42 = f26;
			}
			else if(manoJ4.get(1).equals("33"))
			{
				j42 = f33;
			}
			else if(manoJ4.get(1).equals("34"))
			{
				j42 = f34;
			}
			else if(manoJ4.get(1).equals("35"))
			{
				j42 = f35;
			}
			else if(manoJ4.get(1).equals("36"))
			{
				j42 = f36;
			}
			else if(manoJ4.get(1).equals("44"))
			{
				j42 = f44;
			}
			else if(manoJ4.get(1).equals("45"))
			{
				j42 = f45;
			}
			else if(manoJ4.get(1).equals("46"))
			{
				j42 = f46;
			}
			else if(manoJ4.get(1).equals("55"))
			{
				j42 = f55;
			}
			else if(manoJ4.get(1).equals("56"))
			{
				j42 = f56;
			}
			else if(manoJ4.get(1).equals("66"))
			{
				j42 = f66;
			}
			// Ficha 3 Jugador 4
			if(manoJ4.get(2).equals("00"))
			{
				j43 = f00;
			}
			else if(manoJ4.get(2).equals("01"))
			{
				j43 = f01;
			}
			else if(manoJ4.get(2).equals("02"))
			{
				j43 = f02;
			}
			else if(manoJ4.get(2).equals("03"))
			{
				j43 = f03;
			}
			else if(manoJ4.get(2).equals("04"))
			{
				j43 = f04;
			}
			else if(manoJ4.get(2).equals("05"))
			{
				j43 = f05;
			}
			else if(manoJ4.get(2).equals("06"))
			{
				j43 = f06;
			}
			else if(manoJ4.get(2).equals("11"))
			{
				j43 = f11;
			}
			else if(manoJ4.get(2).equals("12"))
			{
				j43 = f12;
			}
			else if(manoJ4.get(2).equals("13"))
			{
				j43 = f13;
			}
			else if(manoJ4.get(2).equals("14"))
			{
				j43 = f14;
			}
			else if(manoJ4.get(2).equals("15"))
			{
				j43 = f15;
			}
			else if(manoJ4.get(2).equals("16"))
			{
				j43 = f16;
			}
			else if(manoJ4.get(2).equals("22"))
			{
				j43 = f22;
			}
			else if(manoJ4.get(2).equals("23"))
			{
				j43 = f23;
			}
			else if(manoJ4.get(2).equals("24"))
			{
				j43 = f24;
			}
			else if(manoJ4.get(2).equals("25"))
			{
				j43 = f25;
			}
			else if(manoJ4.get(2).equals("26"))
			{
				j43 = f26;
			}
			else if(manoJ4.get(2).equals("33"))
			{
				j43 = f33;
			}
			else if(manoJ4.get(2).equals("34"))
			{
				j43 = f34;
			}
			else if(manoJ4.get(2).equals("35"))
			{
				j43 = f35;
			}
			else if(manoJ4.get(2).equals("36"))
			{
				j43 = f36;
			}
			else if(manoJ4.get(2).equals("44"))
			{
				j43 = f44;
			}
			else if(manoJ4.get(2).equals("45"))
			{
				j43 = f45;
			}
			else if(manoJ4.get(2).equals("46"))
			{
				j43 = f46;
			}
			else if(manoJ4.get(2).equals("55"))
			{
				j43 = f55;
			}
			else if(manoJ4.get(2).equals("56"))
			{
				j43 = f56;
			}
			else if(manoJ4.get(2).equals("66"))
			{
				j43 = f66;
			}
			// Ficha 4 Jugador 4
			if(manoJ4.get(3).equals("00"))
			{
				j44 = f00;
			}
			else if(manoJ4.get(3).equals("01"))
			{
				j44 = f01;
			}
			else if(manoJ4.get(3).equals("02"))
			{
				j44 = f02;
			}
			else if(manoJ4.get(3).equals("03"))
			{
				j44 = f03;
			}
			else if(manoJ4.get(3).equals("04"))
			{
				j44 = f04;
			}
			else if(manoJ4.get(3).equals("05"))
			{
				j44 = f05;
			}
			else if(manoJ4.get(3).equals("06"))
			{
				j44 = f06;
			}
			else if(manoJ4.get(3).equals("11"))
			{
				j44 = f11;
			}
			else if(manoJ4.get(3).equals("12"))
			{
				j44 = f12;
			}
			else if(manoJ4.get(3).equals("13"))
			{
				j44 = f13;
			}
			else if(manoJ4.get(3).equals("14"))
			{
				j44 = f14;
			}
			else if(manoJ4.get(3).equals("15"))
			{
				j44 = f15;
			}
			else if(manoJ4.get(3).equals("16"))
			{
				j44 = f16;
			}
			else if(manoJ4.get(3).equals("22"))
			{
				j44 = f22;
			}
			else if(manoJ4.get(3).equals("23"))
			{
				j44 = f23;
			}
			else if(manoJ4.get(3).equals("24"))
			{
				j44 = f24;
			}
			else if(manoJ4.get(3).equals("25"))
			{
				j44 = f25;
			}
			else if(manoJ4.get(3).equals("26"))
			{
				j44 = f26;
			}
			else if(manoJ4.get(3).equals("33"))
			{
				j44 = f33;
			}
			else if(manoJ4.get(3).equals("34"))
			{
				j44 = f34;
			}
			else if(manoJ4.get(3).equals("35"))
			{
				j44 = f35;
			}
			else if(manoJ4.get(3).equals("36"))
			{
				j44 = f36;
			}
			else if(manoJ4.get(3).equals("44"))
			{
				j44 = f44;
			}
			else if(manoJ4.get(3).equals("45"))
			{
				j44 = f45;
			}
			else if(manoJ4.get(3).equals("46"))
			{
				j44 = f46;
			}
			else if(manoJ4.get(3).equals("55"))
			{
				j44 = f55;
			}
			else if(manoJ4.get(3).equals("56"))
			{
				j44 = f56;
			}
			else if(manoJ4.get(3).equals("66"))
			{
				j44 = f66;
			}
			// Ficha 5 Jugador 4
			if(manoJ4.get(4).equals("00"))
			{
				j45 = f00;
			}
			else if(manoJ4.get(4).equals("01"))
			{
				j45 = f01;
			}
			else if(manoJ4.get(4).equals("02"))
			{
				j45 = f02;
			}
			else if(manoJ4.get(4).equals("03"))
			{
				j45 = f03;
			}
			else if(manoJ4.get(4).equals("04"))
			{
				j45 = f04;
			}
			else if(manoJ4.get(4).equals("05"))
			{
				j45 = f05;
			}
			else if(manoJ4.get(4).equals("06"))
			{
				j45 = f06;
			}
			else if(manoJ4.get(4).equals("11"))
			{
				j45 = f11;
			}
			else if(manoJ4.get(4).equals("12"))
			{
				j45 = f12;
			}
			else if(manoJ4.get(4).equals("13"))
			{
				j45 = f13;
			}
			else if(manoJ4.get(4).equals("14"))
			{
				j45 = f14;
			}
			else if(manoJ4.get(4).equals("15"))
			{
				j45 = f15;
			}
			else if(manoJ4.get(4).equals("16"))
			{
				j45 = f16;
			}
			else if(manoJ4.get(4).equals("22"))
			{
				j45 = f22;
			}
			else if(manoJ4.get(4).equals("23"))
			{
				j45 = f23;
			}
			else if(manoJ4.get(4).equals("24"))
			{
				j45 = f24;
			}
			else if(manoJ4.get(4).equals("25"))
			{
				j45 = f25;
			}
			else if(manoJ4.get(4).equals("26"))
			{
				j45 = f26;
			}
			else if(manoJ4.get(4).equals("33"))
			{
				j45 = f33;
			}
			else if(manoJ4.get(4).equals("34"))
			{
				j45 = f34;
			}
			else if(manoJ4.get(4).equals("35"))
			{
				j45 = f35;
			}
			else if(manoJ4.get(4).equals("36"))
			{
				j45 = f36;
			}
			else if(manoJ4.get(4).equals("44"))
			{
				j45 = f44;
			}
			else if(manoJ4.get(4).equals("45"))
			{
				j45 = f45;
			}
			else if(manoJ4.get(4).equals("46"))
			{
				j45 = f46;
			}
			else if(manoJ4.get(4).equals("55"))
			{
				j45 = f55;
			}
			else if(manoJ4.get(4).equals("56"))
			{
				j45 = f56;
			}
			else if(manoJ4.get(4).equals("66"))
			{
				j45 = f66;
			}
			// Ficha 6 Jugador 4
			if(manoJ4.get(5).equals("00"))
			{
				j46 = f00;
			}
			else if(manoJ4.get(5).equals("01"))
			{
				j46 = f01;
			}
			else if(manoJ4.get(5).equals("02"))
			{
				j46 = f02;
			}
			else if(manoJ4.get(5).equals("03"))
			{
				j46 = f03;
			}
			else if(manoJ4.get(5).equals("04"))
			{
				j46 = f04;
			}
			else if(manoJ4.get(5).equals("05"))
			{
				j46 = f05;
			}
			else if(manoJ4.get(5).equals("06"))
			{
				j46 = f06;
			}
			else if(manoJ4.get(5).equals("11"))
			{
				j46 = f11;
			}
			else if(manoJ4.get(5).equals("12"))
			{
				j46 = f12;
			}
			else if(manoJ4.get(5).equals("13"))
			{
				j46 = f13;
			}
			else if(manoJ4.get(5).equals("14"))
			{
				j46 = f14;
			}
			else if(manoJ4.get(5).equals("15"))
			{
				j46 = f15;
			}
			else if(manoJ4.get(5).equals("16"))
			{
				j46 = f16;
			}
			else if(manoJ4.get(5).equals("22"))
			{
				j46 = f22;
			}
			else if(manoJ4.get(5).equals("23"))
			{
				j46 = f23;
			}
			else if(manoJ4.get(5).equals("24"))
			{
				j46 = f24;
			}
			else if(manoJ4.get(5).equals("25"))
			{
				j46 = f25;
			}
			else if(manoJ4.get(5).equals("26"))
			{
				j46 = f26;
			}
			else if(manoJ4.get(5).equals("33"))
			{
				j46 = f33;
			}
			else if(manoJ4.get(5).equals("34"))
			{
				j46 = f34;
			}
			else if(manoJ4.get(5).equals("35"))
			{
				j46 = f35;
			}
			else if(manoJ4.get(5).equals("36"))
			{
				j46 = f36;
			}
			else if(manoJ4.get(5).equals("44"))
			{
				j46 = f44;
			}
			else if(manoJ4.get(5).equals("45"))
			{
				j46 = f45;
			}
			else if(manoJ4.get(5).equals("46"))
			{
				j46 = f46;
			}
			else if(manoJ4.get(5).equals("55"))
			{
				j46 = f55;
			}
			else if(manoJ4.get(5).equals("56"))
			{
				j46 = f56;
			}
			else if(manoJ4.get(5).equals("66"))
			{
				j46 = f66;
			}
			// Ficha 7 Jugador 4
			if(manoJ4.get(6).equals("00"))
			{
				j47 = f00;
			}
			else if(manoJ4.get(6).equals("01"))
			{
				j47 = f01;
			}
			else if(manoJ4.get(6).equals("02"))
			{
				j47 = f02;
			}
			else if(manoJ4.get(6).equals("03"))
			{
				j47 = f03;
			}
			else if(manoJ4.get(6).equals("04"))
			{
				j47 = f04;
			}
			else if(manoJ4.get(6).equals("05"))
			{
				j47 = f05;
			}
			else if(manoJ4.get(6).equals("06"))
			{
				j47 = f06;
			}
			else if(manoJ4.get(6).equals("11"))
			{
				j47 = f11;
			}
			else if(manoJ4.get(6).equals("12"))
			{
				j47 = f12;
			}
			else if(manoJ4.get(6).equals("13"))
			{
				j47 = f13;
			}
			else if(manoJ4.get(6).equals("14"))
			{
				j47 = f14;
			}
			else if(manoJ4.get(6).equals("15"))
			{
				j47 = f15;
			}
			else if(manoJ4.get(6).equals("16"))
			{
				j47 = f16;
			}
			else if(manoJ4.get(6).equals("22"))
			{
				j47 = f22;
			}
			else if(manoJ4.get(6).equals("23"))
			{
				j47 = f23;
			}
			else if(manoJ4.get(6).equals("24"))
			{
				j47 = f24;
			}
			else if(manoJ4.get(6).equals("25"))
			{
				j47 = f25;
			}
			else if(manoJ4.get(6).equals("26"))
			{
				j47 = f26;
			}
			else if(manoJ4.get(6).equals("33"))
			{
				j47 = f33;
			}
			else if(manoJ4.get(6).equals("34"))
			{
				j47 = f34;
			}
			else if(manoJ4.get(6).equals("35"))
			{
				j47 = f35;
			}
			else if(manoJ4.get(6).equals("36"))
			{
				j47 = f36;
			}
			else if(manoJ4.get(6).equals("44"))
			{
				j47 = f44;
			}
			else if(manoJ4.get(6).equals("45"))
			{
				j47 = f45;
			}
			else if(manoJ4.get(6).equals("46"))
			{
				j47 = f46;
			}
			else if(manoJ4.get(6).equals("55"))
			{
				j47 = f55;
			}
			else if(manoJ4.get(6).equals("56"))
			{
				j47 = f56;
			}
			else if(manoJ4.get(6).equals("66"))
			{
				j47 = f66;
			}
		}
																	/* POZO */
		if(!pozo.isEmpty())
		{
			if(pozo.size() == 14)
			{
				// Ficha 1 Pozo
				if(pozo.get(0).equals("00"))
				{
					p1 = f00;
				}
				else if(pozo.get(0).equals("01"))
				{
					p1 = f01;
				}
				else if(pozo.get(0).equals("02"))
				{
					p1 = f02;
				}
				else if(pozo.get(0).equals("03"))
				{
					p1 = f03;
				}
				else if(pozo.get(0).equals("04"))
				{
					p1 = f04;
				}
				else if(pozo.get(0).equals("05"))
				{
					p1 = f05;
				}
				else if(pozo.get(0).equals("06"))
				{
					p1 = f06;
				}
				else if(pozo.get(0).equals("11"))
				{
					p1 = f11;
				}
				else if(pozo.get(0).equals("12"))
				{
					p1 = f12;
				}
				else if(pozo.get(0).equals("13"))
				{
					p1 = f13;
				}
				else if(pozo.get(0).equals("14"))
				{
					p1 = f14;
				}
				else if(pozo.get(0).equals("15"))
				{
					p1 = f15;
				}
				else if(pozo.get(0).equals("16"))
				{
					p1 = f16;
				}
				else if(pozo.get(0).equals("22"))
				{
					p1 = f22;
				}
				else if(pozo.get(0).equals("23"))
				{
					p1 = f23;
				}
				else if(pozo.get(0).equals("24"))
				{
					p1 = f24;
				}
				else if(pozo.get(0).equals("25"))
				{
					p1 = f25;
				}
				else if(pozo.get(0).equals("26"))
				{
					p1 = f26;
				}
				else if(pozo.get(0).equals("33"))
				{
					p1 = f33;
				}
				else if(pozo.get(0).equals("34"))
				{
					p1 = f34;
				}
				else if(pozo.get(0).equals("35"))
				{
					p1 = f35;
				}
				else if(pozo.get(0).equals("36"))
				{
					p1 = f36;
				}
				else if(pozo.get(0).equals("44"))
				{
					p1 = f44;
				}
				else if(pozo.get(0).equals("45"))
				{
					p1 = f45;
				}
				else if(pozo.get(0).equals("46"))
				{
					p1 = f46;
				}
				else if(pozo.get(0).equals("55"))
				{
					p1 = f55;
				}
				else if(pozo.get(0).equals("56"))
				{
					p1 = f56;
				}
				else if(pozo.get(0).equals("66"))
				{
					p1 = f66;
				}
				// Ficha 2 Pozo
				else if(pozo.get(1).equals("00"))
				{
					p2 = f00;
				}
				else if(pozo.get(1).equals("01"))
				{
					p2 = f01;
				}
				else if(pozo.get(1).equals("02"))
				{
					p2 = f02;
				}
				else if(pozo.get(1).equals("03"))
				{
					p2 = f03;
				}
				else if(pozo.get(1).equals("04"))
				{
					p2 = f04;
				}
				else if(pozo.get(1).equals("05"))
				{
					p2 = f05;
				}
				else if(pozo.get(1).equals("06"))
				{
					p2 = f06;
				}
				else if(pozo.get(1).equals("11"))
				{
					p2 = f11;
				}
				else if(pozo.get(1).equals("12"))
				{
					p2 = f12;
				}
				else if(pozo.get(1).equals("13"))
				{
					p2 = f13;
				}
				else if(pozo.get(1).equals("14"))
				{
					p2 = f14;
				}
				else if(pozo.get(1).equals("15"))
				{
					p2 = f15;
				}
				else if(pozo.get(1).equals("16"))
				{
					p2 = f16;
				}
				else if(pozo.get(1).equals("22"))
				{
					p2 = f22;
				}
				else if(pozo.get(1).equals("23"))
				{
					p2 = f23;
				}
				else if(pozo.get(1).equals("24"))
				{
					p2 = f24;
				}
				else if(pozo.get(1).equals("25"))
				{
					p2 = f25;
				}
				else if(pozo.get(1).equals("26"))
				{
					p2 = f26;
				}
				else if(pozo.get(1).equals("33"))
				{
					p2 = f33;
				}
				else if(pozo.get(1).equals("34"))
				{
					p2 = f34;
				}
				else if(pozo.get(1).equals("35"))
				{
					p2 = f35;
				}
				else if(pozo.get(1).equals("36"))
				{
					p2 = f36;
				}
				else if(pozo.get(1).equals("44"))
				{
					p2 = f44;
				}
				else if(pozo.get(1).equals("45"))
				{
					p2 = f45;
				}
				else if(pozo.get(1).equals("46"))
				{
					p2 = f46;
				}
				else if(pozo.get(1).equals("55"))
				{
					p2 = f55;
				}
				else if(pozo.get(1).equals("56"))
				{
					p2 = f56;
				}
				else if(pozo.get(1).equals("66"))
				{
					p2 = f66;
				}
				// Ficha 3 Pozo
				else if(pozo.get(2).equals("00"))
				{
					p3 = f00;
				}
				else if(pozo.get(2).equals("01"))
				{
					p3 = f01;
				}
				else if(pozo.get(2).equals("02"))
				{
					p3 = f02;
				}
				else if(pozo.get(2).equals("03"))
				{
					p3 = f03;
				}
				else if(pozo.get(2).equals("04"))
				{
					p3 = f04;
				}
				else if(pozo.get(2).equals("05"))
				{
					p3 = f05;
				}
				else if(pozo.get(2).equals("06"))
				{
					p3 = f06;
				}
				else if(pozo.get(2).equals("11"))
				{
					p3 = f11;
				}
				else if(pozo.get(2).equals("12"))
				{
					p3 = f12;
				}
				else if(pozo.get(2).equals("13"))
				{
					p3 = f13;
				}
				else if(pozo.get(2).equals("14"))
				{
					p3 = f14;
				}
				else if(pozo.get(2).equals("15"))
				{
					p3 = f15;
				}
				else if(pozo.get(2).equals("16"))
				{
					p3 = f16;
				}
				else if(pozo.get(2).equals("22"))
				{
					p3 = f22;
				}
				else if(pozo.get(2).equals("23"))
				{
					p3 = f23;
				}
				else if(pozo.get(2).equals("24"))
				{
					p3 = f24;
				}
				else if(pozo.get(2).equals("25"))
				{
					p3 = f25;
				}
				else if(pozo.get(2).equals("26"))
				{
					p3 = f26;
				}
				else if(pozo.get(2).equals("33"))
				{
					p3 = f33;
				}
				else if(pozo.get(2).equals("34"))
				{
					p3 = f34;
				}
				else if(pozo.get(2).equals("35"))
				{
					p3 = f35;
				}
				else if(pozo.get(2).equals("36"))
				{
					p3 = f36;
				}
				else if(pozo.get(2).equals("44"))
				{
					p3 = f44;
				}
				else if(pozo.get(2).equals("45"))
				{
					p3 = f45;
				}
				else if(pozo.get(2).equals("46"))
				{
					p3 = f46;
				}
				else if(pozo.get(2).equals("55"))
				{
					p3 = f55;
				}
				else if(pozo.get(2).equals("56"))
				{
					p3 = f56;
				}
				else if(pozo.get(2).equals("66"))
				{
					p3 = f66;
				}
				// Ficha 4 Pozo
				else if(pozo.get(3).equals("00"))
				{
					p4 = f00;
				}
				else if(pozo.get(3).equals("01"))
				{
					p4 = f01;
				}
				else if(pozo.get(3).equals("02"))
				{
					p4 = f02;
				}
				else if(pozo.get(3).equals("03"))
				{
					p4 = f03;
				}
				else if(pozo.get(3).equals("04"))
				{
					p4 = f04;
				}
				else if(pozo.get(3).equals("05"))
				{
					p4 = f05;
				}
				else if(pozo.get(3).equals("06"))
				{
					p4 = f06;
				}
				else if(pozo.get(3).equals("11"))
				{
					p4 = f11;
				}
				else if(pozo.get(3).equals("12"))
				{
					p4 = f12;
				}
				else if(pozo.get(3).equals("13"))
				{
					p4 = f13;
				}
				else if(pozo.get(3).equals("14"))
				{
					p4 = f14;
				}
				else if(pozo.get(3).equals("15"))
				{
					p4 = f15;
				}
				else if(pozo.get(3).equals("16"))
				{
					p4 = f16;
				}
				else if(pozo.get(3).equals("22"))
				{
					p4 = f22;
				}
				else if(pozo.get(3).equals("23"))
				{
					p4 = f23;
				}
				else if(pozo.get(3).equals("24"))
				{
					p4 = f24;
				}
				else if(pozo.get(3).equals("25"))
				{
					p4 = f25;
				}
				else if(pozo.get(3).equals("26"))
				{
					p4 = f26;
				}
				else if(pozo.get(3).equals("33"))
				{
					p4 = f33;
				}
				else if(pozo.get(3).equals("34"))
				{
					p4 = f34;
				}
				else if(pozo.get(3).equals("35"))
				{
					p4 = f35;
				}
				else if(pozo.get(3).equals("36"))
				{
					p4 = f36;
				}
				else if(pozo.get(3).equals("44"))
				{
					p4 = f44;
				}
				else if(pozo.get(3).equals("45"))
				{
					p4 = f45;
				}
				else if(pozo.get(3).equals("46"))
				{
					p4 = f46;
				}
				else if(pozo.get(3).equals("55"))
				{
					p4 = f55;
				}
				else if(pozo.get(3).equals("56"))
				{
					p4 = f56;
				}
				else if(pozo.get(3).equals("66"))
				{
					p4 = f66;
				}
				// Ficha 5 Pozo
				else if(pozo.get(4).equals("00"))
				{
					p5 = f00;
				}
				else if(pozo.get(4).equals("01"))
				{
					p5 = f01;
				}
				else if(pozo.get(4).equals("02"))
				{
					p5 = f02;
				}
				else if(pozo.get(4).equals("03"))
				{
					p5 = f03;
				}
				else if(pozo.get(4).equals("04"))
				{
					p5 = f04;
				}
				else if(pozo.get(4).equals("05"))
				{
					p5 = f05;
				}
				else if(pozo.get(4).equals("06"))
				{
					p5 = f06;
				}
				else if(pozo.get(4).equals("11"))
				{
					p5 = f11;
				}
				else if(pozo.get(4).equals("12"))
				{
					p5 = f12;
				}
				else if(pozo.get(4).equals("13"))
				{
					p5 = f13;
				}
				else if(pozo.get(4).equals("14"))
				{
					p5 = f14;
				}
				else if(pozo.get(4).equals("15"))
				{
					p5 = f15;
				}
				else if(pozo.get(4).equals("16"))
				{
					p5 = f16;
				}
				else if(pozo.get(4).equals("22"))
				{
					p5 = f22;
				}
				else if(pozo.get(4).equals("23"))
				{
					p5 = f23;
				}
				else if(pozo.get(4).equals("24"))
				{
					p5 = f24;
				}
				else if(pozo.get(4).equals("25"))
				{
					p5 = f25;
				}
				else if(pozo.get(4).equals("26"))
				{
					p5 = f26;
				}
				else if(pozo.get(4).equals("33"))
				{
					p5 = f33;
				}
				else if(pozo.get(4).equals("34"))
				{
					p5 = f34;
				}
				else if(pozo.get(4).equals("35"))
				{
					p5 = f35;
				}
				else if(pozo.get(4).equals("36"))
				{
					p5 = f36;
				}
				else if(pozo.get(4).equals("44"))
				{
					p5 = f44;
				}
				else if(pozo.get(4).equals("45"))
				{
					p5 = f45;
				}
				else if(pozo.get(4).equals("46"))
				{
					p5 = f46;
				}
				else if(pozo.get(4).equals("55"))
				{
					p5 = f55;
				}
				else if(pozo.get(4).equals("56"))
				{
					p5 = f56;
				}
				else if(pozo.get(4).equals("66"))
				{
					p5 = f66;
				}
				// Ficha 6 Pozo
				else if(pozo.get(5).equals("00"))
				{
					p6 = f00;
				}
				else if(pozo.get(5).equals("01"))
				{
					p6 = f01;
				}
				else if(pozo.get(5).equals("02"))
				{
					p6 = f02;
				}
				else if(pozo.get(5).equals("03"))
				{
					p6 = f03;
				}
				else if(pozo.get(5).equals("04"))
				{
					p6 = f04;
				}
				else if(pozo.get(5).equals("05"))
				{
					p6 = f05;
				}
				else if(pozo.get(5).equals("06"))
				{
					p6 = f06;
				}
				else if(pozo.get(5).equals("11"))
				{
					p6 = f11;
				}
				else if(pozo.get(5).equals("12"))
				{
					p6 = f12;
				}
				else if(pozo.get(5).equals("13"))
				{
					p6 = f13;
				}
				else if(pozo.get(5).equals("14"))
				{
					p6 = f14;
				}
				else if(pozo.get(5).equals("15"))
				{
					p6 = f15;
				}
				else if(pozo.get(5).equals("16"))
				{
					p6 = f16;
				}
				else if(pozo.get(5).equals("22"))
				{
					p6 = f22;
				}
				else if(pozo.get(5).equals("23"))
				{
					p6 = f23;
				}
				else if(pozo.get(5).equals("24"))
				{
					p6 = f24;
				}
				else if(pozo.get(5).equals("25"))
				{
					p6 = f25;
				}
				else if(pozo.get(5).equals("26"))
				{
					p6 = f26;
				}
				else if(pozo.get(5).equals("33"))
				{
					p6 = f33;
				}
				else if(pozo.get(5).equals("34"))
				{
					p6 = f34;
				}
				else if(pozo.get(5).equals("35"))
				{
					p6 = f35;
				}
				else if(pozo.get(5).equals("36"))
				{
					p6 = f36;
				}
				else if(pozo.get(5).equals("44"))
				{
					p6 = f44;
				}
				else if(pozo.get(5).equals("45"))
				{
					p6 = f45;
				}
				else if(pozo.get(5).equals("46"))
				{
					p6 = f46;
				}
				else if(pozo.get(5).equals("55"))
				{
					p6 = f55;
				}
				else if(pozo.get(5).equals("56"))
				{
					p6 = f56;
				}
				else if(pozo.get(5).equals("66"))
				{
					p6 = f66;
				}
				// Ficha 7 Pozo
				else if(pozo.get(6).equals("00"))
				{
					p7 = f00;
				}
				else if(pozo.get(6).equals("01"))
				{
					p7 = f01;
				}
				else if(pozo.get(6).equals("02"))
				{
					p7 = f02;
				}
				else if(pozo.get(6).equals("03"))
				{
					p7 = f03;
				}
				else if(pozo.get(6).equals("04"))
				{
					p7 = f04;
				}
				else if(pozo.get(6).equals("05"))
				{
					p7 = f05;
				}
				else if(pozo.get(6).equals("06"))
				{
					p7 = f06;
				}
				else if(pozo.get(6).equals("11"))
				{
					p7 = f11;
				}
				else if(pozo.get(6).equals("12"))
				{
					p7 = f12;
				}
				else if(pozo.get(6).equals("13"))
				{
					p7 = f13;
				}
				else if(pozo.get(6).equals("14"))
				{
					p7 = f14;
				}
				else if(pozo.get(6).equals("15"))
				{
					p7 = f15;
				}
				else if(pozo.get(6).equals("16"))
				{
					p7 = f16;
				}
				else if(pozo.get(6).equals("22"))
				{
					p7 = f22;
				}
				else if(pozo.get(6).equals("23"))
				{
					p7 = f23;
				}
				else if(pozo.get(6).equals("24"))
				{
					p7 = f24;
				}
				else if(pozo.get(6).equals("25"))
				{
					p7 = f25;
				}
				else if(pozo.get(6).equals("26"))
				{
					p7 = f26;
				}
				else if(pozo.get(6).equals("33"))
				{
					p7 = f33;
				}
				else if(pozo.get(6).equals("34"))
				{
					p7 = f34;
				}
				else if(pozo.get(6).equals("35"))
				{
					p7 = f35;
				}
				else if(pozo.get(6).equals("36"))
				{
					p7 = f36;
				}
				else if(pozo.get(6).equals("44"))
				{
					p7 = f44;
				}
				else if(pozo.get(6).equals("45"))
				{
					p7 = f45;
				}
				else if(pozo.get(6).equals("46"))
				{
					p7 = f46;
				}
				else if(pozo.get(6).equals("55"))
				{
					p7 = f55;
				}
				else if(pozo.get(6).equals("56"))
				{
					p7 = f56;
				}
				else if(pozo.get(6).equals("66"))
				{
					p7 = f66;
				}
				// Ficha 8 Pozo
				else if(pozo.get(7).equals("00"))
				{
					p8 = f00;
				}
				else if(pozo.get(7).equals("01"))
				{
					p8 = f01;
				}
				else if(pozo.get(7).equals("02"))
				{
					p8 = f02;
				}
				else if(pozo.get(7).equals("03"))
				{
					p8 = f03;
				}
				else if(pozo.get(7).equals("04"))
				{
					p8 = f04;
				}
				else if(pozo.get(7).equals("05"))
				{
					p8 = f05;
				}
				else if(pozo.get(7).equals("06"))
				{
					p8 = f06;
				}
				else if(pozo.get(7).equals("11"))
				{
					p8 = f11;
				}
				else if(pozo.get(7).equals("12"))
				{
					p8 = f12;
				}
				else if(pozo.get(7).equals("13"))
				{
					p8 = f13;
				}
				else if(pozo.get(7).equals("14"))
				{
					p8 = f14;
				}
				else if(pozo.get(7).equals("15"))
				{
					p8 = f15;
				}
				else if(pozo.get(7).equals("16"))
				{
					p8 = f16;
				}
				else if(pozo.get(7).equals("22"))
				{
					p8 = f22;
				}
				else if(pozo.get(7).equals("23"))
				{
					p8 = f23;
				}
				else if(pozo.get(7).equals("24"))
				{
					p8 = f24;
				}
				else if(pozo.get(7).equals("25"))
				{
					p8 = f25;
				}
				else if(pozo.get(7).equals("26"))
				{
					p8 = f26;
				}
				else if(pozo.get(7).equals("33"))
				{
					p8 = f33;
				}
				else if(pozo.get(7).equals("34"))
				{
					p8 = f34;
				}
				else if(pozo.get(7).equals("35"))
				{
					p8 = f35;
				}
				else if(pozo.get(7).equals("36"))
				{
					p8 = f36;
				}
				else if(pozo.get(7).equals("44"))
				{
					p8 = f44;
				}
				else if(pozo.get(7).equals("45"))
				{
					p8 = f45;
				}
				else if(pozo.get(7).equals("46"))
				{
					p8 = f46;
				}
				else if(pozo.get(7).equals("55"))
				{
					p8 = f55;
				}
				else if(pozo.get(7).equals("56"))
				{
					p8 = f56;
				}
				else if(pozo.get(7).equals("66"))
				{
					p8 = f66;
				}
				// Ficha 9 Pozo
				else if(pozo.get(8).equals("00"))
				{
					p9 = f00;
				}
				else if(pozo.get(8).equals("01"))
				{
					p9 = f01;
				}
				else if(pozo.get(8).equals("02"))
				{
					p9 = f02;
				}
				else if(pozo.get(8).equals("03"))
				{
					p9 = f03;
				}
				else if(pozo.get(8).equals("04"))
				{
					p9 = f04;
				}
				else if(pozo.get(8).equals("05"))
				{
					p9 = f05;
				}
				else if(pozo.get(8).equals("06"))
				{
					p9 = f06;
				}
				else if(pozo.get(8).equals("11"))
				{
					p9 = f11;
				}
				else if(pozo.get(8).equals("12"))
				{
					p9 = f12;
				}
				else if(pozo.get(8).equals("13"))
				{
					p9 = f13;
				}
				else if(pozo.get(8).equals("14"))
				{
					p9 = f14;
				}
				else if(pozo.get(8).equals("15"))
				{
					p9 = f15;
				}
				else if(pozo.get(8).equals("16"))
				{
					p9 = f16;
				}
				else if(pozo.get(8).equals("22"))
				{
					p9 = f22;
				}
				else if(pozo.get(8).equals("23"))
				{
					p9 = f23;
				}
				else if(pozo.get(8).equals("24"))
				{
					p9 = f24;
				}
				else if(pozo.get(8).equals("25"))
				{
					p9 = f25;
				}
				else if(pozo.get(8).equals("26"))
				{
					p9 = f26;
				}
				else if(pozo.get(8).equals("33"))
				{
					p9 = f33;
				}
				else if(pozo.get(8).equals("34"))
				{
					p9 = f34;
				}
				else if(pozo.get(8).equals("35"))
				{
					p9 = f35;
				}
				else if(pozo.get(8).equals("36"))
				{
					p9 = f36;
				}
				else if(pozo.get(8).equals("44"))
				{
					p9 = f44;
				}
				else if(pozo.get(8).equals("45"))
				{
					p9 = f45;
				}
				else if(pozo.get(8).equals("46"))
				{
					p9 = f46;
				}
				else if(pozo.get(8).equals("55"))
				{
					p9 = f55;
				}
				else if(pozo.get(8).equals("56"))
				{
					p9 = f56;
				}
				else if(pozo.get(8).equals("66"))
				{
					p9 = f66;
				}
				// Ficha 10 Pozo
				else if(pozo.get(9).equals("00"))
				{
					p10 = f00;
				}
				else if(pozo.get(9).equals("01"))
				{
					p10 = f01;
				}
				else if(pozo.get(9).equals("02"))
				{
					p10 = f02;
				}
				else if(pozo.get(9).equals("03"))
				{
					p10 = f03;
				}
				else if(pozo.get(9).equals("04"))
				{
					p10 = f04;
				}
				else if(pozo.get(9).equals("05"))
				{
					p10 = f05;
				}
				else if(pozo.get(9).equals("06"))
				{
					p10 = f06;
				}
				else if(pozo.get(9).equals("11"))
				{
					p10 = f11;
				}
				else if(pozo.get(9).equals("12"))
				{
					p10 = f12;
				}
				else if(pozo.get(9).equals("13"))
				{
					p10 = f13;
				}
				else if(pozo.get(9).equals("14"))
				{
					p10 = f14;
				}
				else if(pozo.get(9).equals("15"))
				{
					p10 = f15;
				}
				else if(pozo.get(9).equals("16"))
				{
					p10 = f16;
				}
				else if(pozo.get(9).equals("22"))
				{
					p10 = f22;
				}
				else if(pozo.get(9).equals("23"))
				{
					p10 = f23;
				}
				else if(pozo.get(9).equals("24"))
				{
					p10 = f24;
				}
				else if(pozo.get(9).equals("25"))
				{
					p10 = f25;
				}
				else if(pozo.get(9).equals("26"))
				{
					p10 = f26;
				}
				else if(pozo.get(9).equals("33"))
				{
					p10 = f33;
				}
				else if(pozo.get(9).equals("34"))
				{
					p10 = f34;
				}
				else if(pozo.get(9).equals("35"))
				{
					p10 = f35;
				}
				else if(pozo.get(9).equals("36"))
				{
					p10 = f36;
				}
				else if(pozo.get(9).equals("44"))
				{
					p10 = f44;
				}
				else if(pozo.get(9).equals("45"))
				{
					p10 = f45;
				}
				else if(pozo.get(9).equals("46"))
				{
					p10 = f46;
				}
				else if(pozo.get(9).equals("55"))
				{
					p10 = f55;
				}
				else if(pozo.get(9).equals("56"))
				{
					p10 = f56;
				}
				else if(pozo.get(9).equals("66"))
				{
					p10 = f66;
				}
				// Ficha 11 Pozo
				else if(pozo.get(10).equals("00"))
				{
					p11 = f00;
				}
				else if(pozo.get(10).equals("01"))
				{
					p11 = f01;
				}
				else if(pozo.get(10).equals("02"))
				{
					p11 = f02;
				}
				else if(pozo.get(10).equals("03"))
				{
					p11 = f03;
				}
				else if(pozo.get(10).equals("04"))
				{
					p11 = f04;
				}
				else if(pozo.get(10).equals("05"))
				{
					p11 = f05;
				}
				else if(pozo.get(10).equals("06"))
				{
					p11 = f06;
				}
				else if(pozo.get(10).equals("11"))
				{
					p11 = f11;
				}
				else if(pozo.get(10).equals("12"))
				{
					p11 = f12;
				}
				else if(pozo.get(10).equals("13"))
				{
					p11 = f13;
				}
				else if(pozo.get(10).equals("14"))
				{
					p11 = f14;
				}
				else if(pozo.get(10).equals("15"))
				{
					p11 = f15;
				}
				else if(pozo.get(10).equals("16"))
				{
					p11 = f16;
				}
				else if(pozo.get(10).equals("22"))
				{
					p11 = f22;
				}
				else if(pozo.get(10).equals("23"))
				{
					p11 = f23;
				}
				else if(pozo.get(10).equals("24"))
				{
					p11 = f24;
				}
				else if(pozo.get(10).equals("25"))
				{
					p11 = f25;
				}
				else if(pozo.get(10).equals("26"))
				{
					p11 = f26;
				}
				else if(pozo.get(10).equals("33"))
				{
					p11 = f33;
				}
				else if(pozo.get(10).equals("34"))
				{
					p11 = f34;
				}
				else if(pozo.get(10).equals("35"))
				{
					p11 = f35;
				}
				else if(pozo.get(10).equals("36"))
				{
					p11 = f36;
				}
				else if(pozo.get(10).equals("44"))
				{
					p11 = f44;
				}
				else if(pozo.get(10).equals("45"))
				{
					p11 = f45;
				}
				else if(pozo.get(10).equals("46"))
				{
					p11 = f46;
				}
				else if(pozo.get(10).equals("55"))
				{
					p11 = f55;
				}
				else if(pozo.get(10).equals("56"))
				{
					p11 = f56;
				}
				else if(pozo.get(10).equals("66"))
				{
					p11 = f66;
				}
				// Ficha 12 Pozo
				else if(pozo.get(11).equals("00"))
				{
					p12 = f00;
				}
				else if(pozo.get(11).equals("01"))
				{
					p12 = f01;
				}
				else if(pozo.get(11).equals("02"))
				{
					p12 = f02;
				}
				else if(pozo.get(11).equals("03"))
				{
					p12 = f03;
				}
				else if(pozo.get(11).equals("04"))
				{
					p12 = f04;
				}
				else if(pozo.get(11).equals("05"))
				{
					p12 = f05;
				}
				else if(pozo.get(11).equals("06"))
				{
					p12 = f06;
				}
				else if(pozo.get(11).equals("11"))
				{
					p12 = f11;
				}
				else if(pozo.get(11).equals("12"))
				{
					p12 = f12;
				}
				else if(pozo.get(11).equals("13"))
				{
					p12 = f13;
				}
				else if(pozo.get(11).equals("14"))
				{
					p12 = f14;
				}
				else if(pozo.get(11).equals("15"))
				{
					p12 = f15;
				}
				else if(pozo.get(11).equals("16"))
				{
					p12 = f16;
				}
				else if(pozo.get(11).equals("22"))
				{
					p12 = f22;
				}
				else if(pozo.get(11).equals("23"))
				{
					p12 = f23;
				}
				else if(pozo.get(11).equals("24"))
				{
					p12 = f24;
				}
				else if(pozo.get(11).equals("25"))
				{
					p12 = f25;
				}
				else if(pozo.get(11).equals("26"))
				{
					p12 = f26;
				}
				else if(pozo.get(11).equals("33"))
				{
					p12 = f33;
				}
				else if(pozo.get(11).equals("34"))
				{
					p12 = f34;
				}
				else if(pozo.get(11).equals("35"))
				{
					p12 = f35;
				}
				else if(pozo.get(11).equals("36"))
				{
					p12 = f36;
				}
				else if(pozo.get(11).equals("44"))
				{
					p12 = f44;
				}
				else if(pozo.get(11).equals("45"))
				{
					p12 = f45;
				}
				else if(pozo.get(11).equals("46"))
				{
					p12 = f46;
				}
				else if(pozo.get(11).equals("55"))
				{
					p12 = f55;
				}
				else if(pozo.get(11).equals("56"))
				{
					p12 = f56;
				}
				else if(pozo.get(11).equals("66"))
				{
					p12 = f66;
				}
				// Ficha 13 Pozo
				else if(pozo.get(12).equals("00"))
				{
					p13 = f00;
				}
				else if(pozo.get(12).equals("01"))
				{
					p13 = f01;
				}
				else if(pozo.get(12).equals("02"))
				{
					p13 = f02;
				}
				else if(pozo.get(12).equals("03"))
				{
					p13 = f03;
				}
				else if(pozo.get(12).equals("04"))
				{
					p13 = f04;
				}
				else if(pozo.get(12).equals("05"))
				{
					p13 = f05;
				}
				else if(pozo.get(12).equals("06"))
				{
					p13 = f06;
				}
				else if(pozo.get(12).equals("11"))
				{
					p13 = f11;
				}
				else if(pozo.get(12).equals("12"))
				{
					p13 = f12;
				}
				else if(pozo.get(12).equals("13"))
				{
					p13 = f13;
				}
				else if(pozo.get(12).equals("14"))
				{
					p13 = f14;
				}
				else if(pozo.get(12).equals("15"))
				{
					p13 = f15;
				}
				else if(pozo.get(12).equals("16"))
				{
					p13 = f16;
				}
				else if(pozo.get(12).equals("22"))
				{
					p13 = f22;
				}
				else if(pozo.get(12).equals("23"))
				{
					p13 = f23;
				}
				else if(pozo.get(12).equals("24"))
				{
					p13 = f24;
				}
				else if(pozo.get(12).equals("25"))
				{
					p13 = f25;
				}
				else if(pozo.get(12).equals("26"))
				{
					p13 = f26;
				}
				else if(pozo.get(12).equals("33"))
				{
					p13 = f33;
				}
				else if(pozo.get(12).equals("34"))
				{
					p13 = f34;
				}
				else if(pozo.get(12).equals("35"))
				{
					p13 = f35;
				}
				else if(pozo.get(12).equals("36"))
				{
					p13 = f36;
				}
				else if(pozo.get(12).equals("44"))
				{
					p13 = f44;
				}
				else if(pozo.get(12).equals("45"))
				{
					p13 = f45;
				}
				else if(pozo.get(12).equals("46"))
				{
					p13 = f46;
				}
				else if(pozo.get(12).equals("55"))
				{
					p13 = f55;
				}
				else if(pozo.get(12).equals("56"))
				{
					p13 = f56;
				}
				else if(pozo.get(12).equals("66"))
				{
					p13 = f66;
				}
				// Ficha 14 Pozo
				else if(pozo.get(13).equals("00"))
				{
					p14 = f00;
				}
				else if(pozo.get(13).equals("01"))
				{
					p14 = f01;
				}
				else if(pozo.get(13).equals("02"))
				{
					p14 = f02;
				}
				else if(pozo.get(13).equals("03"))
				{
					p14 = f03;
				}
				else if(pozo.get(13).equals("04"))
				{
					p14 = f04;
				}
				else if(pozo.get(13).equals("05"))
				{
					p14 = f05;
				}
				else if(pozo.get(13).equals("06"))
				{
					p14 = f06;
				}
				else if(pozo.get(13).equals("11"))
				{
					p14 = f11;
				}
				else if(pozo.get(13).equals("12"))
				{
					p14 = f12;
				}
				else if(pozo.get(13).equals("13"))
				{
					p14 = f13;
				}
				else if(pozo.get(13).equals("14"))
				{
					p14 = f14;
				}
				else if(pozo.get(13).equals("15"))
				{
					p14 = f15;
				}
				else if(pozo.get(13).equals("16"))
				{
					p14 = f16;
				}
				else if(pozo.get(13).equals("22"))
				{
					p14 = f22;
				}
				else if(pozo.get(13).equals("23"))
				{
					p14 = f23;
				}
				else if(pozo.get(13).equals("24"))
				{
					p14 = f24;
				}
				else if(pozo.get(13).equals("25"))
				{
					p14 = f25;
				}
				else if(pozo.get(13).equals("26"))
				{
					p14 = f26;
				}
				else if(pozo.get(13).equals("33"))
				{
					p14 = f33;
				}
				else if(pozo.get(13).equals("34"))
				{
					p14 = f34;
				}
				else if(pozo.get(13).equals("35"))
				{
					p14 = f35;
				}
				else if(pozo.get(13).equals("36"))
				{
					p14 = f36;
				}
				else if(pozo.get(13).equals("44"))
				{
					p14 = f44;
				}
				else if(pozo.get(13).equals("45"))
				{
					p14 = f45;
				}
				else if(pozo.get(13).equals("46"))
				{
					p14 = f46;
				}
				else if(pozo.get(13).equals("55"))
				{
					p14 = f55;
				}
				else if(pozo.get(13).equals("56"))
				{
					p14 = f56;
				}
				else if(pozo.get(13).equals("66"))
				{
					p14 = f66;
				}
			}
			else if(pozo.size() == 7)
			{
				// Ficha 1 Pozo
				if(pozo.get(0).equals("00"))
				{
					p1 = f00;
				}
				else if(pozo.get(0).equals("01"))
				{
					p1 = f01;
				}
				else if(pozo.get(0).equals("02"))
				{
					p1 = f02;
				}
				else if(pozo.get(0).equals("03"))
				{
					p1 = f03;
				}
				else if(pozo.get(0).equals("04"))
				{
					p1 = f04;
				}
				else if(pozo.get(0).equals("05"))
				{
					p1 = f05;
				}
				else if(pozo.get(0).equals("06"))
				{
					p1 = f06;
				}
				else if(pozo.get(0).equals("11"))
				{
					p1 = f11;
				}
				else if(pozo.get(0).equals("12"))
				{
					p1 = f12;
				}
				else if(pozo.get(0).equals("13"))
				{
					p1 = f13;
				}
				else if(pozo.get(0).equals("14"))
				{
					p1 = f14;
				}
				else if(pozo.get(0).equals("15"))
				{
					p1 = f15;
				}
				else if(pozo.get(0).equals("16"))
				{
					p1 = f16;
				}
				else if(pozo.get(0).equals("22"))
				{
					p1 = f22;
				}
				else if(pozo.get(0).equals("23"))
				{
					p1 = f23;
				}
				else if(pozo.get(0).equals("24"))
				{
					p1 = f24;
				}
				else if(pozo.get(0).equals("25"))
				{
					p1 = f25;
				}
				else if(pozo.get(0).equals("26"))
				{
					p1 = f26;
				}
				else if(pozo.get(0).equals("33"))
				{
					p1 = f33;
				}
				else if(pozo.get(0).equals("34"))
				{
					p1 = f34;
				}
				else if(pozo.get(0).equals("35"))
				{
					p1 = f35;
				}
				else if(pozo.get(0).equals("36"))
				{
					p1 = f36;
				}
				else if(pozo.get(0).equals("44"))
				{
					p1 = f44;
				}
				else if(pozo.get(0).equals("45"))
				{
					p1 = f45;
				}
				else if(pozo.get(0).equals("46"))
				{
					p1 = f46;
				}
				else if(pozo.get(0).equals("55"))
				{
					p1 = f55;
				}
				else if(pozo.get(0).equals("56"))
				{
					p1 = f56;
				}
				else if(pozo.get(0).equals("66"))
				{
					p1 = f66;
				}
				// Ficha 2 Pozo
				else if(pozo.get(1).equals("00"))
				{
					p2 = f00;
				}
				else if(pozo.get(1).equals("01"))
				{
					p2 = f01;
				}
				else if(pozo.get(1).equals("02"))
				{
					p2 = f02;
				}
				else if(pozo.get(1).equals("03"))
				{
					p2 = f03;
				}
				else if(pozo.get(1).equals("04"))
				{
					p2 = f04;
				}
				else if(pozo.get(1).equals("05"))
				{
					p2 = f05;
				}
				else if(pozo.get(1).equals("06"))
				{
					p2 = f06;
				}
				else if(pozo.get(1).equals("11"))
				{
					p2 = f11;
				}
				else if(pozo.get(1).equals("12"))
				{
					p2 = f12;
				}
				else if(pozo.get(1).equals("13"))
				{
					p2 = f13;
				}
				else if(pozo.get(1).equals("14"))
				{
					p2 = f14;
				}
				else if(pozo.get(1).equals("15"))
				{
					p2 = f15;
				}
				else if(pozo.get(1).equals("16"))
				{
					p2 = f16;
				}
				else if(pozo.get(1).equals("22"))
				{
					p2 = f22;
				}
				else if(pozo.get(1).equals("23"))
				{
					p2 = f23;
				}
				else if(pozo.get(1).equals("24"))
				{
					p2 = f24;
				}
				else if(pozo.get(1).equals("25"))
				{
					p2 = f25;
				}
				else if(pozo.get(1).equals("26"))
				{
					p2 = f26;
				}
				else if(pozo.get(1).equals("33"))
				{
					p2 = f33;
				}
				else if(pozo.get(1).equals("34"))
				{
					p2 = f34;
				}
				else if(pozo.get(1).equals("35"))
				{
					p2 = f35;
				}
				else if(pozo.get(1).equals("36"))
				{
					p2 = f36;
				}
				else if(pozo.get(1).equals("44"))
				{
					p2 = f44;
				}
				else if(pozo.get(1).equals("45"))
				{
					p2 = f45;
				}
				else if(pozo.get(1).equals("46"))
				{
					p2 = f46;
				}
				else if(pozo.get(1).equals("55"))
				{
					p2 = f55;
				}
				else if(pozo.get(1).equals("56"))
				{
					p2 = f56;
				}
				else if(pozo.get(1).equals("66"))
				{
					p2 = f66;
				}
				// Ficha 3 Pozo
				else if(pozo.get(2).equals("00"))
				{
					p3 = f00;
				}
				else if(pozo.get(2).equals("01"))
				{
					p3 = f01;
				}
				else if(pozo.get(2).equals("02"))
				{
					p3 = f02;
				}
				else if(pozo.get(2).equals("03"))
				{
					p3 = f03;
				}
				else if(pozo.get(2).equals("04"))
				{
					p3 = f04;
				}
				else if(pozo.get(2).equals("05"))
				{
					p3 = f05;
				}
				else if(pozo.get(2).equals("06"))
				{
					p3 = f06;
				}
				else if(pozo.get(2).equals("11"))
				{
					p3 = f11;
				}
				else if(pozo.get(2).equals("12"))
				{
					p3 = f12;
				}
				else if(pozo.get(2).equals("13"))
				{
					p3 = f13;
				}
				else if(pozo.get(2).equals("14"))
				{
					p3 = f14;
				}
				else if(pozo.get(2).equals("15"))
				{
					p3 = f15;
				}
				else if(pozo.get(2).equals("16"))
				{
					p3 = f16;
				}
				else if(pozo.get(2).equals("22"))
				{
					p3 = f22;
				}
				else if(pozo.get(2).equals("23"))
				{
					p3 = f23;
				}
				else if(pozo.get(2).equals("24"))
				{
					p3 = f24;
				}
				else if(pozo.get(2).equals("25"))
				{
					p3 = f25;
				}
				else if(pozo.get(2).equals("26"))
				{
					p3 = f26;
				}
				else if(pozo.get(2).equals("33"))
				{
					p3 = f33;
				}
				else if(pozo.get(2).equals("34"))
				{
					p3 = f34;
				}
				else if(pozo.get(2).equals("35"))
				{
					p3 = f35;
				}
				else if(pozo.get(2).equals("36"))
				{
					p3 = f36;
				}
				else if(pozo.get(2).equals("44"))
				{
					p3 = f44;
				}
				else if(pozo.get(2).equals("45"))
				{
					p3 = f45;
				}
				else if(pozo.get(2).equals("46"))
				{
					p3 = f46;
				}
				else if(pozo.get(2).equals("55"))
				{
					p3 = f55;
				}
				else if(pozo.get(2).equals("56"))
				{
					p3 = f56;
				}
				else if(pozo.get(2).equals("66"))
				{
					p3 = f66;
				}
				// Ficha 4 Pozo
				else if(pozo.get(3).equals("00"))
				{
					p4 = f00;
				}
				else if(pozo.get(3).equals("01"))
				{
					p4 = f01;
				}
				else if(pozo.get(3).equals("02"))
				{
					p4 = f02;
				}
				else if(pozo.get(3).equals("03"))
				{
					p4 = f03;
				}
				else if(pozo.get(3).equals("04"))
				{
					p4 = f04;
				}
				else if(pozo.get(3).equals("05"))
				{
					p4 = f05;
				}
				else if(pozo.get(3).equals("06"))
				{
					p4 = f06;
				}
				else if(pozo.get(3).equals("11"))
				{
					p4 = f11;
				}
				else if(pozo.get(3).equals("12"))
				{
					p4 = f12;
				}
				else if(pozo.get(3).equals("13"))
				{
					p4 = f13;
				}
				else if(pozo.get(3).equals("14"))
				{
					p4 = f14;
				}
				else if(pozo.get(3).equals("15"))
				{
					p4 = f15;
				}
				else if(pozo.get(3).equals("16"))
				{
					p4 = f16;
				}
				else if(pozo.get(3).equals("22"))
				{
					p4 = f22;
				}
				else if(pozo.get(3).equals("23"))
				{
					p4 = f23;
				}
				else if(pozo.get(3).equals("24"))
				{
					p4 = f24;
				}
				else if(pozo.get(3).equals("25"))
				{
					p4 = f25;
				}
				else if(pozo.get(3).equals("26"))
				{
					p4 = f26;
				}
				else if(pozo.get(3).equals("33"))
				{
					p4 = f33;
				}
				else if(pozo.get(3).equals("34"))
				{
					p4 = f34;
				}
				else if(pozo.get(3).equals("35"))
				{
					p4 = f35;
				}
				else if(pozo.get(3).equals("36"))
				{
					p4 = f36;
				}
				else if(pozo.get(3).equals("44"))
				{
					p4 = f44;
				}
				else if(pozo.get(3).equals("45"))
				{
					p4 = f45;
				}
				else if(pozo.get(3).equals("46"))
				{
					p4 = f46;
				}
				else if(pozo.get(3).equals("55"))
				{
					p4 = f55;
				}
				else if(pozo.get(3).equals("56"))
				{
					p4 = f56;
				}
				else if(pozo.get(3).equals("66"))
				{
					p4 = f66;
				}
				// Ficha 5 Pozo
				else if(pozo.get(4).equals("00"))
				{
					p5 = f00;
				}
				else if(pozo.get(4).equals("01"))
				{
					p5 = f01;
				}
				else if(pozo.get(4).equals("02"))
				{
					p5 = f02;
				}
				else if(pozo.get(4).equals("03"))
				{
					p5 = f03;
				}
				else if(pozo.get(4).equals("04"))
				{
					p5 = f04;
				}
				else if(pozo.get(4).equals("05"))
				{
					p5 = f05;
				}
				else if(pozo.get(4).equals("06"))
				{
					p5 = f06;
				}
				else if(pozo.get(4).equals("11"))
				{
					p5 = f11;
				}
				else if(pozo.get(4).equals("12"))
				{
					p5 = f12;
				}
				else if(pozo.get(4).equals("13"))
				{
					p5 = f13;
				}
				else if(pozo.get(4).equals("14"))
				{
					p5 = f14;
				}
				else if(pozo.get(4).equals("15"))
				{
					p5 = f15;
				}
				else if(pozo.get(4).equals("16"))
				{
					p5 = f16;
				}
				else if(pozo.get(4).equals("22"))
				{
					p5 = f22;
				}
				else if(pozo.get(4).equals("23"))
				{
					p5 = f23;
				}
				else if(pozo.get(4).equals("24"))
				{
					p5 = f24;
				}
				else if(pozo.get(4).equals("25"))
				{
					p5 = f25;
				}
				else if(pozo.get(4).equals("26"))
				{
					p5 = f26;
				}
				else if(pozo.get(4).equals("33"))
				{
					p5 = f33;
				}
				else if(pozo.get(4).equals("34"))
				{
					p5 = f34;
				}
				else if(pozo.get(4).equals("35"))
				{
					p5 = f35;
				}
				else if(pozo.get(4).equals("36"))
				{
					p5 = f36;
				}
				else if(pozo.get(4).equals("44"))
				{
					p5 = f44;
				}
				else if(pozo.get(4).equals("45"))
				{
					p5 = f45;
				}
				else if(pozo.get(4).equals("46"))
				{
					p5 = f46;
				}
				else if(pozo.get(4).equals("55"))
				{
					p5 = f55;
				}
				else if(pozo.get(4).equals("56"))
				{
					p5 = f56;
				}
				else if(pozo.get(4).equals("66"))
				{
					p5 = f66;
				}
				// Ficha 6 Pozo
				else if(pozo.get(5).equals("00"))
				{
					p6 = f00;
				}
				else if(pozo.get(5).equals("01"))
				{
					p6 = f01;
				}
				else if(pozo.get(5).equals("02"))
				{
					p6 = f02;
				}
				else if(pozo.get(5).equals("03"))
				{
					p6 = f03;
				}
				else if(pozo.get(5).equals("04"))
				{
					p6 = f04;
				}
				else if(pozo.get(5).equals("05"))
				{
					p6 = f05;
				}
				else if(pozo.get(5).equals("06"))
				{
					p6 = f06;
				}
				else if(pozo.get(5).equals("11"))
				{
					p6 = f11;
				}
				else if(pozo.get(5).equals("12"))
				{
					p6 = f12;
				}
				else if(pozo.get(5).equals("13"))
				{
					p6 = f13;
				}
				else if(pozo.get(5).equals("14"))
				{
					p6 = f14;
				}
				else if(pozo.get(5).equals("15"))
				{
					p6 = f15;
				}
				else if(pozo.get(5).equals("16"))
				{
					p6 = f16;
				}
				else if(pozo.get(5).equals("22"))
				{
					p6 = f22;
				}
				else if(pozo.get(5).equals("23"))
				{
					p6 = f23;
				}
				else if(pozo.get(5).equals("24"))
				{
					p6 = f24;
				}
				else if(pozo.get(5).equals("25"))
				{
					p6 = f25;
				}
				else if(pozo.get(5).equals("26"))
				{
					p6 = f26;
				}
				else if(pozo.get(5).equals("33"))
				{
					p6 = f33;
				}
				else if(pozo.get(5).equals("34"))
				{
					p6 = f34;
				}
				else if(pozo.get(5).equals("35"))
				{
					p6 = f35;
				}
				else if(pozo.get(5).equals("36"))
				{
					p6 = f36;
				}
				else if(pozo.get(5).equals("44"))
				{
					p6 = f44;
				}
				else if(pozo.get(5).equals("45"))
				{
					p6 = f45;
				}
				else if(pozo.get(5).equals("46"))
				{
					p6 = f46;
				}
				else if(pozo.get(5).equals("55"))
				{
					p6 = f55;
				}
				else if(pozo.get(5).equals("56"))
				{
					p6 = f56;
				}
				else if(pozo.get(5).equals("66"))
				{
					p6 = f66;
				}
				// Ficha 7 Pozo
				else if(pozo.get(6).equals("00"))
				{
					p7 = f00;
				}
				else if(pozo.get(6).equals("01"))
				{
					p7 = f01;
				}
				else if(pozo.get(6).equals("02"))
				{
					p7 = f02;
				}
				else if(pozo.get(6).equals("03"))
				{
					p7 = f03;
				}
				else if(pozo.get(6).equals("04"))
				{
					p7 = f04;
				}
				else if(pozo.get(6).equals("05"))
				{
					p7 = f05;
				}
				else if(pozo.get(6).equals("06"))
				{
					p7 = f06;
				}
				else if(pozo.get(6).equals("11"))
				{
					p7 = f11;
				}
				else if(pozo.get(6).equals("12"))
				{
					p7 = f12;
				}
				else if(pozo.get(6).equals("13"))
				{
					p7 = f13;
				}
				else if(pozo.get(6).equals("14"))
				{
					p7 = f14;
				}
				else if(pozo.get(6).equals("15"))
				{
					p7 = f15;
				}
				else if(pozo.get(6).equals("16"))
				{
					p7 = f16;
				}
				else if(pozo.get(6).equals("22"))
				{
					p7 = f22;
				}
				else if(pozo.get(6).equals("23"))
				{
					p7 = f23;
				}
				else if(pozo.get(6).equals("24"))
				{
					p7 = f24;
				}
				else if(pozo.get(6).equals("25"))
				{
					p7 = f25;
				}
				else if(pozo.get(6).equals("26"))
				{
					p7 = f26;
				}
				else if(pozo.get(6).equals("33"))
				{
					p7 = f33;
				}
				else if(pozo.get(6).equals("34"))
				{
					p7 = f34;
				}
				else if(pozo.get(6).equals("35"))
				{
					p7 = f35;
				}
				else if(pozo.get(6).equals("36"))
				{
					p7 = f36;
				}
				else if(pozo.get(6).equals("44"))
				{
					p7 = f44;
				}
				else if(pozo.get(6).equals("45"))
				{
					p7 = f45;
				}
				else if(pozo.get(6).equals("46"))
				{
					p7 = f46;
				}
				else if(pozo.get(6).equals("55"))
				{
					p7 = f55;
				}
				else if(pozo.get(6).equals("56"))
				{
					p7 = f56;
				}
				else if(pozo.get(6).equals("66"))
				{
					p7 = f66;
				}
			}
		}
		
		// Dibujar Fichas Jugador 1
		if(ronda==1)
		{
			// Mostrar Fichas 1				
			g.drawImage(j11, 490, 73, null);
			g.drawImage(j12, 535, 73, null);
			g.drawImage(j13, 580, 73, null);
			g.drawImage(j14, 625, 73, null);
			g.drawImage(j15, 670, 73, null);
			g.drawImage(j16, 715, 73, null);
			g.drawImage(j17, 760, 73, null);
		
			// Mostrar Fichas 2
			g.drawImage(j21, 490, 660, null);
			g.drawImage(j22, 535, 660, null);
			g.drawImage(j23, 580, 660, null);
			g.drawImage(j24, 625, 660, null);
			g.drawImage(j25, 670, 660, null);
			g.drawImage(j26, 715, 660, null);
			g.drawImage(j27, 760, 660, null);
			
			// Comprobar que Jugador 3 existe
			if(manoJ3 != null)
			{
				g.drawImage(j31, 25, 220, null);
				g.drawImage(j32, 75, 220, null);
				g.drawImage(j33, 25, 310, null);
				g.drawImage(j34, 75, 310, null);
				g.drawImage(j35, 25, 400, null);
				g.drawImage(j36, 75, 400, null);
				g.drawImage(j37, 25, 490, null);
			}
			
			// Comprobar que Jugador 4 existe
			if(manoJ4 != null)
			{
				g.drawImage(j41, 1190, 220, null);
				g.drawImage(j42, 1240, 220, null);
				g.drawImage(j43, 1190, 310, null);
				g.drawImage(j44, 1240, 310, null);
				g.drawImage(j45, 1190, 400, null);
				g.drawImage(j46, 1240, 400, null);
				g.drawImage(j47, 1190, 490, null);
			}
			// Mostrar Ocultas Fichas Resto
						/*g.drawImage(fWhite, 490, 660, null);
						g.drawImage(fWhite, 535, 660, null);
						g.drawImage(fWhite, 580, 660, null);
						g.drawImage(fWhite, 625, 660, null);
						g.drawImage(fWhite, 670, 660, null);
						g.drawImage(fWhite, 715, 660, null);
						g.drawImage(fWhite, 760, 660, null);*/
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
		fWhite = herramienta.getImage("./imagesFichas/fWhite.png");
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
	
	public void leerJ2(List<String> m2)
	{
		manoJ2 = m2;
	}
	
	public void leerJ3(List<String> m3)
	{
		manoJ3 = m3;
	}
	
	public void leerJ4(List<String> m4)
	{
		manoJ4 = m4;
	}
	
	public void leerPozo(List<String> p)
	{
		pozo = p;
	}
}
