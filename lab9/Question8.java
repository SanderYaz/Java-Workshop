public class Question8 {//How many objects are created= 2 times (b and d)
    int num;

    public static void main(String[] args) {
        Question8 b = foo();
        b.num = 5;
        Question8 c = b;
        c.num = 4;
        Object obj = c;
        Question8 d = foo();
        d.num = b.num;

    }

    private static Question8 foo() {
        return new Question8();
    }
}