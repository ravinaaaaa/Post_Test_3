package main;

import java.util.Scanner;
import service.service;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        service Service = new service();
        int pilihan;

        do {
            System.out.println("\n=== MENU DESTINASI WISATA ===");
            System.out.println("1. Lihat Daftar Destinasi");
            System.out.println("2. Tambah Destinasi");
            System.out.println("3. Ubah Destinasi");
            System.out.println("4. Hapus Destinasi");
            System.out.println("5. Cari Destinasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Harus angka!, coba lagi: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> Service.tampilkanDaftar();
                case 2 -> Service.tambahDestinasi();
                case 3 -> Service.ubahDestinasi();
                case 4 -> Service.hapusDestinasi();
                case 5 -> Service.cariDestinasi();
                case 6 -> System.out.println("Terima Kasih <3...");
                default -> System.out.println("Menu tidak valid!");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}