package recipient;

// Exercice du tas de sable à déplacer !
public class TasDeSable {

    Recipient tasInitial, brouette, tasFinal;

    TasDeSable(Recipient tasInitial, Recipient brouette, Recipient tasFinal) {
        this.tasInitial = tasInitial;
        this.brouette = brouette;
        this.tasFinal = tasFinal;
    }

    void deplacerTas() {
        while (!tasInitial.estVide() || brouette.estPlein()) {
            tasInitial.mettreUnDans(brouette);
        }
        brouette.viderDans(tasFinal);
    }
}
