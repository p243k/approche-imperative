package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] ints = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(ints[0]);
        System.out.println(ints.length);
        System.out.println(ints[ints.length - 1]);
        System.out.println(ints[10]); /// Cela échoue car c'est en dehors des limites du tableau
    }
}
