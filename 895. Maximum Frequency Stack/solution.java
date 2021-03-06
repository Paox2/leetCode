class FreqStack {
    private HashMap<Integer, Integer> freq;
    private int max = 0;
    private ArrayList<ArrayList<Integer>> stack;

    public FreqStack() {
        freq = new HashMap<>();
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        int xFreq = freq.getOrDefault(x, 0) + 1;
        freq.put(x, xFreq);
        
        if(stack.size() == xFreq - 1) {
            stack.add(new ArrayList<>());
        }
        
        stack.get(xFreq-1).add(x);
        max = Math.max(max, xFreq);
    }
    
    public int pop() {
        ArrayList<Integer> list = stack.get(max - 1);
        int x = list.remove(list.size() - 1);
        freq.put(x, max - 1);
        max -= list.isEmpty() ? 1 : 0;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */