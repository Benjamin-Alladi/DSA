public class RangeXor {

    static int getxor(int n) {
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        if (n % 4 == 3) {
            return 0;
        }
        if (n % 4 == 0) {
            return n;
        }
        return -1;
    }

    public static int findXOR(int L, int R) {
        // Write your code here.
        return getxor(R)^getxor(L - 1);
    }

    public static void main(String[] args) {
        System.out.println(findXOR(2, 8));
    }

}
