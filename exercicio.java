// class Incremental {
//     private static int count = 0;
//     private int numero;
//     public Incremental() {
//         numero = ++count;
//     }
//     public String toString() {
//         return "Incremental " + numero;
//     }
//  }

 class SingletonIncremental {
    private static SingletonIncremental instance;
    private static int count = 0;
    private int numero;
    private SingletonIncremental() {}
    public static SingletonIncremental getSingleton() {
        if (instance == null) {
            instance = new SingletonIncremental();
        } 
        instance.numero = ++count;
		return instance;
    }
    public String toString() {
        return "SingletonIncremental " + numero;
    }
 }

public class exercicio {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        SingletonIncremental inc = SingletonIncremental.getSingleton();
          System.out.println(inc);
        }
    }
 }
