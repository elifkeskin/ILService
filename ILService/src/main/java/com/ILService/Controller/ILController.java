package com.ILService.Controller;


import com.ILService.Model.IL;

import com.ILService.Service.ILService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api")
public class ILController {

    @Autowired
    private ILService ilService;


    @GetMapping("/iller")
    public ResponseEntity<List<IL>> getIller(){

        return  new ResponseEntity<>(ilService.getIller(), OK);
    }

    @GetMapping("/iller/{id}")
    public ResponseEntity<IL> getIl(@PathVariable String id){

       return  new ResponseEntity<>(getIlById(id), OK);
    }

    @PostMapping
    public ResponseEntity<IL> createIl(@RequestBody IL newIl ){

        return new ResponseEntity<>(ilService.createIl(newIl), CREATED);
    }

    @PutMapping("/iller/{id}")
    public ResponseEntity<Void> getIl(@PathVariable String id, @RequestBody IL newIl){

        ilService.updateIl(id, newIl);
        return new ResponseEntity<>(OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>  deleteIl(@PathVariable  String id){
        ilService.deleteIl(id);
        return new ResponseEntity<>(OK);

    }

    private IL getIlById(String Id){

      return  ilService.getIlById(Id);


    }
}

