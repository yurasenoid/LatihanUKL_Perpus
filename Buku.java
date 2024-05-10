package com.mycompany.pakson_perpus;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<>();
    private ArrayList<Integer> stok = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();

    public Buku(ArrayList<String> namaBuku, ArrayList<Integer> stok, ArrayList<Integer> harga) {
        this.namaBuku = namaBuku;
        this.stok = stok;
        this.harga = harga;
    }

}

