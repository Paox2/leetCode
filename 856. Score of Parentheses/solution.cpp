class Solution {
public:
    int scoreOfParentheses(string S) {
        int numberOfOpen = 0;
        bool preIsOpen = false;
        int score = 0;
        
        for (char s : S) {
            if (s == '(') {
                numberOfOpen += 1;
                preIsOpen = true;
            } else {
                if(preIsOpen == true) {
                    score += pow(2, numberOfOpen-1);
                    preIsOpen = false;
                }
                numberOfOpen -= 1;
            }
        }
        
        return score;
    }
};