class FreqStack {
    private Map<Integer, Integer> frequences;
    private Map<Integer, Stack<Integer>> groupes;
    private int maxFreq;

    public FreqStack() {
        frequences = new HashMap<>();
        groupes = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {

        int f = frequences.getOrDefault(val, 0) + 1;
        frequences.put(val, f);
        
        if (f > maxFreq) {
            maxFreq = f;
        }
        if (!groupes.containsKey(f)) {
            groupes.put(f, new Stack<>());
        }
        groupes.get(f).push(val);  
     }
    
    public int pop() {
        Stack<Integer> pileMax = groupes.get(maxFreq);
        int val = pileMax.pop();
        
        frequences.put(val, frequences.get(val) - 1);
        
        if (pileMax.isEmpty()) {
            maxFreq--;
        }
        
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */