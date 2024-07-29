package com.kingsman.oauth2.exampleOAuth2_resourceServer.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/resources")
public class ResourceController {
    
    @GetMapping("/user")
    public ResponseEntity<String> read_user(Authentication authentication){
        return ResponseEntity.ok("The user can read. "+authentication.getAuthorities());
    }

    @PostMapping("/user")
    public ResponseEntity<String> write_user(Authentication authentication){
        return ResponseEntity.ok("The user can write. "+authentication.getAuthorities());
    }
    
}
