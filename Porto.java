
/**
 * Porto
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 14/11/2019)
 */
public class Porto
{
    private Barca p[];
    private String nome;
    
    public Porto(String nome)
    {
        p = new Barca[100];
        setNome(nome);
    }
    
    private void setNome(String n)
    {
        nome=n;
    }
    
    public String ormeggia(Barca b1)
    {
        int i=0;
        for(i=0; i<100; i++)
        {
            if(i<=20)
            {
                if((b1.getTip()=="motore")&&(b1.getLungh()<=10))
                {
                    if(p[i]==null)
                    {
                        p[i]=b1;
                        return "Barca ormeggiata in posizione "+i;
                    }
                }
            }
            else if(i<=49)
            {
               if(b1.getTip()=="motore")
               {
                    if(p[i]==null)
                    {
                        p[i]=b1;
                        return "Barca ormeggiata in posizione "+i;
                    }
               }
            }
            else if(i>=50)
            {
               if(b1.getTip()=="vela")
               {
                    if(p[i]==null)
                    {
                        p[i]=b1;
                        return "Barca ormeggiata in posizione "+i;
                    }
               }
               else
                   return "I posti sono tutti occupati!";
            }
        }
        return "I posti sono tutti occupati!";
    }
    
    public String liberaPosto(int gSosta, int posto)
    {
        int affitto=0;
        if((posto>=0)&&(posto<=99))
        {
            if(p[posto]!=null)
            {
                if(p[posto].getTip()=="motore")
                {
                    affitto=20*p[posto].getStazza()*gSosta;
                }
                else
                {
                    affitto=10*p[posto].getLungh()*gSosta;
                }
                p[posto]=null;
                return "Posto liberato!\nAffitto calcolato: €"+affitto+",00";
            }
            else
                return "Il posto selezionato è già libero!";
        }
        else
        {
            return liberaPosto(gSosta, 0);
        }
    }
    
    public String infoBarca(int posto)
    {
        if(p[posto]!=null)
        {
            return p[posto].toString();
        }
        else
            return "Il posto è vuoto!";
    }
    
    public void arrayNaz(String paese)
    {
        Barca [] regBarchePaesi = new Barca[100];
        int i=0, j=0;
        
        for(i=0; i<100; i++)
        {
            if(p[i]!=null)
            {
                if(p[i].getNaz()==paese)
                {
                    regBarchePaesi[j]=p[i];
                    j++;
                }
            }
        }
        System.out.println("Registro creato con successo!\n\n");
        for(i=0;i<j;i++)
        {
            System.out.println("Barca "+i+"\n"+regBarchePaesi[i].toString());
        }
    }
}
