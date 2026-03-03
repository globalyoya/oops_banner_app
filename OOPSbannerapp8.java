import java.util.HashMap;
import java.util.Map;

public class OOPSbannerapp8 {
    private static final Map<Character, String[]> charRegistry = new HashMap<>();

    static {
        charRegistry.put('O', new String[]{"   ***   ", " **   ** ", " **   ** ", " **   ** ", " **   ** ", " **   ** ", "   ***   "});
        charRegistry.put('P', new String[]{"*******   ", "**     ** ", "**     ** ", "**     ** ", "*******   ", "**        ", "**        "});
        charRegistry.put('S', new String[]{"  *******", "**       ", "**       ", "  ****** ", "       **", "       **", "******* "});
    }
    public static void renderBanner(String word) {
        for (int i = 0; i < 7; i++) {
            StringBuilder rowOutput = new StringBuilder();

            for (char c : word.toUpperCase().toCharArray()) {
                if (charRegistry.containsKey(c)) {
                    rowOutput.append(charRegistry.get(c)[i]).append("  ");
                }
            }
            System.out.println(rowOutput.toString());
        }
    }
    public static void main(String[] args) {
        String input = "OOPS"; 
        renderBanner(input);
    }
}