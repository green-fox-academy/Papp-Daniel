import java.util.ArrayList;

public class toDoPrint {
    public static void main(String[] args) {

        StringBuilder todo =new StringBuilder();

        String todoText =" - Buy milk\n";
        todo.append("My todo\n");
        todo.append(todoText);
        todo.append(" - Download game\n");
        todo.append("\t - Diablo");

        todoText = todo.toString();
        
        System.out.println(todoText);

    }
}
