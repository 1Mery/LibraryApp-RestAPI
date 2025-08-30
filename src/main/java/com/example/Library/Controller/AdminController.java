package com.example.Library.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @PostMapping("/borrows")
    public List<Map<String,String>> borrowBook(){
        List<Map<String,String>> borrows= new ArrayList<>();
        Map<String,String> student1= new HashMap<>();
        student1.put("Name","Meryem");
        student1.put("Ödünç Kitap","Çalıkuşu");
        Map<String,String> student2= new HashMap<>();
        student2.put("Name","Miraç");
        student2.put("Ödünç Kitap","Sefiller");
        borrows.add(student1);
        borrows.add(student2);
        return borrows;
    }

    @GetMapping("/stats")
    public Map<String,Object> stats(){
        Map<String,Object> statistic= new HashMap<>();
        statistic.put("Toplam kitap",546);
        statistic.put("Aktif öğrenci",124);
        statistic.put("Ödünç alınan kitap",136);
        return statistic;
    }


}
