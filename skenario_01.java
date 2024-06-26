import java.util.*;

public class skenario_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jawaban = ""; // input

        System.out.print("Masukkan program studi terbaik di Universitas Prima Indonesia: ");
        jawaban = sc.nextLine();

        if (jawaban.equalsIgnoreCase("Sistem Informasi")) {
            System.out.println("BENAR");
        } else {
            System.out.println("COBA LAGI");
        }

        sc.close();

    }
}