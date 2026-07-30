class Solution {
    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                int left1 = left + 1;
                int right1 = right;
                boolean t1 = true;

                while (left1 < right1) {
                    if (s.charAt(left1) != s.charAt(right1)) {
                        t1 = false;
                        break;
                    }
                    left1++;
                    right1--;
                }
                left1 = left;
                right1 = right - 1;
                boolean t2 = true;

                while (left1 < right1) {
                    if (s.charAt(left1) != s.charAt(right1)) {
                        t2 = false;
                        break;
                    }
                    left1++;
                    right1--;
                }

                return t1 || t2;
            }

            left++;
            right--;
        }

        return true;
    }
}