package com.example.githubactionsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @GetMapping()
    public ResponseEntity<String> getAllItems() {
        return ResponseEntity.ok("GET all items");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getItemById(@PathVariable Integer id) {
        return ResponseEntity.ok("GET item by id: " + id);
    }
}
