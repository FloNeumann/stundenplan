import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Tag.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tag
{
    private ArrayList<Stunde> stunden;
    private String wochentag;

    /**
     * Konstruktor für Objekte der Klasse Tag
     */
    public Tag(String wochentag)
    {
        stunden = new ArrayList<Stunde>();
        this.wochentag = wochentag;
    }

    /**
     * Liefert das Datenfeld wochentag
     * 
     * @return raum
     */
    public String gibWochentag()
    {
        return wochentag;
    }
    
    public Stunde gibStunde(int nummer)
    {
        for(Stunde stunde : stunden)
        {
            if(stunde.gibStunde() == nummer)
            {
                return stunde;
            }
        }
        return null;
    }
    
    public ArrayList<Stunde> gibStunden()
    {
        return stunden;
    }
    
    /**
     * Fügt ein Stunde zum Tag hinzu
     * 
     * @return raum
     */
    public void stundeHinzufuegen(Stunde stunde)
    {
        stunden.add(stunde);
    }
}
