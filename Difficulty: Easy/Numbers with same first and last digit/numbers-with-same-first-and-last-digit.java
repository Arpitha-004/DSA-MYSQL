// User function Template for Java
class Solution {
    static long numbersInRange(int L, int R) {
        // code here
        if (L > R) return 0;
        return countSameFirstLast(R) - countSameFirstLast(L - 1);
    }
    static long countSameFirstLast(long N) {
        if (N <= 0) return 0;
        if (N < 10) return N;

        String s = Long.toString(N);
        int len = s.length();

        long[] pow10 = new long[len];
        pow10[0] = 1L;
        for (int i = 1; i < len; i++) pow10[i] = pow10[i - 1] * 10L;

        long count = 0;

        // Case A: numbers with fewer digits
        for (int d = 1; d < len; d++) {
            if (d == 1) count += 9;
            else count += 9 * pow10[d - 2];
        }

        // Case B: numbers with same length
        int first = s.charAt(0) - '0';
        int last = s.charAt(len - 1) - '0';
        long chunk = (len >= 2) ? pow10[len - 2] : 1L;

        count += (first - 1) * chunk;

        long middleValue = 0;
        if (len > 2) middleValue = Long.parseLong(s.substring(1, len - 1));

        count += middleValue;

        if (last >= first) count++;

        return count;
    }

}