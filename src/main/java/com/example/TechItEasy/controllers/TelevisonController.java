package com.example.TechItEasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class TelevisionController {

//  - De **TelevisionsController** bevat:
//  - een GET-request voor alle televisies
//  - een GET-request voor 1 televisie
//  - een POST-request voor 1 televisie
//  - een PUT-request voor 1 televisie
//  - een DELETE-request voor 1 televisie

    @GetMapping("/televisions")
    public ResponseEntity<?> getTelevisions(){
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable int id){
        return ResponseEntity.ok("ok");
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> postTelevision(@RequestBody String televisonName){
        return ResponseEntity.created();
    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> putTelevision(@PathVariable int id, @RequestBody String televisionName){
        return ResponseEntity.ok();
    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent();
    }
}
