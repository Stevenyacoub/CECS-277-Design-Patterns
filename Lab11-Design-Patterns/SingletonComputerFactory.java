public class SingletonComputerFactory {

    private static SingletonComputerFactory singletonFactory = null;
    
    // SingletonExample prevents any other class from instantiating
    private SingletonComputerFactory(){

    }
    
    // Providing Global point of access
    public static SingletonComputerFactory getSingletonFactory() {    
        if(singletonFactory == null){
            singletonFactory = new SingletonComputerFactory();
        }
        return singletonFactory; //YOUR CODE
    }
    
    public Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)){
            return new PC(ram, hdd, cpu);
        }else if("Server".equalsIgnoreCase(type)){
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}