import java.util.Scanner;

public class skenario_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of available comic book titles
        String[] availableTitles = { "Death Note", "Attack on Titan", "Jujutsu Kaisen" };

        // Ask user to input the comic book title
        System.out.print("Masukkan judul buku komik: ");
        String title = scanner.nextLine();

        // Check if the title is available
        boolean isAvailable = false;
        for (String availableTitle : availableTitles) {
            if (availableTitle.equalsIgnoreCase(title)) {
                isAvailable = true;
                break;
            }
        }

        // If the title is available, ask for the volume and print "BUKU TERSEDIA"
        if (isAvailable) {
            System.out.print("Masukkan volume buku komik: ");
            int volume = scanner.nextInt();
            System.out.println("BUKU TERSEDIA");
        } else {
            // If the title is not available, print "BUKU TIDAK TERSEDIA"
            System.out.println("BUKU TIDAK TERSEDIA");
        }

        scanner.close();
    }
}
