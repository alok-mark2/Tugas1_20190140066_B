package com.example.microservices;

 import java.util.ArrayList;
 import java.util.List;

 public class DataDummy {
        
     public List<Inventaris> generateDummyData() {
         List<Inventaris> inventaris = new ArrayList<>();
            
         inventaris.add(new Inventaris(0, "pensil", 2500, 50));
         inventaris.add(new Inventaris(1, "penghapus", 1000, 25));
         inventaris.add(new Inventaris(2, "penggaris", 7000, 25));
         inventaris.add(new Inventaris(3, "buku", 5000, 75));
         return inventaris;
     }
 }