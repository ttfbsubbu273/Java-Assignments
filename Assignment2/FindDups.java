import java.util.*;

public class FindDups {

    static final Comparator<String> IGNORE_CASE_ORDER
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> setvalue = new TreeSet<String>(IGNORE_CASE_ORDER);
        for (String stringone : args) {
            setvalue.add(stringone);
        }
        System.out.println(setvalue.size() + " distinct words: " + setvalue);
    }
}