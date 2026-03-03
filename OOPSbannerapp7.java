class CharacterPattern {
    char letter;
    String[] pattern;
    public CharacterPattern(char letter, String[] pattern) {
        this.letter = letter;
        this.pattern = pattern;
    }
    public String getLine(int lineIndex) {
        return pattern[lineIndex];
    }
}

public class OOPSbannerapp7 {
    public static void main(String args[]) {
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "   ***   ", " **   ** ", " **   ** ", " **   ** ", " **   ** ", " **   ** ", "   ***   "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "*******   ", "**     ** ", "**     ** ", "**     ** ", "*******   ", "**        ", "**        "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            "  *******", "**       ", "**       ", "  ****** ", "       **", "       **", "  ****** "
        });

        CharacterPattern[] word = {charO, charO, charP, charS};

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getLine(i)).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}