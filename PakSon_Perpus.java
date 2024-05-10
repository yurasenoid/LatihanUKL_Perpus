package com.mycompany.pakson_perpus;
import java.util.ArrayList;
import java.util.Scanner;

public class PakSon_Perpus {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data siswa
        ArrayList<String> namaSiswa = new ArrayList<>();
        ArrayList<String> alamatSiswa = new ArrayList<>();
        ArrayList<String> teleponSiswa = new ArrayList<>();
        ArrayList<Boolean> statusSiswa = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            namaSiswa.add("Siswa " + (i+1));
            alamatSiswa.add("Alamat " + (i+1));
            teleponSiswa.add("Telepon " + (i+1));
            statusSiswa.add(true); // Awalnya semua siswa bisa meminjam
        }
        Siswa siswa = new Siswa(namaSiswa, alamatSiswa, teleponSiswa, statusSiswa);

        // Data buku
        ArrayList<String> namaBuku = new ArrayList<>();
        ArrayList<Integer> stokBuku = new ArrayList<>();
        ArrayList<Integer> hargaBuku = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            namaBuku.add("Buku " + (i+1));
            stokBuku.add(10); // Awalnya setiap buku memiliki stok 10
            hargaBuku.add((i+1) * 1000); // Harga buku bervariasi
        }
        Buku buku = new Buku(namaBuku, stokBuku, hargaBuku);

        // Input ID siswa dan ID buku untuk peminjaman
        System.out.print("Masukkan ID siswa (1-5): ");
        int idSiswaPinjam = scanner.nextInt() - 1; // Mengurangi 1 karena index dimulai dari 0
        System.out.print("Masukkan ID buku (1-10): ");
        int idBukuPinjam = scanner.nextInt() - 1; // Mengurangi 1 karena index dimulai dari 0
        System.out.print("Jumlah buku yang dipinjam: ");
        int jumlahBukuPinjam = scanner.nextInt();

        // Jika stok buku mencukupi dan siswa boleh meminjam, lakukan peminjaman
        if (idSiswaPinjam >= 0 && idSiswaPinjam < 5 && idBukuPinjam >= 0 && idBukuPinjam < 10 &&
                stokBuku.get(idBukuPinjam) >= jumlahBukuPinjam && statusSiswa.get(idSiswaPinjam)) {
            // Kurangi stok buku
            int stokSaatIni = stokBuku.get(idBukuPinjam);
            stokBuku.set(idBukuPinjam, stokSaatIni - jumlahBukuPinjam);

            // Ubah status siswa
            statusSiswa.set(idSiswaPinjam, false);

            System.out.println("Peminjaman berhasil oleh " + namaSiswa.get(idSiswaPinjam) + " atas buku " + namaBuku.get(idBukuPinjam) + ".");
        } else {
            System.out.println("Peminjaman gagal. Stok tidak mencukupi atau siswa tidak boleh meminjam.");
        }

        scanner.close();
    }
}


