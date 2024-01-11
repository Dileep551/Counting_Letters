import java.util.HashMap;
import java.util.Map;

/*16.14 (Counting Letters)  Count the number of
occurrences of each letter rather
than of each word. For example,
the string "HELLO THERE" contains two Hs, three Es, two Ls, one O, one T and one R.
Display the results.
 */
public class CountLetters {


    public char[] getCharArray(String value) {

        return value.replaceAll("\\s", "").toUpperCase().toCharArray();

    }

    public Map<Character, Integer> getCountChar(String value) {

        Map<Character, Integer> countChar = new HashMap<>();


        char[] charValue = value.toCharArray();

        int count = 1;

        for (char charVal : charValue) {

            Integer integer = countChar.get(charVal);
            if (integer == null) {

                countChar.put(charVal, 1);

            } else {
                countChar.put(charVal, integer + 1);
            }

        }

        return countChar;

    }


}