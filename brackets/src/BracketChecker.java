import java.util.ArrayList;

public class BracketChecker {

    private String _input;


    public BracketChecker(String input) {
        _input = input;
    }

    public void check() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);

        int length = _input.length();
        Brackets br = new Brackets(length);

        for(int i = 0 ; i < length ; i++) {
            char ch = _input.charAt(i);

            switch (ch) {
                case '{' :
                case '[' :
                case '(' :
                    br.push(ch);
                    break;
                case '}' :
                case ']' :
                case ')' :
                    if(!br.isEmpty()){
                        char chx = br.pop();
                        if( ( ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(') ){
                            System.out.println("Error: "+ch+" at " +i);
                        }
                    }
                    else { // prematurely empty
                        System.out.println("Error: "+ch +"at "+i);
                        break;
                    }
                default:
                    break;
            }
        }
        if(!br.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }


    }


}
