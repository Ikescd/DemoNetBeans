package recipient;

import org.junit.Test;
import static org.junit.Assert.*;

public class TasDeSableTest {

    @Test
    public void testDeplacerTas() {
        Recipient tasInitial = new Recipient(4, 4);
        Recipient brouette = new Recipient(0, 3);
        Recipient tasFinal = new Recipient(5, 10);

        TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);

        instance.deplacerTas();
        
        assertEquals(0, tasInitial.getQuantite());
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
    }

}
