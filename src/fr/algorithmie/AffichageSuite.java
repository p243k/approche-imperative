package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        /// Boucle pour afficher tous les nombres de 1 à 10 inclus
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        /// Boucle pour afficher tous les nombres pairs entre 0 et 10 inclus
        for (int i = 0; i<=10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /// Boucle pour afficher tous les nombres impairs entre 0 et 9 inclus
        for (int i = 0; i<=9; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        /// Boucle pour afficher tous les nombres de 1 à 10 inclus
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /// Boucle pour afficher tous les nombres pairs entre 0 et 10 inclus
        int p = 0;
        while (p <= 10) {
            if (p%2 == 0) {
                System.out.println(p);
            }
            p++;
        }

        /// Boucle pour afficher tous les nombres pairs entre 0 et 9 inclus
        int o = 0;
        while (o < 10) {
            if (o%3 == 0) {
                System.out.println(p);
            }
            o++;
        }
    }
}
