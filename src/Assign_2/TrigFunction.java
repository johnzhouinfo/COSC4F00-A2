package Assign_2;

/**
 * @Author Lingjue Zhou
 * @Date 2019/10/25
 */
public final class TrigFunction {

    /**
     * Sin function using Taylor series approximation
     *
     * @param angRad radian
     * @return
     */
    public static double sin(double angRad) {
        double radian = convertRadian(angRad);
        // compute the Taylor series approximation
        double term = 1.0;  // ith term = x^i / i!
        double sum = 0.0;  // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (radian / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        return sum;
    }

    /**
     * Cos function using Taylor series approximation
     *
     * @param angRad radian
     * @return
     */
    public static double cos(double angRad) {
        double radian = convertRadian(angRad);
        // compute the Taylor series approximation
        double term = 1.0;  // ith term = x^i / i!
        double sum = 0.0;  // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (radian / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
        return 1 + sum;
    }

    /**
     * Tan function
     *
     * @param angRad radian
     * @return
     */
    public static double tan(double angRad) {
        return 0.0;
    }

    /**
     * Cot function
     *
     * @param angRad radian
     * @return
     */
    public static double cot(double angRad) {
        return 0.0;
    }

    /**
     * Csc function
     *
     * @param angRad radian
     * @return
     */
    public static double csc(double angRad) {
        return 0.0;
    }

    /**
     * Sec function
     *
     * @param angRad radian
     * @return
     */
    public static double sec(double angRad) {
        return 0.0;
    }

    /**
     * Convert radian between -2 PI and 2 PI
     *
     * @param angRad input radian
     * @return
     */
    private static double convertRadian(double angRad) {
        return angRad % (2 * Math.PI);
    }
}
