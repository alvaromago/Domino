package es.studium.Domino;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener
{
	Modelo modelo;
	MenuPrincipal menuPrincipal;
	Ranking ranking = new Ranking();
	Partida partida;
	ElegirJ elegirJ = new ElegirJ();
	boolean haElegidoJugadores = false;
	
	public Controlador(Modelo m, MenuPrincipal mp, Partida p, Ranking r, ElegirJ ej)
	{
		this.modelo = m;
		this.menuPrincipal = mp;
		this.partida = p;
		this.ranking = r;
		this.elegirJ = ej;
		
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
				elegirJ.setVisible(true);
				elegirJ.addWindowListener(this);
				elegirJ.addMouseListener(this);
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
		else if(elegirJ.isActive()&&x>50&&x<200&&y>310&&y<345&&elegirJ.choJugadores.getSelectedIndex()!=0)
		{	
			if(elegirJ.choJugadores.getSelectedIndex()==1&&haElegidoJugadores==false)
			{
				haElegidoJugadores = true;
				System.out.println(haElegidoJugadores);
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.dispose();
				elegirJ.setVisible(true);
			}
			else if(x>50 && x<200 && y>310 && y<345 && haElegidoJugadores==true && elegirJ.txtJ1.getText().length()!=0 && elegirJ.txtJ2.getText().length()!=0)
			{
				partida = new Partida();
				partida.setVisible(true);
				partida.addWindowListener(this);
				partida.addMouseListener(this);
			}
			}
			else if(elegirJ.choJugadores.getSelectedIndex()==2)
			{
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.add(elegirJ.lblJ3);
				elegirJ.add(elegirJ.txtJ3);
				elegirJ.dispose();
				elegirJ.setVisible(true);
				if(x>50&&x<200&&y>310&&y<345&&elegirJ.txtJ1.getText().equals(null)&&elegirJ.txtJ2.getText().equals(null)&&elegirJ.txtJ3.getText().equals(null))
				{
					partida.setVisible(true);
					partida.addWindowListener(this);
					partida.addMouseListener(this);
				}
			}
			else if(elegirJ.choJugadores.getSelectedIndex()==3)
			{
				elegirJ.add(elegirJ.lblJ1);
				elegirJ.add(elegirJ.txtJ1);
				elegirJ.add(elegirJ.lblJ2);
				elegirJ.add(elegirJ.txtJ2);
				elegirJ.add(elegirJ.lblJ3);
				elegirJ.add(elegirJ.txtJ3);
				elegirJ.add(elegirJ.lblJ4);
				elegirJ.add(elegirJ.txtJ4);
				elegirJ.dispose();
				elegirJ.setVisible(true);
				if(x>50&&x<200&&y>310&&y<345&&elegirJ.txtJ1.getText().equals(null)&&elegirJ.txtJ2.getText().equals(null)&&elegirJ.txtJ3.getText().equals(null)&&elegirJ.txtJ4.getText().equals(null))
				{
					partida.setVisible(true);
					partida.addWindowListener(this);
					partida.addMouseListener(this);
				}
			}
		}
		/*else if(partida.isActive())
		{
			partida.setVisible(true);
			partida.addWindowListener(this);
			partida.addMouseListener(this);
		}
		*/
	
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
		else if(elegirJ.isActive())
		{
			elegirJ.setVisible(false);
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
