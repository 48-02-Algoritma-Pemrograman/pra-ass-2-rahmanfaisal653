import java.util.Scanner;
import java.util.ArrayList;

public class Hitung {

    public static ArrayList<Integer> data = new ArrayList<>();

    public static int minimal(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer angka : list) {
            if (angka < min) {
                min = angka;
            }
        }
        return min;
    }

    public static int maximal(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer angka : list) {
            if (angka > max) {
                max = angka;
            }
        }
        return max;
    }

    public static double ratarata(ArrayList<Integer> list) {
        double rata = 0;
        for (int angka : list) {
            rata += angka;
        }
        return rata / list.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Pekerjaan anda mulai dari sini */

        String pilihan;
        do {
            int dataInput = input.nextInt();
            data.add(dataInput);
            System.out.println("Input lagi? Y/T");
            pilihan = input.next();

        } while (pilihan.equalsIgnoreCase("Y"));

        System.out.println("Nilai minimal : " + minimal(data));
        System.out.println("Nilai maksimal : " + maximal(data));
        System.out.println("Nilai rata-rata : " + ratarata(data));

        /* Pekerjaan anda berakhir sini */

        System.out.println(Hitung.class.getDeclaredMethods().length);
        System.out.println(Hitung.class.getDeclaredFields().length);
    }
}
