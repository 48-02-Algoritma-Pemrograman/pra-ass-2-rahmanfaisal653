 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static int uangLembur(int jamLembur){
        int tunjangan = 0;
        if (jamLembur < 5) {
            tunjangan = 40000;
        }
        else if (jamLembur >= 5 && jamLembur <= 10) {
            tunjangan = 50000;
        }
        else{
            tunjangan = 75000;
        }

        return tunjangan;
    }

    public static int gaji(){
        int gaji = 0;
        if (masaKerja < 5) {
            gaji = 5000000;
        }
        else if (masaKerja >= 5 && masaKerja <= 10) {
            gaji = 7500000;
        }
        else{
            gaji = 10000000;
        }

        return gaji;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("masukan  masa kerja = ");
        masaKerja = input.nextInt();

        System.out.println("masukan  jam lembur = ");
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */

        int totalGaji = gaji() + uangLembur(jamLembur);
        System.err.println("ini adalah total gaji anda = " + totalGaji);

        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
