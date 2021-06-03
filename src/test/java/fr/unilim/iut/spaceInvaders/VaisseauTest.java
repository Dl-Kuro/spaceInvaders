package fr.unilim.iut.spaceInvaders;

import org.junit.Test;

import fr.unilim.iut.spaceInvaders.model.Dimension;
import fr.unilim.iut.spaceInvaders.model.Position;
import fr.unilim.iut.spaceInvaders.model.Vaisseau;
import fr.unilim.iut.spaceInvaders.utils.*;

public class VaisseauTest {

	@Test(expected = MissileException.class)
	public void test_LongueurMissileSuperieureALongueurVaisseau_UneExceptionEstLevee() throws Exception {
		Vaisseau vaisseau = new Vaisseau(new Dimension(5, 2), new Position(5, 9), 1);
		vaisseau.tirerUnMissile(new Dimension(7, 2), 1);
	}
}
