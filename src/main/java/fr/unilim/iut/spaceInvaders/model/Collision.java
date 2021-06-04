package fr.unilim.iut.spaceInvaders.model;

public class Collision {
	
	public boolean detecterCollision(Sprite collisionneur, Sprite collisionne) {
		return this.collisionAbscisseEtOrdonne(collisionneur, collisionne);
	}

	private boolean collisionAbscisseEtOrdonne(Sprite collisionneur, Sprite collisionne) {
		return collisionOrdonnes(collisionneur, collisionne) && collisionAbscisse(collisionneur, collisionne);
	}

	private boolean collisionAbscisse(Sprite collisionneur, Sprite collisionne) {
		return collisionne.abscisseLaPlusADroite() >= collisionneur.abscisseLaPlusAGauche()
				&& collisionne.abscisseLaPlusAGauche() <= collisionneur.abscisseLaPlusADroite();
	}

	private boolean collisionOrdonnes(Sprite collisionneur, Sprite collisionne) {
		return collisionne.ordonneeLaPlusBasse() <= collisionneur.ordonneeLaPlusHaute()
				&& collisionneur.ordonneeLaPlusBasse() <= collisionne.ordonneeLaPlusHaute();
	}
}
