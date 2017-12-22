# ProjetUML_Miashs

Pour lancer notre application :
Il faut ouvrir le projet sur eclipse
Pour cela , importer le projet depuis votre repos git


#Creation des Objets
##Creation d'un Bien
* ID : automatique
* Nom : Pas de caracteres speciaux ni de chifres
* Adresse : commencer par un chiffre puis une virgule et suite de caracteres /!\ ne pas mettre d'espace apres la virgule	 	ex : 2,rue de la court
* Orientation : lettre en majuscule : O, E, N, S
* Prix : un nombre sans virgule

###Creation d'une Maison
* nbEtage : int
* surface habitable : double
* terrain : le terrain doit avoir etait creer au prealable
* moyen chauffe : string sans caractere speciaux

###Creation d'un Terrain
* longueurFacade : double
* surfaceTotal : double

###Creation d'un Appartement
* nbPiece : int
* etage : int
* Charges mensuelles : double
* surface : double

## Creation client
* Nom : Alphabet, espaces et tirets 
* Adresse : commencer par un chiffre puis une virgule et suite de caracteres /!\ ne pas mettre d'espace apres la virgule	 	ex : 2,rue de la court
* num Tel : chifre de 0 à 9 possibilité de separer avec - , . , " "
* mail : commence par un String puis doit comporter un @ puis un autre String puis "." et apres 2 à 4 caracteres
* formeJuridique : String
* Siren : 9 chifres 

## Creation RDV
* date : JJ/MM/AAAA,HH:MinMin /!\ on peut rentrer tout est n'importe quoi donc verifier la coerance
* Client : doit etre creer avant pour une selection

### Creation RdvFinalisation
* Mandat : section un mandat existant

### Creation RdvMandat
* Bien : selection d'un bien existant

### Creation RdvPromesseVente
* Mandat : selection un mandat existant
* Client : selection d'un client existant comme acheteur

## Creation PUB
* typePub : H pour html, T pour text, I pour image, V pour video
* bienConcerner : selection d'un bien existant
* lien : String avec des caracteres speciaux pour un chemin
