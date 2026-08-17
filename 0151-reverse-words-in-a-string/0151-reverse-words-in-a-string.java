class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();

        String[] words = s.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            st.push(words[i]);
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());

            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}