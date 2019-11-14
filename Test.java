
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 14/11/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        Barca b1, b2;
        Porto p1;
        
        b1 = new Barca("Pippo", "Italiana", 200, 2, "vela");
        b2 = new Barca("Pippo", "Tedesca", 200, 3, "motore");
        p1 = new Porto("Fano");
       
        System.out.println(p1.ormeggia(b2));
        System.out.println(p1.infoBarca(21));
        System.out.println(p1.liberaPosto(3,21));
    }
}
