
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
        Barca b1, b2, b3, b4;
        Porto p1;
        
        b1 = new Barca("Giovanni", "Italia", 200, 2, "vela");
        b2 = new Barca("Pippo", "Germania", 200, 3, "motore");
        b3 = new Barca("Pippo", "Francia", 200, 3, "motore");
        b4 = new Barca("Pluto", "Italia", 200, 3, "motore");
        p1 = new Porto("Fano");
       
        System.out.println(p1.ormeggia(b1));
        System.out.println(p1.ormeggia(b2));
        System.out.println(p1.ormeggia(b3));
        System.out.println(p1.ormeggia(b4));
        System.out.println(p1.infoBarca(21));
        p1.arrayNaz("Italia");
        System.out.println(p1.liberaPosto(3,21));
    }
}
