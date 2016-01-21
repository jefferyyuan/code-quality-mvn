import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Call this program with two arguments; a regular expression and a string. The program prints the
 * text, from the string, that matches the first capturing group in the regular expression.
 */
public class RegexExample {
    public static void main(final String[] args) {
        final String regex = args[0];
        final String content = args[1];
        // if (!RegexUtil.isRegex(regex, 1)) {
        // System.out.println("Input is not a regular expression \"" + regex + "\": "
        // + RegexUtil.regexException(regex).getMessage());
        // System.exit(1);
        // }
        final Pattern pat = Pattern.compile(regex);
        final Matcher mat = pat.matcher(content);

        if (mat.matches()) {
            if (mat.groupCount() > 0) {
                System.out.println("Group 1: " + mat.group(1));
            } else {
                System.out.println("Group: ");
            }
        } else {
            System.out.println("No match!");
        }
    }
}
