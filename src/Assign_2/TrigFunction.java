package Assign_2;

/**
 * @Author Lingjue Zhou
 * @Date 2019/10/25
 */
public final class TrigFunction {

    /**
     * Sin function using Taylor series approximation
     * Returns the trigonometric sine of radian
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
     * Returns the trigonometric cosine of radian
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
     * Returns the trigonometric tangent of radian, using sin(x)/cos(x)
     * It also handles the incorrect input when user input the value like PI/2 etc.
     *
     * @param angRad radian
     * @return
     */
    public static double tan(double angRad) {
        double radian = convertRadian(angRad);
        if (radian == Math.PI / 2 || radian == 3 * Math.PI / 2)
            throw new InvalidInputException("Invalid number inputted (value = " + angRad + ")");
        return sin(radian) / cos(radian);
    }

    /**
     * Returns the trigonometric cotangent of radian, since it just the inverse of tan(x) function, using cos(x)/sin(x)
     * It will throw a invalid exception when user enter 0 or PI, etc.
     *
     * @param angRad radian
     * @return
     */
    public static double cot(double angRad) {
        double radian = convertRadian(angRad);
        if (radian == 0.0 || radian == Math.PI)
            throw new InvalidInputException("Invalid number inputted (value = " + angRad + ")");
        return cos(radian) / sin(radian);
    }

    /**
     * Returns the trigonometric cosecant of radian, by using 1/sin(x)
     * It will throw an exception when user entered 0 or PI etc.
     *
     * @param angRad radian
     * @return
     */
    public static double csc(double angRad) {
        double radian = convertRadian(angRad);
        if (radian == 0.0 || radian == Math.PI)
            throw new InvalidInputException("Invalid number inputted (value = " + angRad + ")");
        return 1 / sin(radian);
    }

    /**
     * Returns the trigonometric secant of radian, by using 1/cos(x)
     * It will throw an exception when user entered PI/2 or 3PI/2 etc.
     *
     * @param angRad radian
     * @return
     */
    public static double sec(double angRad) {
        double radian = convertRadian(angRad);
        if (radian == Math.PI / 2 || radian == 3 * Math.PI / 2)
            throw new InvalidInputException("Invalid number inputted (value = " + angRad + ")");
        return 1 / cos(radian);
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
