import java.util.TreeSet;

public class Exercise_1_8_Strings {

    public static TreeSet<String> generateStrings(char[] chSet, int length) {
        TreeSet<String> result = new TreeSet<>();
        if (length == 0) {
            result.add(""); 
            return result;
        }
        if (length > 1) {
            for (char c : chSet) {
                TreeSet<String> strings = generateStrings(chSet, length - 1);
                for (String s : strings) result.add(c + s);
            }
        } else for (char c : chSet) result.add(String.valueOf(c));
        return result;
    }


    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'D', 'E'};
        int count = 0;
        for (String sequence : generateStrings(characters, 4)) {
            count++;
            System.out.printf("%5d. %s%n", count, sequence);
        }

    }
}
