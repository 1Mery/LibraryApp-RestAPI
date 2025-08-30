package com.example.Library.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @PostMapping("/{bookId}")
    public String borrowBook(@RequestBody Map<String,String>body, @PathVariable int id){
        return id+"numaralı kitap"+" "+body.get("Öğrenci adı")+"tarafından ödünç alındı.";
    }

    @PostMapping("/student/{name}")
    public Map<String,String> borrowStudent(@PathVariable String name){
        Map<String,String> book= new HashMap<>();
        book.put("student",name);
        book.put("books","çalıkuşu,simyacı");
        return book;
    }

    @GetMapping("/{bookId}/return")
    public String returnBook(@PathVariable int bookId){
        return bookId+"-> Id numaraları kitap iade edilmiştir.";
    }
}
