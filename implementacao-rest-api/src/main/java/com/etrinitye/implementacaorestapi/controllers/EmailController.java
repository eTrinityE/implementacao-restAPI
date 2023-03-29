package com.etrinitye.implementacaorestapi.controllers;

import com.etrinitye.implementacaorestapi.models.Email;
import com.etrinitye.implementacaorestapi.repositories.EmailRepository;
import com.etrinitye.implementacaorestapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("email")
    public List<Email> findAll(){
        return emailService.findAll();
    }

    @GetMapping("email/{id}")
    public Optional<Email> find(@PathVariable("id") Long id){
        return emailService.findById(id);
    }

    @PostMapping("email")
    public Email save(@RequestBody Email email){
        return emailService.save(email);
    }

    @PutMapping("email")
    public Email update(@RequestBody Email email){
        return emailService.update(email);
    }

    @DeleteMapping("email/{id}")
    public String delete(@PathVariable("id") Long id){
        return emailService.delete(id);
    }
}
