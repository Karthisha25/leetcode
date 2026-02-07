class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String original = cleaned.toString();
        StringBuilder rev = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            rev.append(original.charAt(i));
        }

        return original.equals(rev.toString());
    }
}
