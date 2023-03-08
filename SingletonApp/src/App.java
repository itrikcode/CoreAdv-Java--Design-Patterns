import com.itsp.EagerSingleton;
import com.itsp.Singleton;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        Singleton s1 = com.itsp.Singleton.getInstance();
        Singleton s2 = com.itsp.Singleton.getInstance();
        System.out.println(s1 == s2);

        // call eager instantiation in Singleton class
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(es1 == es2);

        //
    }
}
