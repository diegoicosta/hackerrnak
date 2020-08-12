package hr.bubble;

import java.math.BigDecimal;

/**
 * Sort list on numbers informed as Strings (the first one is how many exists - n)
 * but print in the original format, not in the one that was convert to BigDecimal
 */

class Solution {
    public static void main(String[] args) {
        args = new String[]{"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        int n = Integer.parseInt(args[0]);
        String[] s = new String[n + 2];
        for (int i = 1; i <= n; i++) {
            s[i - 1] = args[i];
        }

        /** bubble sort to sort strings but comparing first converting to BigDecimal
         *
         */
        for (int i = 0; i < 9-1; i++) {
            for (int j = 0; j < 9-i-1; j++) {
                if (BigDecimal.valueOf(Double.valueOf(s[j])).compareTo(BigDecimal.valueOf(Double.valueOf(s[j + 1]))) < 0) {
                    s[n + 1] = s[j]; // temp
                    s[j] = s[j + 1];
                    s[j + 1] = s[n + 1];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}