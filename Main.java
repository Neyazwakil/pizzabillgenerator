public class Main {
    // fun to print n natural number
    // public void fun(int n) {

    // if (n < 1) {
    // return;
    // }
    // System.out.println(n);
    // fun(n - 1);

    // }
    // * */
    // find factorial using recursion
    // static int fact(int n) {
    // if (n < 1) {
    // return 1;
    // }
    // return n * fact(n - 1);
    // }
    static int fibo(int n) {

        if (n == 1 || n == 2) {
            return 1;

        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("this is recursive call");
        // Main obj = new Main();
        // obj.fun(5);
        // int n = 5;
        // for (int i = n; i > 0; i--) {
        // System.out.println(i);
        // }
        // System.out.println(fact(5));
        System.out.println(fibo(6));

    }
}
