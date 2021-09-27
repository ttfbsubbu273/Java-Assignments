import java.util.*;

public class ListTrim {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lists = strings.listIterator(); lists.hasNext(); ) {
            lists.set(lists.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" hello ", " my ", " world ", " I am here ");
        listTrim(l);
        for (String value : l) {
            System.out.format("\"%s\"%n", value);
        }
    }
}