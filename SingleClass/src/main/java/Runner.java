public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        String name = bear.getName();
//        bear.name = "Randoplh";
        bear.setName("Randolph");
        name = bear.getName ();
        System.out.println(name);
    }
}
