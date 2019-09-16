package Lommeregner;

public class Lommeregner {
    double sum;
    double minus;
    double gange;
    double divider;

     int sum(int a, int b) {
        int resultat = a + b;
        return resultat;

    }

    int minus(int a, int b) {
        int resultat = a - b;
        return resultat;

    }

    int gange(int a, int b) {
        int resultat = a * b;
        return resultat;

    }

    int divider(int a, int b) {
        int resultat = a / b;
        return resultat;
    }

    int secret(int a, int b, int c) {
         int resultat = (a * b) / c;
         return resultat;
    }
}
