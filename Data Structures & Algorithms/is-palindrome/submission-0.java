class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String str = "";

        // Keep only letters and digits
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str += ch;
            }
        }

        // Reverse the string
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }
}
