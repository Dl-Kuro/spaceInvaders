# Space-Invaders

- [Semaine n°1 : du 26 avril au 01 mai](#semaine1)  
- [Semaine n°2 : du 03 mai au 08 mai](#semaine2)
- [Semaine n°3 : du 17 mai au 22 mai](#semaine3)
- [Semaine n°4 : du 24 mai au 29 mai](#semaine3)
- [Glossaire](#glossaire)



## Semaine n°1 : du 26 avril au 01 mai <a id="semaine1"></a>


### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

- Story n°1 : Créer un espace de jeu  
Un espace de jeu est créé aux dimensions données (2D) 
Cet espace de jeu est vide

- Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu  
Un nouveau vaisseau est créé
Le vaisseau est positionné aux coordonnées transmises
Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
La position souhaitée est transmise par ses coordonnées x et y.
Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    

- Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la droite 
Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


- Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la gauche 
Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

### Fonctionnalité en cours d’implémentation : 
Aucune


### Diagramme de classes 

![Diagrammes de classes de la semaine 1](img/DiagrammeClasses_Semaine1.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  

![Nuage de mots de la semaine 1](img/NuageMots_Semaine1.png)


### Difficultés rencontrées 
Aucune

### Remarques diverses
Aucun

-------------

## Semaine n°2 : du 03 mai au 08 mai <a id="semaine2"></a>


### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°2 : Déplacer un vaisseau dans l'espace de jeu (en-cours)

- Etape n°1 : Positionner un nouveau vanisseau avec une dimension donnée 

- Etape n°2 : Positionner un nouveau vaisseau dans l’espace de jeu     


### Fonctionnalité en cours d’implémentation : 
Fonctionnalité n°2


### Diagramme de classes 

![Diagrammes de classes de la semaine 2](img/DiagrammeClasses_Semaine2.png)


### Nuage de mots du projet spaceinvaders

 ![Nuage de mots de la semaine 2](img/NuageMots_Semaine2.png)


### Difficultés rencontrées 
Etape n°2

### Remarques diverses
Aucun

-------------

## Semaine n°3 : du 17 mai au 22 mai <a id="semaine3"></a>


### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°2 : Déplacer un vaisseau dans l'espace de jeu (fini)

- Etape n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension

- Etape n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension   


### Fonctionnalité en cours d’implémentation : 
Aucune


### Diagramme de classes 

![Diagrammes de classes de la semaine 3](img/DiagrammeClasses_Semaine3.png)


### Nuage de mots du projet spaceinvaders

 ![Nuage de mots de la semaine 3](img/NuageMots_Semaine3.png)


### Difficultés rencontrées 
Aucun

### Remarques diverses
Aucun

-------------

## Semaine n°4 : du 24 mai au 29 mai <a id="semaine4"></a>


### Sprints et fonctionnalités réalisées 

#### Space Invaders - Spike : Prise en main et intégration d'un moteur graphique (en-cours)




### Fonctionnalité en cours d’implémentation : 
Aucune


### Diagramme de classes 

![Diagrammes de classes de la semaine 4](img/DiagrammeClasses_Semaine4.png)


### Nuage de mots du projet spaceinvaders

 ![Nuage de mots de la semaine 4](img/NuageMots_Semaine4.png)


### Difficultés rencontrées 
Aucun

### Remarques diverses
Aucun

-------------

## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

* **Envahisseur**  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.


* **Missile** :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

La définition des termes métiers relatifs au projet doit se trouver dans le glossaire 
Ce glossaire doit être compléter au fil des séances...

------------- 
