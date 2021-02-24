class Solution {
    public int scoreOfParentheses(String S) {
    
        int numberOfOpen = 0;
        boolean preIsOpen = false;
        int score = 0;
        
        for (char s : S.toCharArray()) {
            if (s == '(') {
                numberOfOpen += 1;
                preIsOpen = true;
            } else {
                if(preIsOpen == true) {
                    score += (int) Math.pow(2, numberOfOpen-1);
                    preIsOpen = false;
                }
                numberOfOpen -= 1;
            }
        }
        
        return score;
    }
}