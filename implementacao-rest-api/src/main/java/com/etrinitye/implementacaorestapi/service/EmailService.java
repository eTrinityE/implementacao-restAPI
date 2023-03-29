package com.etrinitye.implementacaorestapi.service;

import com.etrinitye.implementacaorestapi.models.Email;
import com.etrinitye.implementacaorestapi.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    public Optional<Email> findById(Long id) {
        return emailRepository.findById(id);
    }

    public Email save(Email email) {
        if (!email.getTo().isBlank()) {
            return emailRepository.save(email);
        }
        return null;
    }

    public Email update(Email email) {
        var dbEmail = emailRepository.findById(email.getId());
        if (dbEmail.isPresent()) {
            return emailRepository.save(email);
        }
        return null;
    }

    public String delete(Long id) {
        var dbEmail = emailRepository.findById(id);
        if (dbEmail.isPresent()) {
            emailRepository.deleteById(id);
            return "Email do ID " + id + " foi deletado!";
        } else {
            return "ID " + id + " não encontrado";
        }
    }
}
