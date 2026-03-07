public class OOPSBannerAppUC7 {

    // INNER CLASS
    static class CharacterPattern {
        char ch;
        String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        // Print OOPS
        for (int i = 0; i < 7; i++) {
            System.out.println(
                O.pattern[i] + "  " +
                O.pattern[i] + "  " +
                P.pattern[i] + "  " +
                S.pattern[i]
            );
        }
    }
}