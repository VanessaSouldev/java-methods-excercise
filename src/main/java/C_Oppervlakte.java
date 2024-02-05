public class C_Oppervlakte {

    public static void main(String[] args) {
        int antwoord = 0;

        antwoord = oppervlakteRechthoek(2, 8);
        System.out.println("De oppervlakte van een rechthoek met lengte 2 en breedte 8 is " + antwoord);

        antwoord = oppervlakteVierkant(5);
        System.out.println("De oppervlakte van een vierkant met zijden van 5 cm is " + antwoord);

        antwoord = oppervlakteDoos(2,8,5);
        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is " + antwoord);

        antwoord = oppervlakteKubus(5);
        System.out.println("De oppervlakte van een kubus met zijden van 5 cm is " + antwoord);
    }
    public static int oppervlakteRechthoek(int x, int y) {
        return x * y;
    }
    public static int oppervlakteVierkant(int x) {
        return x * x;
    }

    public static int oppervlakteDoos(int x, int y, int z) {
        int bottomAndTop = x * y * 2;
        int frontAndBack = x * z * 2;
        int leftAndRight = y * z * 2;
        return bottomAndTop + frontAndBack + leftAndRight;
    }

    public static int oppervlakteKubus(int x) {
        return x * x * 6;
    }

}
