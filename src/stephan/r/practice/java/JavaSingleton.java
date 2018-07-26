package stephan.r.practice.java;

/**
 * https://www.hackerrank.com/challenges/java-singleton/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaSingleton {

	public static void main(String[] args) {}
}

class Singleton {

    private volatile static Singleton instance;
    public static String str;
    
    private Singleton() {}
    
    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        
        return instance;
    }   
}
