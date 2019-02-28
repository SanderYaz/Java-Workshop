package Question9;
public class Test{
    public static void main(String[] args) {
        Animal a0 = new Insect();
        Insect i = new Spider();
        Animal a1 = new Spider();
        System.out.println(a0);
        System.out.println(i);
        System.out.println(a1);
        System.out.println(a0.message());
        System.out.println(i.message());
        System.out.println(a1.message());
    }
}
