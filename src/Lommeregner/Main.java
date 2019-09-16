package Lommeregner;

public class Main {
    public static void main(String[] args) {
        Lommeregner lommeregner = new Lommeregner();
        lommeregner.sum(1, 2);
        lommeregner.minus(1, 3);
        lommeregner.gange(4, 3);
        lommeregner.divider(10, 5);
        lommeregner.secret(5, 2, 5);

        System.out.println("lommeregner udregner...");

        System.out.println("resultatet bliver: ");
        System.out.println(lommeregner.sum(1, 2));

        System.out.println("resultatet bliver: ");
        System.out.println(lommeregner.minus(1, 3));

        System.out.println("resultatet bliver: ");
        System.out.println(lommeregner.gange(4, 3));

        System.out.println("resultatet bliver: ");
        System.out.println(lommeregner.divider(10, 5));

        System.out.println("resultatet bliver: ");
        System.out.println(lommeregner.secret(5, 2, 5));
    }
}
