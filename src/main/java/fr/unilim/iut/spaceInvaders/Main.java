package fr.unilim.iut.spaceInvaders;

import fr.unilim.iut.spaceInvaders.model.Constante;
import fr.unilim.iut.spaceInvaders.model.DessinSpaceInvaders;
import fr.unilim.iut.spaceInvaders.model.SpaceInvaders;
import fr.unilim.iut.spaceInvaders.moteurjeu.*;

public class Main {

	static SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	static DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);
	static MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);

	public static void main(String[] args) throws InterruptedException {
		jeu.initialiserJeu();
		moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	}

}