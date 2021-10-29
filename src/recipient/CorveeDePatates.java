package recipient;

public class CorveeDePatates {

    Recipient tasDePatates, panier, marmite;

    CorveeDePatates(Recipient tasDePatates, Recipient panier, Recipient marmite) {
        //this.tasDePatates = l'objet courant
        // tasDePatates = paramètre
        this.tasDePatates = tasDePatates;
        this.panier = panier;
        this.marmite = marmite;
    }

    void remplirMarmite() {
        while (!marmite.estPlein()) {
            if (panier.estVide()) {
                tasDePatates.remplir(panier);
            }
            panier.mettreUnDans(marmite);
        }
    }
}
