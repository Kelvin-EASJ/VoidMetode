public class VoidMetode {

    Boolean x = true;


    public static void main(String[] args) {

        //StringMetode() returner en string
        VoidMetode test = new VoidMetode();
        System.out.println(test.stringMetode());
        //Virker ikke fordi void returner ikke en værdi
        //System.out.println(test.stringMetode());
        test.voidMetode();

    }

    void voidMetode() {
        ///
        String a = "Værdi2!";
        System.out.println(a);

    }
        String stringMetode() {
        return "Værdi1!";
    }

    boolean lukDoeren() {
        boolean lukket = true;
        //hvis døren er lukket, så skal den returner true

        //hvis ikke den er lukket, pga. en sutsko i klemme, så skal den returner false
        return lukket = false;
    }
}
