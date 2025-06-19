package level2.exercise1.model;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        return new ByteReader(scanner).read(message);
    }

    public static int readInt(String message) {
        return new IntReader(scanner).read(message);
    }

    public static float readFloat(String message) {
        return new FloatReader(scanner).read(message);
    }

    public static double readDouble(String message) {
        return new DoubleReader(scanner).read(message);
    }

    public static char readChar(String message) {
        return new CharReader(scanner).read(message);
    }

    public static String readString(String message) {
        return new StringReader(scanner).read(message);
    }

    public static boolean readYesNo(String message) {
        return new YesNoReader(scanner).read(message);
    }
}