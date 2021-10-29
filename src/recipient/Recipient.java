package recipient;

public class Recipient {

    private int quantite, /* capacite, */ espaceLibre;

    /**
     * Initialise le récipient avec la quantité et la capacité indiquées.
     * <br />Requiert quantité positive ou nulle ET inférieur ou égale à la
     * capacité, capacité positive strictement
     *
     * @param quantite
     * @param capacite
     *
     */
    Recipient(int quantite, int capacite) {
        this.quantite = quantite;
        this.espaceLibre = capacite - quantite;
        // this.capacite = capacite;
    }

    /**
     * Transfère un élément de l'objet courant dans autre
     * <br />Requiert !estVide() && !autre.estPlein()
     *
     * @param autre
     */
    void mettreUnDans(Recipient autre) {
        quantite--;
        espaceLibre++;
        autre.quantite++;
        autre.espaceLibre--;
    }

    void remplir(Recipient autre) {
        quantite -= autre.espaceLibre;
        autre.quantite += autre.espaceLibre;
        espaceLibre += autre.espaceLibre;
        autre.espaceLibre = 0;
    }

    void viderDans(Recipient autre) {
        autre.quantite += quantite;
        autre.espaceLibre -= quantite;
        espaceLibre += quantite;
        quantite = 0;
    }

    int getQuantite() {
        return quantite;
    }

    int getCapacite() {
        return quantite + espaceLibre;
    }

    int getEspaceLibre() {
        return espaceLibre;
    }

    boolean estVide() {
        return quantite == 0;
    }

    boolean estPlein() {
        return espaceLibre == 0;
    }

    boolean invariantEstOk() {
        assert getQuantite() >= 0;
        assert getEspaceLibre() >= 0;
        assert getCapacite() > 0;
        assert (getCapacite() == (getQuantite() + getEspaceLibre()));
        assert (estVide() == (getQuantite() == 0));
        assert (estPlein() == (getEspaceLibre() == 0));
        return true;
    }

}
