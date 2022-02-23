package com.example.microservices;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 /* tambahkan anotasi @RestController di atas deklarasi class InventarisController yang berguna untuk membuat Restful controller */
 @RestController
 public class InventarisController {
     /* buat method getInventaris() dengan anotasi @GetMapping("/inventaris") sebagai endpoint */
        @GetMapping("/inventaris")
    public List<Inventaris> getInventaris() {
        DataDummy dummy = new DataDummy();
        return dummy.generateDummyData();
    }
        
    @GetMapping("/inventaris/{id}")
    public Inventaris getItemInventoris(@PathVariable int id) {
        DataDummy dummy = new DataDummy();
        return dummy.generateDummyData().get(id);
    }
 }