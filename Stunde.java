
/**
 * Beschreiben Sie hier die Klasse Stunde.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stunde
{
    private String fach;
    private int stunde;
    private int raum;
    private String lehrer;


    /**
     * Konstruktor für Objekte der Klasse Stunde
     */
    public Stunde(String fach, int stunde, int raum, String lehrer)
    {
        this.fach = fach;
        this.stunde = stunde;
        this.raum = raum;
        this.lehrer = lehrer;
    }

    /**
     * Liefert das Datenfeld fach
     * 
     * @return fach
     */
    public String gibFach()
    {
        return fach;
    }
    
    /**
     * Liefert das Datenfeld stunde
     * 
     * @return stunde
     */
    public int gibStunde()
    {
        return stunde;
    }
    
    /**
     * Liefert das Datenfeld raum
     * 
     * @return raum
     */
    public int gibRaum()
    {
        return raum;
    }
    
    /**
     * Liefert das Datenfeld lehrer
     * 
     * @return lehrer
     */
    public String gibLehrer()
    {
        return lehrer;
    }
}
