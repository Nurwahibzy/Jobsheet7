package Jobsheet7;

import java.util.Scanner;

public class DoWhileCuti21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);

                } else  {
                    System.out.println("Jumlah hari anda melebihi jatah cuti");
                    System.out.print("Masukkan jumlah hari dengan benar: ");
                    jumlahHari = sc.nextInt();
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } 

            }else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }

        } while (jatahCuti > 0);
        sc.close();
    }

}
