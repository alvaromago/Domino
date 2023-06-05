package es.studium.Domino;

public class Principal
{	
	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		Partida partida = new Partida();
		Ranking ranking = new Ranking();
		ElegirJ elegirJ = new ElegirJ();
		FinPartida finPartida = new FinPartida();
		new Controlador(modelo, menuPrincipal, partida, ranking, elegirJ, finPartida);
	}
}
