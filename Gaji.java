import java.util.Scanner;

public class Gaji {
    public static int masaKerja;

    public static int hitungGaji() {

        if (masaKerja < 5) {
            return 5000000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            return 7500000;
        } else {
            return 10000000;
        }
    }

    public static int uangLembur(int jamLembur) {
        int tunjangan;

        if (masaKerja < 5) {
            tunjangan = 40000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tunjangan = 50000;
        } else {
            tunjangan = 75000;
        }

        return tunjangan * jamLembur;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */

        int totalUangLembur = uangLembur(jamLembur);
        int totalHitungGaji = hitungGaji();

        int totalGaji = totalHitungGaji + totalUangLembur;
        System.out.println(totalGaji);

        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);

    }

}
