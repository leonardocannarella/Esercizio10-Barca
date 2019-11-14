
/**
 * Barca
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 14/11/2019)
 */
public class Barca
{
    private String nome;
    private String nazionalita;
    private int lunghezza;
    private int stazza;
    private String tipologia;
    
    public Barca(String nome, String nazionalita, int lunghezza, int stazza, String tipologia)
    {
        setNome(nome);
        setNaz(nazionalita);
        setLungh(lunghezza);
        setStazza(stazza);
        setTip(tipologia);
    }
    
    private void setNome(String n)
    {
        nome=n;
    }
    
    private void setNaz(String naz)
    {
        nazionalita=naz;
    }
    
    private void setLungh(int l)
    {
        lunghezza=l;
    }
    
    private void setStazza(int s)
    {
        stazza=s;
    }
    
    private void setTip(String t)
    {
        if((t!="vela")&&(t!="motore"))
            tipologia="vela";
        else
            tipologia=t;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getNaz()
    {
        return nazionalita;
    }
    
    public int getLungh()
    {
        return lunghezza;
    }
    
    public int getStazza()
    {
        return stazza;
    }
    
    public String getTip()
    {
        return tipologia;
    }
    
    public String toString()
    {
        return "BARCA\n"+"Nome: "+getNome()+"\nNazionalità: "+getNaz()+"\nLunghezza: "+getLungh()+"\nStazza: "+getStazza()+"\nTipologia: "+getTip()+"\n";
    }
}
