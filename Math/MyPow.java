/**
 * MyPow
 */
public class MyPow {

    public static void main(String[] args) {
        double x = 2.10000 ;
        int n  =3;

        System.out.println(res(x, n));

    }

    public static double res(double x , int n){
        return Math.pow(x, n);
    }
}