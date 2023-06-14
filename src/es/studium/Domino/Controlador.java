package es.studium.Domino;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Controlador implements WindowListener, MouseListener
{
	Modelo modelo;
	MenuPrincipal menuPrincipal;
	Ranking ranking = new Ranking();
	Partida partida;
	FinPartida finPartida;
	ElegirJ elegirJ = new ElegirJ();
	boolean haElegidoJugadores = false;
	
	public Controlador(Modelo m, MenuPrincipal mp, Partida p, Ranking r, ElegirJ ej, FinPartida fp)
	{
		this.modelo = m;
		this.menuPrincipal = mp;
		this.partida = p;
		this.ranking = r;
		this.elegirJ = ej;
		this.finPartida = fp;
		
		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{		
		int x = me.getX();
		int y = me.getY();
		
		// Botones de accesibilidad a Nueva Partida, Ranking, Ayuda y Exit
		if(menuPrincipal.isActive())
		{			
			if(x>400&&x<625&&y>150&&y<215)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				elegirJ.setVisible(true);
				elegirJ.addWindowListener(this);
				elegirJ.addMouseListener(this);
			}
			else if(x>400&&x<625&&y>270&&y<335)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				ranking.setVisible(true);
				ranking.addWindowListener(this);
			}
			else if(x>400&&x<625&&y>390&&y<455)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				
				try
				{
					Runtime.getRuntime().exec("hh.exe Ayuda_Domino.chm");
				}
				catch (IOException er)
				{
					er.printStackTrace();
				}

			}
			else if(x>720&&x<820&&y>390&&y<490)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				System.exit(0);
			}	
		}
		
		// Elegir jugadores para inicializar Nueva Partida
		else if(elegirJ.isActive() && x>50&&x<200&&y>310&&y<345 && elegirJ.choJugadores.getSelectedIndex()!=0)
		{
			// Si elegimos 2 jugadores
			if(elegirJ.choJugadores.getSelectedIndex()==1 && haElegidoJugadores==false)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				// Introducimos los nombres al darle al bot�n de Aceptar
				haElegidoJugadores = true;
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.setVisible(true);
			}
			// Abrir ventana de Nueva Partida para 2 jugadores
			else if(x>50&&x<200&&y>310&&y<345 && haElegidoJugadores==true && elegirJ.txtJ1.getText().length()!=0 && elegirJ.txtJ2.getText().length()!=0 && elegirJ.choJugadores.getSelectedIndex()==1)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				haElegidoJugadores = false;
				partida = new Partida();
				partida.setVisible(true);
				partida.addWindowListener(this);
				partida.addMouseListener(this);
				elegirJ.txtJ1.setText(elegirJ.txtJ1.getText());
				elegirJ.txtJ2.setText(elegirJ.txtJ2.getText());
				elegirJ.txtJ3.setText("");
				elegirJ.txtJ4.setText("");
				this.modelo.crearPartida(2);
				this.partida.leerPozo(this.modelo.pozo);
				elegirJ.dispose();
			}
			// Si elegimos 3 jugadores
			else if(elegirJ.choJugadores.getSelectedIndex()==2 && haElegidoJugadores==false)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				// Introducimos los nombres al darle al bot�n de Aceptar
				haElegidoJugadores = true;
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.add(elegirJ.lblJ3);
				elegirJ.add(elegirJ.txtJ3);
				elegirJ.setVisible(true);
			}
			// Abrir ventana de Nueva Partida para 3 jugadores
			else if(x>50&&x<200&&y>310&&y<345 && haElegidoJugadores==true && elegirJ.txtJ1.getText().length()!=0 && elegirJ.txtJ2.getText().length()!=0 && elegirJ.txtJ3.getText().length()!=0 && elegirJ.choJugadores.getSelectedIndex()==2)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				haElegidoJugadores = false;
				partida = new Partida();
				partida.setVisible(true);
				partida.addWindowListener(this);
				partida.addMouseListener(this);
				elegirJ.txtJ1.setText(elegirJ.txtJ1.getText());
				elegirJ.txtJ2.setText(elegirJ.txtJ2.getText());
				elegirJ.txtJ3.setText(elegirJ.txtJ3.getText());
				elegirJ.txtJ4.setText("");
				this.modelo.crearPartida(3);
				this.partida.leerJ3(this.modelo.manoJ3);
				this.partida.leerPozo(this.modelo.pozo);
				elegirJ.dispose();
			}
			// Si elegimos 4 jugadores
			else if(elegirJ.choJugadores.getSelectedIndex()==3 && haElegidoJugadores==false)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				// Introducimos los nombres al darle al bot�n de Aceptar
				haElegidoJugadores = true;
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.add(elegirJ.lblJ3);
				elegirJ.add(elegirJ.txtJ3);
				elegirJ.add(elegirJ.lblJ4);
				elegirJ.add(elegirJ.txtJ4);
				elegirJ.setVisible(true);
			}
			// Abrir ventana de Nueva Partida para 4 jugadores
			else if(x>50&&x<200&&y>310&&y<345 && haElegidoJugadores==true && elegirJ.txtJ1.getText().length()!=0 && elegirJ.txtJ2.getText().length()!=0 && elegirJ.txtJ3.getText().length()!=0 && elegirJ.txtJ4.getText().length()!=0 && elegirJ.choJugadores.getSelectedIndex()==3)
			{
				this.modelo.reproducirSonido("./sonidos/click.wav");
				haElegidoJugadores = false;
				partida = new Partida();
				partida.setVisible(true);
				partida.addWindowListener(this);
				partida.addMouseListener(this);
				elegirJ.txtJ1.setText(elegirJ.txtJ1.getText());
				elegirJ.txtJ2.setText(elegirJ.txtJ2.getText());
				elegirJ.txtJ3.setText(elegirJ.txtJ3.getText());
				elegirJ.txtJ4.setText(elegirJ.txtJ4.getText());
				this.modelo.crearPartida(4);
				this.partida.leerJ3(this.modelo.manoJ3);
				this.partida.leerJ4(this.modelo.manoJ4);
				elegirJ.dispose();
			}
			this.partida.nombreJugador1(elegirJ.txtJ1.getText());
			this.partida.nombreJugador2(elegirJ.txtJ2.getText());
			this.partida.nombreJugador3(elegirJ.txtJ3.getText());
			this.partida.nombreJugador4(elegirJ.txtJ4.getText());
			this.partida.leerJ1(this.modelo.manoJ1);
			this.partida.leerJ2(this.modelo.manoJ2);
			
		}
		else if (partida.isActive())
		{	
			// Turno++
			
			/*System.out.println(this.modelo.manoJ1);
			System.out.println(this.modelo.manoJ2);
			System.out.println(this.modelo.manoJ3);
			System.out.println(this.modelo.manoJ4);
			System.out.println(this.modelo.pozo);*/
		}
	}
	
	public void mousePressed(MouseEvent me){}
	
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me){}
	
	public void mouseExited(MouseEvent me){}

	public void windowClosing(WindowEvent e)
	{
		if(partida.isActive())
		{
			elegirJ.setVisible(false);
			partida.dispose();
		}
		else if(elegirJ.isActive())
		{
			elegirJ.dispose();
		}
		else if(ranking.isActive())
		{
			ranking.setVisible(false);
		}
		else if(menuPrincipal.isActive())
		{			
			System.exit(0);
		}
	}
	
	public void windowOpened(WindowEvent e){}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}

}
