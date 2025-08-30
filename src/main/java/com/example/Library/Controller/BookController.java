package com.example.Library.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping
    public List<Map<String,String>> getAllBooks(@RequestParam(required = false) String title,
                                                @RequestParam(required = false) String author){
        List<Map<String,String>> book= new ArrayList<>();
        Map<String,String> book1= new HashMap<>();
        book1.put("title","java");
        book1.put("author","smith");
        Map<String,String> book2= new HashMap<>();
        book2.put("title","python");
        book2.put("author","jackson");
        book.add(book1);
        book.add(book2);
         return book;
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable int id){
        return "Id:"+id+" numaralı kitap.";
    }

    @PostMapping
    public Map<String,String> addBook(@RequestBody Map<String,String>body){
        Map<String,String> book= new HashMap<>();
        book.put("name",body.get("name"));
        book.put("kategori",body.get("kategori"));
         return book;
    }

    @PatchMapping("/{id}")
    public String updatebook(@RequestBody Map<String,String>body){
        return "Güncelleme yapıldı.Kitap: "+body.get("name");
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        return "Id:"+id+" numaralı kitap silindi.";

    }

}
