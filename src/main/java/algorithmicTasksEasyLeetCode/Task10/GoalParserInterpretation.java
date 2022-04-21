package algorithmicTasksEasyLeetCode.Task10;
/*You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.*/
public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        String s ="";
        String temp ="";
        for(int i = 0; i<command.length();i++){
            temp = temp + command.charAt(i);
            if(temp.equals("G")){s = s + "G"; temp = "";}
            if(temp.equals("()")){s = s+"o";temp = "";}
            if(temp.equals("(al)")){s = s+"al";temp = "";}
        }
        return s;
    }
}
