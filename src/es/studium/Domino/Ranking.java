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

    private TextArea txaListado1 = new TextArea(13, 40);
    private TextArea txaListado2 = new TextArea(13, 40);
    private TextArea txaListado3 = new TextArea(13, 40);

    //private Conexion conexion = new Conexion();

    Ranking()
    {
        setTitle("Rankings");
        setSize(600, 710);
        setLayout(new FlowLayout());
        setBackground(new Color(171, 139, 98));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);

        /*
        conexion.rellenarRanking(txaListado1, 2); // Ranking para partidas de 2 personas
        conexion.rellenarRanking(txaListado2, 3); // 3 personas
        conexion.rellenarRanking(txaListado3, 4); // 4 personas*/

        add(lblRanking2);
        add(txaListado1);
        add(lblRanking3);
        add(txaListado2);
        add(lblRanking4);
        add(txaListado3);

        txaListado1.setEditable(false);
        txaListado2.setEditable(false);
        txaListado3.setEditable(false);

    }
} 

