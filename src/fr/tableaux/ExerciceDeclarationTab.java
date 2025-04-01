package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        /// Déclaration du tableau d'entiers
        int[] ints = {8, -7, 12, 1, -2, 14, 17, 9};

        /// Affichage du nombre qui est à l'index 0
        System.out.println(ints[0]);

        /// Affichage de la longueur du tableau
        System.out.println(ints.length);

        /// Affichage de l'élément qui est au dernier index du tableau
        System.out.println(ints[ints.length - 1]);

        /// Affichage de l'élément à l'index 10
        System.out.println(ints[10]); /// Cela échoue car c'est en dehors des limites du tableau
    }
}
