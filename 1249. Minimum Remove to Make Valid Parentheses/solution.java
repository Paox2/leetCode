class Solution {
    public String minRemoveToMakeValid(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int parantheses = 0;
        int backParantheses = 0;
        HashMap<Integer, Integer> a = new HashMap<>();
        int bais = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] == '(') {
                parantheses++;
                a.put(parantheses, i);
            } else if (chars[i] == ')') {
                backParantheses++;
                if (backParantheses > parantheses) {
                    chars[i] = '0';
                    backParantheses--;
                    bais++;
                    continue;
                }
            }
            stringBuilder.append(chars[i]);
        }

        if (parantheses - backParantheses == 0) {
            return stringBuilder.toString();
        } else if (backParantheses == 0 && parantheses == stringBuilder.length()) {
            return "";
        } else {
            for (int i = parantheses - backParantheses; i > 0; i--) {
                stringBuilder.replace(a.get(parantheses) - bais, a.get(parantheses)+1-bais, "");
                parantheses--;
            }
            return stringBuilder.toString();
        }
    }
}