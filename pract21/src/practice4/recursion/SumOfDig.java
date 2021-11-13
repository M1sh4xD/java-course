package practice4.recursion;

public class SumOfDig {

    private static int sum;

    public static Object doSum(int n) {
        sum += n % 10;
        if (n == 0) {
            System.out.println(sum);
        } else {
            doSum(n / 10);
        }
        System.out.println(sum);
        return null;
    }
}
