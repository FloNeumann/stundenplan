import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;

/**
 * Beschreiben Sie hier die Klasse Stundenplan.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stundenplan
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Tag> woche;
    private String klasse;
    
    private JFrame fenster;
    private JLabel klassenLabel;
    private JPanel stunden;
    
    private JPanel zeiten;
    private JPanel montag;
    private JPanel dienstag;
    private JPanel mittwoch;
    private JPanel donnerstag;
    private JPanel freitag;    

    /**
     * Konstruktor für Objekte der Klasse Stundenplan
     */
    public Stundenplan(String klasse)
    {
        // Instanzvariable initialisieren
        woche = new ArrayList<Tag>();
        this.klasse = klasse;
        fensterErzeugen();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public void fensterErzeugen()
    {
        // JFrame erzeugen
        fenster = new JFrame("Stundenplan");
        Container contentPane = fenster.getContentPane();
        
        klassenLabel = new JLabel(klasse);
        contentPane.add(klassenLabel, BorderLayout.NORTH);
      
        stunden = new JPanel(new GridLayout(1, 6));
        contentPane.add(stunden, BorderLayout.CENTER);
        
        zeiten = new JPanel(new GridLayout(9, 1));
        zeiten.add(new JLabel(""));
        zeiten.add(new JLabel("08:05"));
        zeiten.add(new JLabel("08:50"));
        zeiten.add(new JLabel("09:55"));
        zeiten.add(new JLabel("10:40"));
        zeiten.add(new JLabel("11:25"));
        zeiten.add(new JLabel("12:15"));
        zeiten.add(new JLabel("13:30"));
        zeiten.add(new JLabel("14:15"));
        stunden.add(zeiten);
        
        montag = new JPanel(new GridLayout(9, 1));
        montag.add(new JLabel("Montag"));
        stunden.add(montag);
        
        dienstag = new JPanel(new GridLayout(9, 1));
        dienstag.add(new JLabel("Dienstag"));
        stunden.add(dienstag);
        
        mittwoch = new JPanel(new GridLayout(9, 1));
        mittwoch.add(new JLabel("Mittwoch"));
        stunden.add(mittwoch);
        
        donnerstag = new JPanel(new GridLayout(9, 1));
        donnerstag.add(new JLabel("Donnerstag"));
        stunden.add(donnerstag);
        
        freitag = new JPanel(new GridLayout(9, 1));
        freitag.add(new JLabel("Freitag"));
        stunden.add(freitag);
        
        fenster.pack();
        fenster.setVisible(true);
    }
    
    public void stundenplanAnzeigen()
    {
        for(Tag tag : woche)
        {
            if(tag.gibWochentag().equals("Montag"))
            {
                for(Stunde stunde : tag.gibStunden())
                {
                    montag.add(new JLabel(stunde.gibFach()));
                }
            }
            
            if(tag.gibWochentag().equals("Dienstag"))
            {
                for(Stunde stunde : tag.gibStunden())
                {
                    dienstag.add(new JLabel(stunde.gibFach()));
                }
            }
            
            if(tag.gibWochentag().equals("Mittwoch"))
            {
                for(Stunde stunde : tag.gibStunden())
                {
                    mittwoch.add(new JLabel(stunde.gibFach()));
                }
            }
            
            if(tag.gibWochentag().equals("Donnerstag"))
            {
                for(Stunde stunde : tag.gibStunden())
                {
                    donnerstag.add(new JLabel(stunde.gibFach()));
                }
            }
            
            if(tag.gibWochentag().equals("Freitag"))
            {
                for(Stunde stunde : tag.gibStunden())
                {
                    freitag.add(new JLabel(stunde.gibFach()));
                }
            }
            
        }
        fenster.repaint();
        fenster.pack();
    }
    
    public void tagHinzufuegen(Tag tag)
    {
        woche.add(tag);
    }

}
