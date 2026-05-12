### LAB4-FRAGMENTS TEST


https://github.com/user-attachments/assets/56994dc0-67a2-456a-be44-ecce5f57b2aa

# Etape 1
Création du projet Android FragmentTest avec le package com.example.fragmentslab.
# Etape 2

Création de MainActivity, qui contient deux boutons : Fragment 1 et Fragment 2.

<img width="1044" height="1315" alt="image" src="https://github.com/user-attachments/assets/f506f1ca-c74c-45dc-9e3a-8a3bcd0cce7b" />

# Etape 3

Ajout d’un FrameLayout dans activity_main.xml. C’est dans ce conteneur que les fragments sont affichés.

<img width="1058" height="1074" alt="image" src="https://github.com/user-attachments/assets/de84f067-09e2-4241-a152-590d358838d5" />


# Etape 3

Au lancement de l’application, FragmentOne est affiché automatiquement par défaut.

# Etape 3


Quand on clique sur le bouton Fragment 1, l’application remplace le fragment actuel par FragmentOne.

# Etape 3


Quand on clique sur le bouton Fragment 2, l’application remplace le fragment actuel par FragmentTwo et l’ajoute à la pile de retour.

# Etape 3


Grâce à addToBackStack(null), si l’utilisateur appuie sur le bouton Retour Android après avoir ouvert FragmentTwo, il revient à FragmentOne.

# Etape 3


FragmentOne contient un texte et un bouton. Quand on clique sur le bouton, le texte devient : Bonjour depuis Fragment 1!

