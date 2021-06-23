package com.example.testingbarang.database;

import java.io.Serializable;

public class Barang implements Serializable{
    String nama;
    String telpon, kode;

    public Barang() {
    }

    public Barang(String nama, String telpon) {
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    @Override
    public String toString() {
        return "Teman{" +
                "nama='" + nama + '\'' +
                ", telpon='" + telpon + '\'' +
                '}';
    }
}