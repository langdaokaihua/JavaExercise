package basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //算术运算符
        System.out.println("a+b="+(a+b));
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0

        // 关系运算符
        System.out.println("a > b = " + (a > b)); // true
        System.out.println("a < b = " + (a < b)); // false
        System.out.println("a >= b = " + (a >= b)); // true
        System.out.println("a <= b = " + (a <= b)); // false
        System.out.println("a == b = " + (a == b)); // false
        System.out.println("a != b = " + (a != b)); // true

        // 逻辑运算符
        boolean c = true;
        boolean d = false;
        System.out.println("c && d = " + (c && d)); // false
        System.out.println("c || d = " + (c || d)); // true
        System.out.println("!c = " + (!c)); // false
    }
}
