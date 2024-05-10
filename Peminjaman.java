package com.mycompany.pakson_perpus;

import java.util.ArrayList;

public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<>();
    private ArrayList<Integer> idBuku = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();

    // Konstruktor
    public Peminjaman(ArrayList<Integer> idSiswa, ArrayList<Integer> idBuku, ArrayList<Integer> banyak) {
        this.idSiswa = idSiswa;
        this.idBuku = idBuku;
        this.banyak = banyak;
    }

    // Metode lainnya sesuai kebutuhan
}
