public class MinFlips {
    public static int minBitFlips(int start, int goal) {
        int c = 0;
        while (start != 0 || goal != 0) {
            int l = start & 1;
            int last = goal & 1;

            if ((l ^ last) != 0) {
                c++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return c;
    }

    public static void main(String[] args)
    {
        System.out.println(minBitFlips(4, 8));
        System.out.println(minBitFlips(8, 4));
    }
}
