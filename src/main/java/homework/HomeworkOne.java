package homework;

public class HomeworkOne {
    public static void main(String[] args) {
        variable();
        float z = doMath(2.3f, 4.5f, 47.3f, 3f);
        boolean boo = checkSum(2, 19);
        checkPositive(-3);
        int tf = trueFalse(-21);
        greetings("Ваня");
        isLeapYear(2011);
        isLeapYear(1100);

        System.out.println(z);
        System.out.println(boo);

    }

    public static void variable() {

        byte by = 2;
        short s = 20;
        int i = 200;
        long l = 2000;
        float f = 20.2f;
        double dou = 200.22d;
        char ch = 'x';
        boolean bo;
        String str = "Привет";

    }


    public static float doMath(float a, float b, float c, float d) {

        return (a * (b + (c / d)));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;

    }

    public static void checkPositive(int a) {

        boolean b = a >= 0;
        if (b) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }

    }


    public static int trueFalse(int a) {

        return a;
    }

    public static void greetings(String name) {

        System.out.println("Hi, " + name + "!");

    }

    public static void isLeapYear(int year) {

        if ((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
            System.out.println("год" + year + "Високосный");
        } else {
            System.out.println("год" + year + "Невисокосный");
        }
    }

}



