package Lab1;

public class Algo {
    public static double calculate1(double b, double c) {
        if (c < 0 || b < 0){
            throw new ArithmeticException();
        }else {
            return (b*Math.sqrt(c)/Math.pow(2,b)-c*Math.sqrt(b)/Math.pow(2,c));
        }
    }
    public static double calculate2(double x, double a, double b){
        if (x>0){
            return a*Math.pow(x,3)-b*Math.pow(x,2);
        }else {
            return b*Math.pow(x,3)+a*Math.pow(x,2);
        }
    }
    public static double calculate3 (int j, int n, int i, int m) {
        double sum = 1;
        if ( j < 0  || i < 0 || j > n || i > m){
            throw new ArithmeticException();
        }
        else {
            for(j=j;j<=n;j++){
                sum *= factorial(j);
            }
            for (i=i; i<=m; i++){
                sum-=factorial(i);
            }
        }
        return sum;
    }
    private static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        else{
            int sum = 1;
            for (int i = 2; i<=num; i++){
                sum*=i;
            }
            return sum;
        }
    }
}
