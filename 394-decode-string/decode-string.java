class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strings = new Stack<>();

        String current = "";
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } 
            else if (c == '[') {
                nums.push(num);
                strings.push(current);
                num = 0;
                current = "";
            } 
            else if (c == ']') {
                int repeat = nums.pop();
                String previous = strings.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            } 
            else {
                current += c;
            }
        }

        return current;
    }
}