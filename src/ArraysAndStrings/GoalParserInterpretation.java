package ArraysAndStrings;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {

        StringBuilder result = new StringBuilder();

        for(int i=0;i<command.length(); i++){
            char current_char = command.charAt(i);
            if(current_char == 'G'){
                result.append(current_char);
                continue;
            }

            if(current_char == '(' && command.charAt(i+1) == ')'){
                result.append("o");
                i++;
                continue;
            }

            if(current_char == '(' && command.charAt(i+1) == 'a'){
                i+=3;
                result.append("al");
                continue;
            }
        }

        return result.toString();

    }
}
