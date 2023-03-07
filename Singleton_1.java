class Singleton {

    private static Singleton INSTACLE;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (INSTACLE == null)
            INSTACLE = new Singleton();
        return INSTACLE;
    }

}

public class Singleton_1 {
    public static void main(String[] args) throws Exception {
        // Singleton s = new Singleton();// invalid
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // Class c = Class.forName("Singleton");
        // Singleton s3 = (Singleton) c.newInstance(); invalide

        System.out.println(s1 == s2);
        // System.out.println(s2 == s3);
    }
}