package es.studium.domino;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener
{
	Modelo modelo;
	MenuPrincipal menuPrincipal;
	
	public Controlador(Modelo m, MenuPrincipal mp)
	{
		this.modelo = m;
		this.menuPrincipal = mp;
		
		this.menuPrincipal.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
	public void windowOpened(WindowEvent e){}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}
}
