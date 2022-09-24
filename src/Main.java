import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a,jumlahgenap, jumlahganjil, jumlahfibo, awal, sekarang, fibo,nama;
        Double NIM;
        String Nama;
        boolean condition = true;

        while (condition) {
            System.out.print("Masukkan Nama Anda (1..25) : ");
            Nama = Input.next();
            Nama = Input.nextLine();
            nama = Nama.length();
            while(nama < 1 || nama > 25) {
                System.out.print("Tolong Masukan nama Anda Sesuai dengan ketentuan : ");
                Nama = Input.nextLine();
                nama = Nama.length();
             }

        //NIM
            System.out.print("Masukkan NIM Anda (HARUS 10 KARAKTER) : ");
            NIM = Input.nextDouble();
            while (NIM < 999999999d || NIM > 9999999999d) {
                System.out.print("Masukkan NIM Anda (HARUS 10 KARAKTER) : ");
                NIM = Input.nextDouble();
            }
            System.out.println();
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Registrasi Sukses . .");
            System.out.printf("Selamat Datang %s (NIM : %.0f). . ^^v \n",Nama, NIM);
            System.out.println();
            System.out.println("Mari Belajar macam-macam deret bilangan. .");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.print("Masukan Sembarang Angka (5..20) : ");
            a = Input.nextInt();
            while (a < 5 || a > 20) {
                System.out.print("Masukan Sembarang Angka Yang Sesuai (5 .. 20)");
                a = Input.nextInt();
            }
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Deret Bilangan");
            System.out.println("################");
            System.out.println();
            System.out.printf("%d Bilangan Genap : \n", a);

            //pengulangan genap ganjil
            for (int i = 2; i <= a * 2; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
            jumlahgenap = 0;
            jumlahganjil = 0;

            for (int i = 2; i <= a * 2; i++) {
                if (i % 2 == 0) {
                    jumlahgenap += i;
                } else {
                    jumlahganjil += i;
                }
            }
            System.out.print("Hasil Penjumlahan : " + jumlahgenap);

            //pengulangan ganjil
            System.out.printf("%d Bilangan Ganjil :\n", a);
            for (int i = 1; i <= a * 2; i++) {
                if (i % 2 == 1)
                    System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("Hasil Penjumlahan : " + jumlahganjil);
            System.out.println();

            //bilangan fibonaci
            awal = 0;
            sekarang = 1;
            System.out.printf("%d Bilangan Fibonacci :\n", a);
            for (int i = 1; i <= a; i++) {
                System.out.print(sekarang + " ");
                fibo = awal + sekarang;
                awal = sekarang;
                sekarang = fibo;
            }

            System.out.println("");
            awal = 0;
            sekarang = 1;
            jumlahfibo = 0;
            for (int i = 1; i <= a; i++) {
                fibo = awal + sekarang;
                awal = sekarang;
                sekarang = fibo;
            }
            jumlahfibo += sekarang;
            System.out.println("Hasil Penjumlahan: " + jumlahfibo);
            System.out.println("");
            System.out.println("Anda Mau Ulang ? (y/t)");
            String Pertanyaan = new Scanner(System.in).next();
            if (Pertanyaan.equals("t")) {
                condition = false;
            }else if (Pertanyaan.equals("y")) {
                condition = true;
            }else {
                continue;
            }
        }
    }
}