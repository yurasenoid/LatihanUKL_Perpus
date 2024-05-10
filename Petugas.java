package com.mycompany.pakson_perpus;

import java.util.ArrayList;

public class Petugas {
    private ArrayList<String> namaKaryawan = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    // Konstruktor
    public Petugas(ArrayList<String> namaKaryawan, ArrayList<String> alamat, ArrayList<String> telepon) {
        this.namaKaryawan = namaKaryawan;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Metode lainnya sesuai kebutuhan
}
