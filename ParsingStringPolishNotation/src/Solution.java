import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int val1 , val2 = 0;
        for(int i = 0 ; i < tokens.length ; i++){
            switch(tokens[i]){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 - val1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 / val1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));

            }
        }
        return stack.pop();
    }







    public static void main(String[] args){

        String[] tokens = {"2" , "1" , "+" , "3" , "*"};
        Solution solution = new Solution();

        System.out.println(solution.evalRPN(tokens));

    }

}
