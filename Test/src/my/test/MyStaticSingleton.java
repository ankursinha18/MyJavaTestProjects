package my.test;


public class MyStaticSingleton {
 
    public static void main(String a[]){
        MySingleton ms = MySingleton.getInstance();
        ms.testSingleton();
        MySingleton ms2 = MySingleton.getInstance();
        ms2.testSingleton();
    }
}
 
class MySingleton{
     
    private static MySingleton instance;
     
    static{
        instance = new MySingleton();
    }
     
    private MySingleton(){
        System.out.println("Creating MySingleton object...");
    }
     
    public static MySingleton getInstance(){
        return instance;
    }
     
    public void testSingleton(){
        System.out.println("Hey.... Instance got created...");
    }
}
