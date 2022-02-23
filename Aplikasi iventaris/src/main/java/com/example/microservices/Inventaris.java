package com.example.microservices;

public class Inventaris {
     int id;
     String nama;
     int harga;
     int jumlah;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getNama() {
         return nama;
     }

     public void setNama(String nama) {
         this.nama = nama;
     }

     public int getHarga() {
         return harga;
     }

     public void setHarga(int harga) {
         this.harga = harga;
     }

     public int getJumlah() {
         return jumlah;
     }

     public void setJumlah(int jumlah) {
         this.jumlah = jumlah;
     }
        
     public Inventaris(int id, String nama, int harga, int jumlah) {
         this.id = id;
         this.nama = nama;
         this.harga = harga;
         this.jumlah = jumlah;
     }
 }