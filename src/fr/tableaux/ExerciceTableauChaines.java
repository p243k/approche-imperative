package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] strings = {"Lille", "Lyon", "Paris", "Marseille",  "Lens"};
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.length);

        strings[3] = "Reims";
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
