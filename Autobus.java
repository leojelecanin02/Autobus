public class Autobus
{
    private String  kennzeichen;
    private int     sitzplätze;
    private boolean anhänger;
    
    public Autobus (String neuKennzeichen, int neuSitzplätze, boolean neuAnhänger)
    {
        setKennzeichen (neuKennzeichen);
        setSitzplätze (neuSitzplätze);
        setAnhänger (neuAnhänger);
    }
    
    public Autobus ()
    {
        setKennzeichen ("W-1234A");
        setSitzplätze (29);
        setAnhänger (false);
    }
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplätze()
    {
        return sitzplätze;
    }
    
    public boolean getAnhänger()
    {
        return anhänger;
    }
    
    public void setKennzeichen(String newKennzeichen)
    {
        kennzeichen = newKennzeichen;
    }
    
    public void setSitzplätze(int newSitzplätze)
    {
        sitzplätze = newSitzplätze;
    }
    
    public void setAnhänger(boolean newAnhänger)
    {
        anhänger = newAnhänger;
    }
}