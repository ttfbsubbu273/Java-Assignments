import java.util.*;

public class Random {

    public static void main(String[] args) {
        
        List<String> arguments = Arrays.asList(args);
        Collections.shuffle(arguments);

        arguments.stream()
        .forEach(e->System.out.format("%s ",e));

        for (String arg: arguments) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}