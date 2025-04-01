package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        /// Déclaration du tableau de chaînes de caractères
        String[] strings = {"Lille", "Lyon", "Paris", "Marseille",  "Lens"};

        /// Affichage de chaque élément du tableau
        for (String string : strings) {
            System.out.println(string);
        }

        /// Affichage de la longueur du tableau
        System.out.println(strings.length);

        /// Remplacement de l'élément qui se trouve à l'index 3
        strings[3] = "Reims";

        /// Affichage des éléments après modification
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
