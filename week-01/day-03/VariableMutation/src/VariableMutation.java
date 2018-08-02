public class VariableMutation {
    public static void main (String[] args) {
        int a = 3;

        System.out.println(a+10);

        int b = 100;

        System.out.println(b-7);

        int c = 44;

        System.out.println(c*2);

        int d = 125;

        System.out.println(b/5);

        int e = 8;

        System.out.println(e*e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger = f1>f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;

        boolean g1g2 = 2*g2 > g1;
        System.out.println(g1g2);

        int h = 135798745;

        boolean h2 = h%11==0;
        System.out.println(h2);

        int i1 = 10;
        int i2 = 3;
        int i2squared = i2*i2;
        int i2cube = i2*i2*i2;


        boolean i1i2 =i1 > i2squared && i2cube>i1;

        System.out.println(i1i2);


        int j = 1521;

        boolean jdivi = j%5==0 && j%3==0;
        System.out.println(jdivi);

        String k = "Apple";
        System.out.println(k +k +k +k);



        }
    }

