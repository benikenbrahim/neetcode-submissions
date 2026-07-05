class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> pile = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int second = pile.pop();
                int premier = pile.pop();
                switch (token) {
                    case "+":
                        pile.push(premier + second);
                        break;
                    case "-":
                        pile.push(premier - second);
                        break;
                    case "*":
                        pile.push(premier * second);
                        break;
                    case "/":
                        pile.push(premier / second); 
                        break;
                }
            } else {
                pile.push(Integer.parseInt(token));
            }
        }
        return pile.pop();
    }
}