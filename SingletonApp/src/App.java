import com.itsp.Singleton;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        Singleton s1 = com.itsp.Singleton.getInstance();
        Singleton s2 = com.itsp.Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
