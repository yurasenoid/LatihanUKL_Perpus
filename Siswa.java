package com.mycompany.pakson_perpus;

import java.util.ArrayList;

public class Siswa {
    private ArrayList<String> namaSiswa = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    // Konstruktor
    public Siswa(ArrayList<String> namaSiswa, ArrayList<String> alamat, ArrayList<String> telepon, ArrayList<Boolean> status) {
        this.namaSiswa = namaSiswa;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }

    // Metode lainnya sesuai kebutuhan
}

