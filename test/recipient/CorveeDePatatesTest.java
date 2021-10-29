package recipient;

import org.junit.Test;
import static org.junit.Assert.*;

public class CorveeDePatatesTest {

    @Test
    public void testRemplirMarmite() {
        Recipient tasDePatates = new Recipient(10, 10);
        Recipient panier = new Recipient(1, 3);
        Recipient marmite = new Recipient(0, 5);

        CorveeDePatates instance = new CorveeDePatates(tasDePatates, panier, marmite);
        instance.remplirMarmite();

        assertTrue(marmite.estPlein());

        assertEquals(4, tasDePatates.getQuantite());
        assertEquals(2, panier.getQuantite());
        assertEquals(5, marmite.getCapacite());
        assertEquals(3, panier.getCapacite());
        assertEquals(10, tasDePatates.getCapacite());
    }

}
