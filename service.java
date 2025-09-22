package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.destinasi;
import model.wisataAlam;
import model.wisataBudaya;

public class service {
    private ArrayList<destinasi> daftarDestinasi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public service() {
    daftarDestinasi.add(new wisataBudaya("Candi Prambanan", 50000, 25000, "Upacara Keagamaan"));
    daftarDestinasi.add(new wisataBudaya("Keraton Yogyakarta", 15000, 7000, "Pertunjukan Tari"));
    daftarDestinasi.add(new wisataBudaya("Museum Sonobudoyo", 10000, 5000, "Pameran Sejarah & Wayang"));
    daftarDestinasi.add(new wisataBudaya("Benteng Vredeburg", 3000, 2000, "Pameran Kolonial"));
    daftarDestinasi.add(new wisataAlam("Pantai Parangtritis", 10000, 5000, "Jeep & Paralayang"));
    daftarDestinasi.add(new wisataAlam("Gunung Merapi (Lava Tour)", 150000, 100000, "Jeep Adventure"));
    daftarDestinasi.add(new wisataAlam("Goa Pindul", 40000, 30000, "Cave Tubing"));
    daftarDestinasi.add(new wisataAlam("Kaliurang", 10000, 5000, "Camping & Hiking"));
    }


    public void tampilkanDaftar() {
        if (daftarDestinasi.isEmpty()) {
            System.out.println("Belum ada data destinasi.");
            return;
        }

        System.out.println("\n+-----+---------------------------+------------+------------+");
        System.out.printf("| %-3s | %-25s | %-10s | %-10s |%n", "No", "Nama Destinasi", "Dewasa", "Anak");
        System.out.println("+-----+---------------------------+------------+------------+");

        for (int i = 0; i < daftarDestinasi.size(); i++) {
            destinasi d = daftarDestinasi.get(i);
            System.out.printf("| %-3d | %-25s | Rp%-8d | Rp%-8d |%n",
                    i + 1, d.getNamaDestinasi(), d.getTiketDewasa(), d.getTiketAnak());
        }

        System.out.println("+-----+---------------------------+------------+------------+");
    }

    public void tambahDestinasi() {
        System.out.println("Pilih jenis destinasi:");
        System.out.println("1. Wisata Alam");
        System.out.println("2. Wisata Budaya");
        System.out.print("Pilihan: ");
        int jenis = inputAngka();

        System.out.print("Nama destinasi: ");
        String nama = scanner.nextLine();
        System.out.print("Harga tiket dewasa: ");
        int dewasa = inputAngka();
        System.out.print("Harga tiket anak: ");
        int anak = inputAngka();

        System.out.println("Destinasi berhasil ditambahkan!");
    }

    public void ubahDestinasi() {
        tampilkanDaftar();
        if (daftarDestinasi.isEmpty()) return;

        System.out.print("Pilih nomor destinasi yang mau diubah: ");
        int pilihan = inputAngka();
        if (pilihan < 1 || pilihan > daftarDestinasi.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        destinasi d = daftarDestinasi.get(pilihan - 1);

        System.out.print("Nama baru: ");
        d.setNamaDestinasi(scanner.nextLine());
        System.out.print("Harga tiket dewasa baru: ");
        d.setTiketDewasa(inputAngka());
        System.out.print("Harga tiket anak baru: ");
        d.setTiketAnak(inputAngka());

        System.out.println("Data berhasil diperbarui!");
    }

    public void hapusDestinasi() {
        tampilkanDaftar();
        if (daftarDestinasi.isEmpty()) return;

        System.out.print("Pilih nomor destinasi yang mau dihapus: ");
        int pilihan = inputAngka();
        if (pilihan < 1 || pilihan > daftarDestinasi.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        daftarDestinasi.remove(pilihan - 1);
        System.out.println("Data berhasil dihapus!");
    }

    public void cariDestinasi() {
        tampilkanDaftar();
        if (daftarDestinasi.isEmpty()) return;

        System.out.print("Cari berdasarkan nama (contoh: 'Pantai' atau 'Candi'): ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean ditemukan = false;

        System.out.println("Hasil pencarian:");
        for (destinasi d : daftarDestinasi) {
            if (d.getNamaDestinasi().toLowerCase().contains(keyword)) {
                System.out.println("- " + d.getNamaDestinasi() +
                        " (Dewasa: Rp" + d.getTiketDewasa() +
                        ", Anak: Rp" + d.getTiketAnak() + ")");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Destinasi tidak ditemukan.");
        }
    }

    private int inputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.print("Harus angka, coba lagi: ");
            scanner.next();
        }
        int angka = scanner.nextInt();
        scanner.nextLine();
        return angka;
    }
}
