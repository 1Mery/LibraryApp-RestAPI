package com.example.Library.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, String>body){
        return "Yeni kullanıcı:"+ body.get("name");
    }

    @PostMapping("/login")
    public String registerLogin(@RequestBody Map<String, String>body){
        return "Başarılı giriş yapıldı.Token= "+body.get("token");
    }

}
