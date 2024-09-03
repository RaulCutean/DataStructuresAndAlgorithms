public class Reverser {

    private String _input;
    private String _output;


    public Reverser(String input) {
        _input = input;
        _output = "";
    }


    public String reverseStack() {

        int length = _input.length();
        Stack stack = new Stack(length);

        for(int i = 0 ; i < length ; i++) {
            stack.push(_input.charAt(i));
        }

        while(!stack.isEmpty()) {
            _output = _output + stack.pop();
        }

        return _output;
    }


}
