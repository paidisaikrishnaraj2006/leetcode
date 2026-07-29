class Solution {
    private static final long CAP = 2_000_000_000_000_000L; // comfortably above any valid k

    public String smallestPalindrome(String s, long k) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) cnt[ch - 'a']++;

        char mid = 0;
        int[] halfCnt = new int[26];
        int m = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) mid = (char) ('a' + i);
            halfCnt[i] = cnt[i] / 2;
            m += halfCnt[i];
        }

        if (arrangements(halfCnt, m) < k) return "";

        StringBuilder result = new StringBuilder();
        int[] remaining = halfCnt.clone();
        int remLen = m;

        for (int pos = 0; pos < m; pos++) {
            for (int c = 0; c < 26; c++) {
                if (remaining[c] == 0) continue;
                remaining[c]--;
                long ways = arrangements(remaining, remLen - 1);
                if (ways >= k) {
                    result.append((char) ('a' + c));
                    remLen--;
                    break;
                }
                k -= ways;
                remaining[c]++;
            }
        }

        String half = result.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(half);
        if (mid != 0) sb.append(mid);
        sb.append(new StringBuilder(half).reverse());
        return sb.toString();
    }

    // number of distinct permutations of this multiset, capped
    private long arrangements(int[] counts, int length) {
        long res = 1;
        long total = 0;
        for (int c : counts) {
            for (int j = 1; j <= c; j++) {
                total++;
                res = res * total / j;
                if (res > CAP) return CAP + 1;
            }
        }
        return res;
    }
}