
class ReSum {

    public static void main(String args[]) {
        Sum(1, 5, 0);
    }

    public static void Sum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        Sum(i + 1, n, sum);
        System.out.println(i);

    }
}