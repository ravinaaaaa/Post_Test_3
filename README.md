# Post_Test_3
<h1> 2409116078_Ravina Eka Adiya </h1>

<img width="676" height="426" alt="image" src="https://github.com/user-attachments/assets/6c51f5e4-5ed7-4238-a8c4-b0ef539134c4" />

## Penjelasan Singkat Program
Tujuan dari tema "Sistem Manajemen Daftar Destinasi Wisata Kota Jogja" adalah untuk menyediakan sarana pengelolaan informasi destinasi wisata di kota Jogja agar data lebih terorganisir, memudahkan pencarian informasi serta membantu pengguna dalam mengetahui daftar tempat wisata beserta detail harga tiketnya.

#
<h2> 1. destinasi.java</h2>

```java
package model;

public class destinasi {
```
membuat class destinasi dengan akses public di package model.

```java
private String namaDestinasi;
private int tiketDewasa;
private int tiketAnak;
```
membuat tiga atribut yang dimiliki setiap objek destinasi :
- namaDestinasi : menyimpan nama tempat wisata.
- tiketDewasa : menyimpan haarga tiket untuk pengunjung dewasa.
- tiketAnak : menyimpan harga tiket untuk anak-anak.

```java
public destinasi(String namaDestinasi, int tiketDewasa, int tiketAnak) {
        this.namaDestinasi = namaDestinasi;
        this.tiketDewasa = tiketDewasa;
        this.tiketAnak = tiketAnak;
    }
```

contructor dipanggil saat membuat objek baru di class destinasi : 
- this.namaDestinasi = namaDestinasi : menyimpan nilai yang dikirim ke parameter ke dalam atribut kelas.
- this.tiketDewasa = tiketDewasa : menyimpan harga tiket dewasa.
- this.tiketAnak = tiketAnak : menyimpan harga tiket anak.

```java
public String getNamaDestinasi() {
        return namaDestinasi;
    }

public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }
public int getTiketDewasa() {
        return tiketDewasa;
    }

public void setTiketDewasa(int tiketDewasa) {
        this.tiketDewasa = tiketDewasa;
    }
public int getTiketAnak() {
        return tiketAnak;
    }

public void setTiketAnak(int tiketAnak) {
        this.tiketAnak = tiketAnak;
    }
```

- getNamaDestinasi = digunakan untuk membaca data.
- getTiketDewasa = digunakan untuk membaca data.
- getTiketAnak = digunakan untuk membaca data.
- setNamaDestinasi = digunakan untuk mengubah data.
- setTiketDewasa = digunakan untuk mengubah data.
- setTiketAnak = digunakan untuk mengubah data.

#
<h2> 2. service.java</h2>

```java
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.destinasi;
import model.wisataAlam;
import model.wisataBudaya;

public class service {
```

membuat class service di package service.

- import ArrayList : untuk menyimpan daftar destinasi wisata.
- import Scanner : untuk membaca input dari user.
- import model.destinasi : untuk memanggil class destinasi dari package model.
- import model.wisataAlam : untuk memanggil class wisataAlam dari package model.
- import model.wisataBudaya : untuk memanggil class wisataBudaya dari package model.

```java
private ArrayList<destinasi> daftarDestinasi = new ArrayList<>();
private Scanner scanner = new Scanner(System.in);
```

- daftarDestinasi adalah tempat untuk menyimpan data destinasi wisata.
- scanner dipakai untuk input dari pengguna.

```java
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
```
constructor digunakan untuk mengisi data awal daftar destinasi wisata jogja. jadi saat program dijalankan, suda ada 8 data bawaan yang tersimpan di daftarDestinasi.

```java
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
```

kode diatas untuk menampilkan semua data destinasi dalam bentuk tabel. jika data kosong maka akan ada pesan "Belum ada data destinasi".

```java
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
```

kode diatas, pengguna bisa menambah data destinasi baru dengan menginput nama destinasi, harga tiket dewasa dan anak. setelah itu data dimasukkan ke ArrayList daftarDestinasi.

```java
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
```
kode diatas untuk mengubah data destinasi yang suda ada. langkah pertama data akan ditampilkan daftar destinasi, lalu pengguna memilih nomor destinasi yang mau di ubah. setelah itu pengguna bisa mengganti nama destinasi dan harga tiket.

```java
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
```
kode diatas ini menampilkan daftar destinasi, lalu pengguna bisa menghapus daftar destinasi yang ingin dihapus dengan memilih nomor datda destinasi nya. setelah itu data akan dihapus dari ArrayList.

```java
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
```
kode diatas untuk mencari destinasi. program akan menampilkan daftar destinasi, lalu pengguna ketik nama destinasi yang ingin dicari, jikda tidak ada hasil maka akan ditampilkan "Destinasi tidak ditemukan".

```java
private int inputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.print("Harus angka, coba lagi: ");
            scanner.next();
        }
        int angka = scanner.nextInt();
        scanner.nextLine();
        return angka;
    }
```
kode diatas digunakan untuk validasi input angka. jika pengguna salah ketik, program akan minta input ulang sampai inputan benar.

#
<h2>3. main.java</h2>

```java
package main;

import java.util.Scanner;
import service.service;

public class main {
```
membuat class main di package main.

- import scanner : digunakan untuk membaca input dari user.
- import service.service : digunakan untuk memanggil class service dari package service.

```java
public static void main(String[] args) {
```
kode diatas adalah method utama untuk titik awal program berjalan.

```java
Scanner scanner = new Scanner(System.in);
service Service = new service();
int pilihan;
```
- scanner digunakan untuk membaca input user.
- service adalah objek dari class service, digunakan untuk menjalankan semua fitur CRUD dan pencarian.
- pilihan digunakan untuk menyimpan angka pilihan menu.

```java
do {
} while (pilihan != 6);
```
kode diatas untuk menampilkan menu berulang-ulang selama pengguna tidak memilih menu keluar(6).

```java
System.out.println("\n=== MENU DESTINASI WISATA ===");
System.out.println("1. Lihat Daftar Destinasi");
System.out.println("2. Tambah Destinasi");
System.out.println("3. Ubah Destinasi");
System.out.println("4. Hapus Destinasi");
System.out.println("5. Cari Destinasi");
System.out.println("6. Keluar");
System.out.print("Pilih menu: ");
```
kode diatas untuk menampilkan pilihan menu utama untuk pengguna, disini pengguna diminta untuk memasukan atau meng input angka sesuai yang tersedia di menu.

```java
while (!scanner.hasNextInt()) {
  System.out.print("Harus angka!, coba lagi: ");
  scanner.next();
}
```
kode diatas adalah jika pengguna salah memasukan inputan, semisal pengguna memasukkan huruf atau simbol, maka program akan minta pengguna untuk input ulang.

```java
switch (pilihan) {
  case 1 -> Service.tampilkanDaftar();
  case 2 -> Service.tambahDestinasi();
  case 3 -> Service.ubahDestinasi();
  case 4 -> Service.hapusDestinasi();
  case 5 -> Service.cariDestinasi();
  case 6 -> System.out.println("Terima Kasih <3...");
  default -> System.out.println("Menu tidak valid!");
}
```
- case 1 untuk menampilkan daftar destinasi.
- case 2 untuk menambah destinasi baru.
- case 3 untuk mengubah data destinasi.
- case 4 untuk menghapus destinasi.
- case 5 untuk menghapus destinasi berdasarkan nama.
- case 6 keluar dari program.
- default jika user salah pilih menu.

```java
scanner.close();
```
kode diatas untuk menutup scanner setelah program selesai.

#
<h2>4. wisataAlam.java</h2>

```java
package model;

public class wisataAlam extends destinasi {
```
membuat class wisataAlam sebagai subclass dari class destinasi di package model.

```java
private String fasilitas;
```
menambahkan atribut khusus yang hanya dimiliki oleh destinasi wisataAlam.

```java
public wisataAlam(String namaDestinasi, int tiketDewasa, int tiketAnak, String fasilitas) {
  super(namaDestinasi, tiketDewasa, tiketAnak);
  this.fasilitas = fasilitas;
}
```
- constuctor digunakan untuk membuat objek wisataAlam baru
- this.fasilitas = digunakan untuk mengisi nilai khusus atribut fasilitas.

```java
public String getFasilitas() {
        return fasilitas;
    }

public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
```
- getFasilitas = digunakan untuk mengambil nilai dari atribut fasilitas.
- setFasilitas = digunakan untuk mengubah nilai dari atribut fasilitas.

#
<h2>5. wisataBudaya.java</h2>

```java
package model;

public class wisataBudaya extends destinasi {
```
membuat class wisataBudaya sebagai subclass dari class destinasi di package model.

```java
private String acaraAdat;
```
menambahkan atribut khusus yang hanya dimiliki oleh destinasi wisataAlam.

```java
public wisataBudaya(String namaDestinasi, int tiketDewasa, int tiketAnak, String acaraAdat) {
  super(namaDestinasi, tiketDewasa, tiketAnak);
  this.acaraAdat = acaraAdat;
}
```
- constuctor digunakan untuk membuat objek wisataBudaya baru
- this.acaraAdat = digunakan untuk mengisi nilai khusus atribut acaraAdat.

```java
public String getAcaraAdat() {
        return acaraAdat;
    }

public void setAcaraAdat(String acaraAdat) {
        this.acaraAdat = acaraAdat;
    }
```
- getAcaraAdat = digunakan untuk mengambil nilai dari atribut acaraAdat.
- setAcaraAdat = digunakan untuk mengubah nilai dari atribut acaraAdat.

#
<h2>Output</h2>

---
<img width="508" height="288" alt="image" src="https://github.com/user-attachments/assets/1ecc0daf-3677-486d-8000-78de96f78012" />

gambar diatas adalah ditampilkan pilihan Menu Utama.

---
<img width="1018" height="718" alt="image" src="https://github.com/user-attachments/assets/628d6ef9-a306-4ce9-ae15-1ee7f540b276" />

gambar diatas adalah menu untuk menampilkan seluruh daftar destinasi wisata.

---
<img width="568" height="558" alt="image" src="https://github.com/user-attachments/assets/46bafe9a-d3a4-4435-b33d-c9655781c4ae" />

gambar diatas adalah menu untuk tambah destinasi wisata. pengguna memasukan nama destinasi, tiket dewasa dan anak yang baru.

---
<img width="1022" height="892" alt="image" src="https://github.com/user-attachments/assets/8db29811-f83a-4e51-a85c-d67e0cb37552" />

gambar diatas adalah menu untuk ubah destinasi wisata. pengguna memilih nomor destinasi yang mau di ubah, lalu pengguna memasukan nama dan harga baru.

---
<img width="1040" height="806" alt="image" src="https://github.com/user-attachments/assets/a740d94a-e329-43de-abcc-72e4224c0df3" />

gambar diatas adalah menu untuk hapus destinasi wisata. pengguna memilih nomor destinasi yang mau dihapus.

---
<img width="1028" height="798" alt="image" src="https://github.com/user-attachments/assets/bb0f27c4-e4fc-475a-bf15-52c62a13ed1e" />

gambar diatas adalah menu untuk cari destinasi wisata sesuai kategori, semisal cari destinasi wisata Pantai, tinggal ketik saja Pantai maka akan muncul daftar destinasi wisata yang telah terdata.

---
<img width="510" height="314" alt="image" src="https://github.com/user-attachments/assets/1476e1e0-33ff-4eb0-8d93-d4a414cb3bef" />

gambar diatas adalah menu untuk keluar dari program.

---
