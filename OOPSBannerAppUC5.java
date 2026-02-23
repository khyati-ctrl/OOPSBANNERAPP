public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Declare and initialize array using String.join()
        String[] banner = {

            String.join("", "     **        **     ******     *****"),
            String.join("", "   **  **    **  **   **  **    **   **"),
            String.join("", "  **    **  **    **  **  **    **     "),
            String.join("", "  **    **  **    **  ******      **   "),
            String.join("", "  **    **  **    **  **           **  "),
            String.join("", "   **  **    **  **   **       **   ** "),
            String.join("", "     **        **     **        *****  ")
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}