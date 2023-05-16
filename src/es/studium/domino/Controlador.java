package es.studium.domino;

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
	Ayuda ayuda = new Ayuda();
	
	public Controlador(Modelo m, MenuPrincipal mp)
	{
		this.modelo = m;
		this.menuPrincipal = mp;
		
		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		int x = me.getX();
		int y = me.getY();
		
		if(x>400&&x<625&&y>150&&y<215)
		{
			this.partida.setVisible(true);
			this.partida.addWindowListener(this);
		}
		else if(x>400&&x<625&&y>270&&y<335)
		{
			this.ranking.setVisible(true);
			this.ranking.addWindowListener(this);
		}
		else if(x>400&&x<625&&y>390&&y<455)
		{
			this.ayuda.setVisible(true);
			this.ayuda.addWindowListener(this);
		}
	}
	
	public void mousePressed(MouseEvent me){}
	
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me){}
	
	public void mouseExited(MouseEvent me){}

	public void windowClosing(WindowEvent e)
	{
		if(this.partida.isActive())
		{
			this.partida.setVisible(false);
		}
		else if(this.ranking.isActive())
		{
			this.ranking.setVisible(false);
		}
		else if(this.ayuda.isActive())
		{
			this.ayuda.setVisible(false);
		}
		else if(this.menuPrincipal.isActive()) 
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
