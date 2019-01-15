public class Utils {
    public static Integer getInteger(String string) {
        try {
            return Integer.valueOf(string);
        } catch(Exception e) {
        }

        return null;
    }
}
