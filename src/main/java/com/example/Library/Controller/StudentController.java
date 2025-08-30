package com.example.Library.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Map<String,String>> studentList(){
        List<Map<String,String>> students= new ArrayList<>();
        Map<String,String> student1= new HashMap<>();
        student1.put("id","1");
        student1.put("name","Meryem");
        Map<String,String> student2= new HashMap<>();
        student2.put("id","2");
        student2.put("name","Miraç");
        students.add(student1);
        students.add(student2);

        return students;
    }

    @GetMapping("/{id}")
    public Map<String,Object> student(@PathVariable int id){
        Map<String,Object> student1=new HashMap<>();
        student1.put("id",id);
        student1.put("name","Meryem");
        return student1;
    }

    @PatchMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Map<String,String>body ){
        return "ID="+id+" "+"Güncel isim="+body.get("name");
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return "Öğrenci silindi.Id="+id;
    }


}
