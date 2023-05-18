package es.studium.Domino;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener
{
	Modelo modelo;
	MenuPrincipal menuPrincipal;
	Partida partida = new Partida();
	Ranking ranking = new Ranking();
	
	public Controlador(Modelo m, MenuPrincipal mp, Partida p, Ranking r)
	{
		this.modelo = m;
		this.menuPrincipal = mp;
		this.partida = p;
		this.ranking = r;
		
		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		int x = me.getX();
		int y = me.getY();
		
		if(menuPrincipal.isActive())
		{			
			if(x>400&&x<625&&y>150&&y<215)
			{
				partida.dlgElegirJ.setSize(250, 150);
				partida.dlgElegirJ.setLayout(new FlowLayout());
				partida.dlgElegirJ.add(partida.choJugadores);
				partida.dlgElegirJ.setLocationRelativeTo(null);
				partida.dlgElegirJ.addWindowListener(this);
				partida.dlgElegirJ.addMouseListener(this);
				partida.dlgElegirJ.setVisible(true);
				
			}
			else if(x>400&&x<625&&y>270&&y<335)
			{
				ranking.setVisible(true);
				ranking.addWindowListener(this);
			}
			else if(x>400&&x<625&&y>390&&y<455)
			{
				System.out.println("Ayuda");
			}
			else if(x>720&&x<820&&y>390&&y<490)
			{
				System.exit(0);
			}
		}
		/*else if(partida.isActive())
		{
			partida.setVisible(true);
			partida.addWindowListener(this);
			partida.addMouseListener(this);
		}
		*/
	}
	
	public void mousePressed(MouseEvent me){}
	
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me){}
	
	public void mouseExited(MouseEvent me){}

	public void windowClosing(WindowEvent e)
	{
		if(partida.isActive())
		{
			partida.setVisible(false);
		}
		else if(partida.dlgElegirJ.isActive())
		{
			partida.dlgElegirJ.setVisible(false);
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
