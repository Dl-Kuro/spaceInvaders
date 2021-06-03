package fr.unilim.iut.spaceInvaders.model;

public class Envahisseur extends Sprite {
    Direction direction;

    public Envahisseur(Dimension dimension, Position origine, int vitesse, Direction direction) {
	super(dimension, origine, vitesse);
	this.direction = direction;
    }
}
