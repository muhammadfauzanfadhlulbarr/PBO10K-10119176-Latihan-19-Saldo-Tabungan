import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Saldo tabungan
 */
public class Latihan19 {
    public static void main(String[] args) {
        System.out.print("Saldo Awal : Rp.");
        int saldo = new Scanner(System.in).nextInt();

        System.out.print("Bunga/bulan(%) :");
        int bunga = new Scanner(System.in).nextInt();

        System.out.print("Lama :");
        int lama = new Scanner(System.in).nextInt();
        int i;
        for(i=1;i<=lama;i++){
            saldo = saldo + (saldo*bunga/100);
            System.out.println("Saldo di bulan ke-"+ i + " Rp." + saldo );
        }

    }
}
