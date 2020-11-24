package Lesson1;

public class Main<ifTest, negativeTest> {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static String name;
    private static int year;

    public static void main(String[] args) {

        byte i = 1;
        System.out.println(i);

        short j = 2;
        System.out.println(j);

        int k = 3;
        System.out.println(k);

        long n = 8;
        System.out.println(n);

        float e = 2.5f;
        System.out.println(e);

        double f = 2.5;
        System.out.println(f);

        char g = 3000;
        System.out.println(g);

        boolean h = true;
        System.out.println(h);

        String str = "Hello";
        System.out.println(str);

        System.out.println(evaluateExpression(a = 1, b = 2, c = 12, d = 4));

        System.out.println(ifTest(a = 2, b = 3));
        System.out.println(negativeTest(a = 0));
        System.out.println(negativeNumber(a = -1));
        System.out.println(greetName(name = "Anna"));
        System.out.println(printYear(year = 2020));


    }

    private static boolean printYear(int year) {
        return false;
    }

    {

               if (year % 4 == 0) ;         {
            System.out.println("Високосный год");
        }
        if (year % 100 == 0) ;         {
            System.out.println("Невисокосный год");;
        } }


    private static String greetName(String name) {
        return "Hello" + name + "!";
    }

    public static boolean negativeNumber(int number) {
        return number < 0;
    }

    public static double evaluateExpression(int a, int b, int c, int d) {

        return a * (b + ((double) c / d));
    }

    public static boolean ifTest(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String negativeTest(int a) {
        if (a >= 0) {
            return ("Положительное число");
        } else {
            return ("Отрицательное число");
        }
    }
}


