package echantillon;

import org.junit.Test;
import static org.junit.Assert.*;

public class EchantillonTest {

    @Test
    public void testConstructeur() {
        Echantillon instance = new Echantillon();
        assertEquals(0, instance.getTaille());
        assertTrue(instance.invariantEstOk());
        double moyenne = instance.getMoyenne();
    }

    @Test
    public void testAjouterUneFois() {
        double precision = 0.001;
        Echantillon instance = new Echantillon();

        instance.ajouter(10.5);
        assertEquals(1, instance.getTaille());

        assertEquals(10.5, instance.getMinimum(), precision);
        assertEquals(10.5, instance.getMoyenne(), precision);
        assertEquals(10.5, instance.getMaximum(), precision);

        assertTrue(instance.invariantEstOk());
    }

    @Test
    public void testAjouterPlusieursFois() {
        double precision = 0.001;
        Echantillon instance = new Echantillon();

        instance.ajouter(9.00);
        instance.ajouter(2.00);
        instance.ajouter(4.00);

        assertEquals(3, instance.getTaille());

        assertEquals(2.00, instance.getMinimum(), precision);
        assertEquals(5.00, instance.getMoyenne(), precision);
        assertEquals(9.00, instance.getMaximum(), precision);

        assertTrue(instance.invariantEstOk());
    }

}
