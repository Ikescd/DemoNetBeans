package echantillon;

public class Echantillon {

    private int taille;
    private double minimum, maximum, somme;

    public void ajouter(double valeur) {
        if (taille == 0) {
            minimum = valeur;
            maximum = valeur;
        } else {
            if (valeur < minimum) minimum = valeur;
            if (valeur > maximum) maximum = valeur;    
        }
        somme += valeur;
        taille++;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public double getMoyenne() {
        return somme / taille;
    }

    public int getTaille() {
        return taille;
    }
    
    boolean invariantEstOk() {
        assert getTaille() >= 0;
        if (taille == 0) {
            assert minimum == 0;
            assert maximum == 0;
        } else {
        assert getMinimum() <= getMoyenne();
        assert getMinimum() <= getMaximum();
        assert getMoyenne() <= getMaximum();
        }
        return true;
    }
}
