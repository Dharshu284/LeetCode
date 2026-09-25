class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] count = new int[26];

        for (char c : p.toCharArray())
            count[c - 'a']++;

        int left = 0, right = 0, need = p.length();

        while (right < s.length()) {
            if (count[s.charAt(right) - 'a'] > 0)
                need--;

            count[s.charAt(right) - 'a']--;
            right++;

            if (right - left > p.length()) {
                if (count[s.charAt(left) - 'a'] >= 0)
                    need++;

                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (need == 0)
                ans.add(left);
        }

        return ans;
    }
}