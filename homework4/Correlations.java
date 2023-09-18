package homework4;
public class Correlations {
public static double Correlation ( int[] xs, int[] ys){

        double sx = 0.0;
        double sy = 0.0;
        double sxx = 0.0;
        double syy = 0.0;
        double sxy = 0.0;

        int n = xs.length;

        for (int i = 0; i < n; ++i) {
        double x = xs[i];
        double y = ys[i];

        sx += x;
        sy += y;
        sxx += x * x;
        syy += y * y;
        sxy += x * y;
        }


        double cov = sxy / n - sx * sy / n / n;

        double sigmax = Math.sqrt(sxx / n - sx * sx / n / n);

        double sigmay = Math.sqrt(syy / n - sy * sy / n / n);

        return cov / sigmax / sigmay;
        }

    public static void main(String[] args) {
            int [] x = {2, 4, 6, 8};
            int [] y = {1, 3, 7, 13};

            System.out.println(Correlation(x,y));
    }
}