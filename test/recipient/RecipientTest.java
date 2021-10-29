package recipient;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecipientTest {

    public RecipientTest() {
    }

    @Test
    public void testMettreUnDans() {
        // Déclarons un objet de type Récipient
        // Cela ajoute dans la pile la taille d'une adresse mémoire
        Recipient recipient = new Recipient(3, 5);
        Recipient autre = new Recipient(2, 4);

        recipient.mettreUnDans(autre);

        // Vérifier les garanties (les post-conditions)
        // recipient.getQuantite doit valoir 2
        int expected = 2;
        int result = recipient.getQuantite();
        assertEquals(expected, result);
        assertEquals(3, autre.getQuantite());
        assertEquals(5, recipient.getCapacite());
        assertEquals(4, autre.getCapacite());

        assertTrue(recipient.invariantEstOk());
        assertTrue(autre.invariantEstOk());
    }

    @Test
    public void testRemplir() {
        Recipient recipient;
        recipient = new Recipient(6, 8);

        Recipient autre;
        autre = new Recipient(2, 6);

        recipient.remplir(autre);
        
        //assertTrue(autre.estPlein());
        
        assertEquals(8, recipient.getCapacite());
        assertEquals(2, recipient.getQuantite());
        assertEquals(6, autre.getCapacite());
        assertEquals(6, autre.getQuantite());
        
        assertTrue(recipient.invariantEstOk());
        assertTrue(autre.invariantEstOk());
    }

    @Test
    public void testViderDans() {
        Recipient recipient = new Recipient(3, 5);
        Recipient autre = new Recipient(2, 5);

        recipient.viderDans(autre);

        assertTrue(recipient.estVide());

        assertEquals(0, recipient.getQuantite());
        assertEquals(5, autre.getQuantite());
        assertEquals(5, recipient.getCapacite());
        assertEquals(5, autre.getCapacite());

        assertTrue(recipient.invariantEstOk());
        assertTrue(autre.invariantEstOk());
    }

}
