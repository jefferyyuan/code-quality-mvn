import javax.annotation.Nullable;

public class Main {
    public static void main(final String[] args) {
        // Dead exception
        // new Exception();
        // final Integer a = null;
        // final boolean b = (a == 0);
        // if (b) {
        // throw new RuntimeException();
        // }
        // // System.out.println(b);
        // // System.out.println(a == 0);

        // final Integer a = null;
        // // final boolean b = (a == 0);
        // // System.out.println(b);
        // t(a);
        // String.format(new Object()); // error (1a)
        // final Integer x = new Integer(22);
        // final Integer y = new Integer(22);
        // System.out.println(x == y); // prints false!

        new Exception();

        // final String str = "_";
        // final String a = str.substring(0, str.lastIndexOf("_"));
        // System.out.println(a);
        // final int index = str.lastIndexOf("_") + 1;
        // System.out.println(index);
        // System.out.println(str.substring(index));
        // String.format("%y", 7);
        //
        // String.format("%y", 7); // error: invalid format string
        //
        // String.format("%d", "a string"); // error: invalid argument type for %d
        //
        // String.format("%d %s", 7); // error: missing argument for %s
        // String.format("%d", 7, 3); // warning: unused argument 3
        // String.format("{0}", 7); // warning: unused argument 7, because {0} is wrong syntax
    }

    public static void t(@Nullable final Integer a) {
        final boolean b = (a == 1);
        if (b) {
            throw new RuntimeException();
        }
    }
}
