public class Tripledots {
    public static void main(String[] args) {

        greeting("rutika","arjun");
    }
    public static void greeting(String ... name)
    {
        for(String s:name)
        System.out.println("hello "+s);
    }
}
