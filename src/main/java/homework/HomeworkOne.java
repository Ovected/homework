package homework;

public class HomeworkOne {
    public static void main(String[] args) {
        variable();
        float z = doMath(2.3f, 4.5f, 47.3f, 3f);
        int cs = checkSum(2, 19);
        int in = integer(0);
        int tf = trueFalse(-21);
        //int ye = (2020);


       String a = greetings ("привет,");
        a += "Ваня";



        System.out.println(z);

        if (cs >= 10 && cs <= 20) System.out.println("верно");
        else if (cs < 10) System.out.println("неверно");
        else if (cs > 20) System.out.println("неверно");


        if (in <= 127 && in >= 0) System.out.println("положительное");
        else if (in >= -128 && in <= -1) System.out.println("отрицательное");

        if (tf > 0) System.out.println(false);
        else if (tf < 0) System.out.println(true);


        System.out.println(a);



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

    public static int checkSum(int a, int b) {

        return (a + b);
    }
    public static int integer(int a) {

        return a;
    }
    public static int trueFalse(int a){

        return a;
    }
    public static String greetings(String a) {

        return (a);
    }



}



