package leetcode.easy;

// isBadVersion is written in leetcode compiler
public class FirstBadVersion {
    private int solve(int start, int end) {

        int mid = (start + end) / 2;

        boolean isMidBad = isBadVersion(mid);

        if (isMidBad) {
            boolean isBadBeforeMid = isBadVersion(mid - 1);
            if (isBadBeforeMid) return solve(start, mid - 1);
            else return mid;
        } else {
            boolean isNextBad = isBadVersion(mid + 1);
            if (isNextBad) return mid + 1;
            else return solve(mid + 1, end);
        }
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}
