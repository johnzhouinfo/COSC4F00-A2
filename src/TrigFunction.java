/**
 * @Author Lingjue Zhou
 * @Date 2019/10/25
 */
public class TrigFunction {

    public static String initial() {
        return "Hello world!";
    }

    public static double sin(double x) {
        x = x % (2 * Math.PI);//Convert to degree
        // compute the Taylor series approximation
        double term = 1.0;  // ith term = x^i / i!
        double sum = 0.0;  // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        return sum;
    }

    public static double cos(double x) {
        x = x % (2 * Math.PI);//Convert to degree
        // compute the Taylor series approximation
        double term = 1.0;  // ith term = x^i / i!
        double sum = 0.0;  // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
        return 1 + sum;
    }
}
