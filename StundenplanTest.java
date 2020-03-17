

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse StundenplanTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StundenplanTest
{
    private Stundenplan stundenplan;
    
    private Tag montag;
    private Stunde mo1;
    private Stunde mo2;
    private Stunde mo3;
    private Stunde mo4;
    private Stunde mo5;
    private Stunde mo6;
    
    private Tag dienstag;
    private Stunde di1;
    private Stunde di2;
    private Stunde di3;
    private Stunde di4;
    private Stunde di5;
    private Stunde di6;
    private Stunde di7;
    
    private Tag mittwoch;
    private Stunde mi1;
    private Stunde mi2;
    private Stunde mi3;
    private Stunde mi4;
    private Stunde mi5;
    private Stunde mi6;
    
    private Tag donnerstag;
    private Stunde do1;
    private Stunde do2;
    private Stunde do3;
    private Stunde do4;
    private Stunde do5;
    private Stunde do6;
    private Stunde do7;
    
    private Tag freitag;
    private Stunde fr1;
    private Stunde fr2;
    private Stunde fr3;
    private Stunde fr4;
    private Stunde fr5;
    private Stunde fr6;
    

    /**
     * Konstruktor fuer die Test-Klasse StundenplanTest
     */
    public StundenplanTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        stundenplan = new Stundenplan("THT14C");
        montag = new Tag("Montag");
        dienstag = new Tag("Dienstag");
        mittwoch = new Tag("Mittwoch");
        donnerstag = new Tag("Donnerstag");
        freitag = new Tag("Freitag");
        
        mo1 = new Stunde("M", 1, 218, "SCHH");
        mo2 = new Stunde("M", 2, 218, "SCHH");
        mo3 = new Stunde("SAW", 3, 218, "JOUM");
        mo4 = new Stunde("SAW", 4, 218, "JOUM");
        mo5 = new Stunde("E", 5, 17, "ZAHD");
        mo6 = new Stunde("KR", 6, 17, "GERW");
        di1 = new Stunde("SAW", 1, 218, "JOUM");
        di2 = new Stunde("SAW", 2, 218, "JOUM");
        di3 = new Stunde("WB", 3, 218, "KAND");
        di4 = new Stunde("M", 4, 218, "SCHH");
        di5 = new Stunde("ITSYS", 5, 20, "BAUF");
        di6 = new Stunde("ITSYS", 6, 20, "BAUF");
        di7 = new Stunde("M", 7, 23, "SCHH");
        mi1 = new Stunde("PK", 1, 17, "KAND");
        mi2 = new Stunde("PK", 2, 17, "KAND");
        mi3 = new Stunde("D", 3, 113, "BIEL");
        mi4 = new Stunde("D", 4, 113, "BIEL");
        mi5 = new Stunde("SAW", 5, 218, "JOUM");
        mi6 = new Stunde("SAW", 6, 218, "JOUM");
        do1 = new Stunde("PHY", 1, 113, "STÖM");
        do2 = new Stunde("PHY", 2, 113, "STÖM");
        do3 = new Stunde("ITSYS", 3, 20, "BAUF");
        do4 = new Stunde("ITSYS", 4, 20, "BAUF");
        do5 = new Stunde("E", 5, 136, "ZAHD");
        do6 = new Stunde("E", 6, 136, "ZAHD");
        do7 = new Stunde("PK", 7, 136, "KAND");
        fr1 = new Stunde("", 1, 0, "");
        fr2 = new Stunde("WB", 2, 220, "KAND");
        fr3 = new Stunde("D", 3, 220, "BIEL");
        fr4 = new Stunde("D", 4, 220, "BIEL");
        fr5 = new Stunde("ITSYS", 5, 20, "BAUF");
        fr6 = new Stunde("ITSYS", 6, 20, "BAUF");
        
        montag.stundeHinzufuegen(mo1);
        montag.stundeHinzufuegen(mo2);
        montag.stundeHinzufuegen(mo3);
        montag.stundeHinzufuegen(mo4);
        montag.stundeHinzufuegen(mo5);
        montag.stundeHinzufuegen(mo6);
        dienstag.stundeHinzufuegen(di1);
        dienstag.stundeHinzufuegen(di2);
        dienstag.stundeHinzufuegen(di3);
        dienstag.stundeHinzufuegen(di4);
        dienstag.stundeHinzufuegen(di5);
        dienstag.stundeHinzufuegen(di6);
        dienstag.stundeHinzufuegen(di7);
        mittwoch.stundeHinzufuegen(mi1);
        mittwoch.stundeHinzufuegen(mi2);
        mittwoch.stundeHinzufuegen(mi3);
        mittwoch.stundeHinzufuegen(mi4);
        mittwoch.stundeHinzufuegen(mi5);
        mittwoch.stundeHinzufuegen(mi6);
        donnerstag.stundeHinzufuegen(do1);
        donnerstag.stundeHinzufuegen(do2);
        donnerstag.stundeHinzufuegen(do3);
        donnerstag.stundeHinzufuegen(do4);
        donnerstag.stundeHinzufuegen(do5);
        donnerstag.stundeHinzufuegen(do6);
        donnerstag.stundeHinzufuegen(do7);
        freitag.stundeHinzufuegen(fr1);
        freitag.stundeHinzufuegen(fr2);
        freitag.stundeHinzufuegen(fr3);
        freitag.stundeHinzufuegen(fr4);
        freitag.stundeHinzufuegen(fr5);
        freitag.stundeHinzufuegen(fr6);
        
        stundenplan.tagHinzufuegen(montag);
        stundenplan.tagHinzufuegen(dienstag);
        stundenplan.tagHinzufuegen(mittwoch);
        stundenplan.tagHinzufuegen(donnerstag);
        stundenplan.tagHinzufuegen(freitag);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
