class Solution {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder("1");
        n--;
        while (n > 0) {
            StringBuilder last = result;
            result = new StringBuilder();
            int count = 1;
            char pre = last.charAt(0);
            for (int i = 1; i < last.length(); i++) {
                if (pre == last.charAt(i)) {
                    count++;
                } else {
                    result.append(count).append(pre);
                    count = 1;
                    pre = last.charAt(i);
                }
            }
            result.append(count).append(pre);
            n--;
        }
        
        return result.toString();
    }
}