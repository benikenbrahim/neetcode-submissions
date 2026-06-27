class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {

            switch (op) {

                case "+":
                    int last = stack.pop();
                    int second = stack.peek();

                    stack.push(last);
                    stack.push(last + second);
                    break;

                case "D":
                    stack.push(stack.peek() * 2);
                    break;

                case "C":
                    stack.pop();
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}