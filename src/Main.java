public class Main {
    public static void main(String[] args) {
        System.console();
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        
    }
}