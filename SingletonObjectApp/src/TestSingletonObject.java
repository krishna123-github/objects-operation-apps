 
/**
 * creating a SINGLETON object....
 * Maintaining only one object throughout the JVM of a class
 * @author krishna pal
 */
class ServiceFactory{
    private static final ServiceFactory serviceFactory;  // variable should can be declare  static and final
    
    static{      // create a static block that willl execute  through the  class...
        System.out.println("----servive  factory initialized-----");
        serviceFactory = new ServiceFactory();    //object initialize  only once in JVM and always live in the  JVM...ceating the Object of the class...
    }

    public ServiceFactory() {
    }

    public static ServiceFactory getServiceFactory() {    // creating aa constructor ...that will also a  static
        return serviceFactory;        // 
    }
}

public class TestSingletonObject {
    public  static void main(String[]args){
        ServiceFactory factory1 = ServiceFactory.getServiceFactory();  // getservicesFactory() method is static so its  will call direct through the class name...
        ServiceFactory factory2 = ServiceFactory.getServiceFactory();   // getservicesFactory() method is static so its  will call direct through the class name...
        System.out.println("factory1 hashCode =  "+factory1.hashCode());
        System.out.println("factory2 hashCode =  "+factory2.hashCode());
    }    
}
