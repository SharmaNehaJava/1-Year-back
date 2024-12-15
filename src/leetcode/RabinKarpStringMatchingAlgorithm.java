package leetcode;

public class RabinKarpStringMatchingAlgorithm {
    private int prime = 101;
    public static void main(String[] args) {
                String text = "ABCCDDAEFG";
                String pattern = "CDD";
                new RabinKarpStringMatchingAlgorithm().search(pattern, text);
    }
    public void search(String pattern, String text) {
        int M = pattern.length();
        int N = text.length();
        long patternHash = createHash(pattern, M);
        long textHash = createHash(text, M);

        for (int i = 0; i <= N - M; i++) {
            if (patternHash == textHash && checkEqual(text, pattern, i, i + M - 1, 0, M - 1)) {
                System.out.println("Pattern found at index " + i);
            }
            if (i < N - M) {
                textHash = recalculateHash(text, i, i + M, textHash, M);
            }
        }
    }

    private long createHash(String str, int end) {
        long hash = 0;
        for (int i = 0; i < end; i++) {
            hash += str.charAt(i) * Math.pow(prime, i);
        }
        return hash;
    }

    private long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int patternLen) {
        long newHash = oldHash - str.charAt(oldIndex);
        newHash = newHash / prime;
        newHash += str.charAt(newIndex) * Math.pow(prime, patternLen - 1);
        return newHash;
    }

    private boolean checkEqual(String text, String pattern, int start1, int end1, int start2, int end2) {
        if (end1 - start1 != end2 - start2) {
            return false;
        }
        while (start1 <= end1 && start2 <= end2) {
            if (text.charAt(start1) != pattern.charAt(start2)) {
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }
}
