package es.studium.Domino;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

public class Ranking extends Frame
{
    private static final long serialVersionUID = 1L;

    private Label lblRanking2 = new Label("RANKING PARA 2 JUGADORES:");
    private Label lblRanking3 = new Label("RANKING PARA 3 JUGADORES:");
    private Label lblRanking4 = new Label("RANKING PARA 4 JUGADORES:");

    private TextArea txaListado2 = new TextArea(13, 40);
    private TextArea txaListado3 = new TextArea(13, 40);
    private TextArea txaListado4 = new TextArea(13, 40);

    private Modelo c = new Modelo();

    Ranking()
    {
        setTitle("Rankings");
        setSize(600, 710);
        setLayout(new FlowLayout());
        setBackground(new Color(171, 139, 98));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
        txaListado2.append("                              Jugador  |  Turnos\n\n");
        c.rellenarRanking2(txaListado2); // Ranking para partidas de 2 personas
        txaListado3.append("                              Jugador  |  Turnos\n\n");
        c.rellenarRanking3(txaListado3); // 3 personas
        txaListado4.append("                              Jugador  |  Turnos\n\n");
        c.rellenarRanking4(txaListado4); // 4 personas

        add(lblRanking2);
        add(txaListado2);
        add(lblRanking3);
        add(txaListado3);
        add(lblRanking4);
        add(txaListado4);

        txaListado2.setEditable(false);
        txaListado3.setEditable(false);
        txaListado4.setEditable(false);

    }
} 

