import java.util.*;

class Solution {
    public String removeDuplicateLetter(String s) {   

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';

            freq[idx]--;

            if (visited[idx]) continue;

            while (!st.isEmpty() &&
                   st.peek() > ch &&
                   freq[st.peek() - 'a'] > 0) {

                char removed = st.pop();
                visited[removed - 'a'] = false;
            }

            st.push(ch);
            visited[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }

    public String removeDuplicateLetters(String s) {
        return removeDuplicateLetter(s);
    }
}
